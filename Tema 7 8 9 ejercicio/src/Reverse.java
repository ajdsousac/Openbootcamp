import java.util.Scanner;
//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

public class Reverse {
      public static void main(String[] args) {

            String cadena;
            String cadenaInv = "";

            Scanner palabra = new Scanner(System.in);
            System.out.println("Ingrese la palabra a invertir:\n");
            cadena=palabra.nextLine();

            for (int i = cadena.length() -1; i >= 0; i--) {
                  cadenaInv += cadena.charAt(i);
            }

            System.out.println("La palabra invertida es: " + cadenaInv);


      }
}

