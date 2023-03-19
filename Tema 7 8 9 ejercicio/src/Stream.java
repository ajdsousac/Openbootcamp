//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
//La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import static java.lang.System.out;

public class Stream {
    public static void main(String[] args) throws IOException {

        PrintStream fileOut1 = new PrintStream ("archivo.txt");
        fileOut1.println("Hola Mundo");
        fileOut1.close();


        InputStream fileIn = new FileInputStream("archivo.txt");
        byte[] datos = fileIn.readAllBytes();
        fileIn.close();

        PrintStream fileOut = new PrintStream ("Copia.txt");
        fileOut.write(datos);
        fileOut.close();
    }
}
