package Programa;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProgramaSorpresa {

//    creamos un Hashmap
    static HashMap<Integer, String> campeonesMundiales = new HashMap<>();


    public static void main(String[] args) throws IOException {

//  agregamos las keys y los values a nuestro Hashmap

        campeonesMundiales.put(2022, "Argentina");
        campeonesMundiales.put(2018 , "France");
        campeonesMundiales.put(2014 , "Germany");
        campeonesMundiales.put(2010 , "Spain");
        campeonesMundiales.put(2006 , "Italy");
        campeonesMundiales.put(2002 , "Brazil");
        campeonesMundiales.put(1998 , "France");

//        Recorremos nuestro Hashmap

        for (Map.Entry<Integer, String> element : campeonesMundiales.entrySet()) {
            System.out.println("Year: " + element.getKey() + " - Champion: " + element.getValue());
        }

//      Extraemos las keys en un Array

        Integer[] years = campeonesMundiales.keySet().toArray(new Integer[0]);

//      Imprimimos nuestro array
        System.out.println("World cup last years: " + Arrays.toString(years));


//        creamos un fichero y agregamos la informacion de nuestro Arrays

        PrintStream fileOut1 = new PrintStream ("lastyears.txt");
        fileOut1.println(Arrays.toString(years));
        fileOut1.close();

//        convertimos la informacion del fichero en datos que podamos copiar

        InputStream fileIn = new FileInputStream("lastyears.txt");
        byte[] datos = fileIn.readAllBytes();
        fileIn.close();

//        copiamos la informacion en un nuevo fichero


        PrintStream fileOut = new PrintStream ("lastyearscopy2.txt");
        fileOut.write(datos);
        fileOut.close();

    }
}
