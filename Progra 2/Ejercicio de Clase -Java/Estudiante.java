public class Estudiante {

   private String cuenta, nombre, materia, observacion;
   private int calificacion;

   public Estudiante( String cuenta, String nombre, String materia, int calificacion)
   {
      this.cuenta = cuenta;
      this.nombre = nombre;
      this.materia = materia;

      if (( calificacion > 100) || (calificacion < 0))
      {
         this.calificacion = 0;
         System.out.println("LOS DATOS INGRESADOS SON INCORRECTOS");
      }
      
      this.calificacion = calificacion;
   }
  
   public void establecercuenta( String cuenta)
   {
      this.cuenta = cuenta;
   }

   public String obtenercuenta()
   {
      return cuenta;
   }

     public void establecernombre( String nombre)
   {
      this.nombre = nombre;
   }

   public String obtenernombre()
   {
      return nombre;
   }

     public void establecermateria( String materia)
   {
      this.materia = materia;
   }

   public String obtenermateria()
   {
      return materia;
   }

   public void establecercalificacion( int calificacion)
   {
      this.calificacion = calificacion;
   }

   public int calificacion()
   {
      return calificacion;
   }

   public String obtenerobservacion()
   {
      if ((this.calificacion >= 65) && (this.calificacion <= 100))
      {
         this.observacion = "APROBRADO";
      }

      else
      {
         if ((this.calificacion >= 0) && (this.calificacion <= 65))
         {
            this.observacion = "REPROBADO";
         }
      }
      return this.observacion;
   } 
}
