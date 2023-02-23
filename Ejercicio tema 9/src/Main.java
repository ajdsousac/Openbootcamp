public class Main {
    /// En esa clase aprendemos a heredar clases y clase abstracta
    public static void main(String[] args) {
       Coche coche = new Coche();
       coche.diHola();
        coche.sumaNumeros(2.3, (int)4);
    }
}
 class vehiculo {
     int velocidadMAxima;

     public void diHola() {
         System.out.println("Hola !!");
     }
 }
  class Coche extends vehiculo{
      public void diHola() {
          System.out.println("Soy un coche");
      }
      public int sumaNumeros (int a, int b) {
          System.out.println("Soy el suma numeros de INT");

          return a + b;

      }
      public float sumaNumeros (float a, float b) {
          System.out.println("Soy el suma numeros de float");

          return a + b * (float)9.0;
      }
      public void sumaNumeros (double a, double b) {
          System.out.println("Soy el suma numeros de double");

          System.out.println("El resultado es: " + (a + b));
      }

      }








