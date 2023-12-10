import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static final int PORT = 12345;
    private List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        new ChatServer().startServer();
    }

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler clientHandler = new ClientHandler(clientSocket, clients);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;
        private List<ClientHandler> clients;
        private BufferedReader reader;
        private PrintWriter writer;
        private String username;

        public ClientHandler(Socket clientSocket, List<ClientHandler> clients) {
            this.clientSocket = clientSocket;
            this.clients = clients;
            try {
                this.reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                this.writer = new PrintWriter(clientSocket.getOutputStream(), true);
                this.username = reader.readLine();
                broadcast(username + " has joined the chat.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String clientMessage;
                while ((clientMessage = reader.readLine()) != null) {
                    if (clientMessage.startsWith("/private")) {
                        sendPrivateMessage(clientMessage);
                    } else {
                        broadcast(username + ": " + clientMessage);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                    clients.remove(this);
                    broadcast(username + " has left the chat.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void broadcast(String message) {
            for (ClientHandler client : clients) {
                client.writer.println(message);
            }
        }

        private void sendPrivateMessage(String message) {
            //Codigo para enviar mensajes privados "/private username mensaje"
            String[] parts = message.split(" ", 3);
            if (parts.length == 3) {
                String recipientUsername = parts[1];
                String privateMessage = parts[2];
                for (ClientHandler client : clients) {
                    if (client.username.equals(recipientUsername)) {
                        // Envia el mensaje privado al destinatario
                        client.writer.println("(Private from " + username + "): " + privateMessage);
                        // Notifica el mensaje privado enviado
                        writer.println("(Private to " + recipientUsername + "): " + privateMessage);
                        return;
                    }
                }
                // Notifica si el usuario esta 
                writer.println("User " + recipientUsername + " not found.");
            }
        }
    }
}

