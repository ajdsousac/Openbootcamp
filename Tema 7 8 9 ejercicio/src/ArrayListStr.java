import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListStr {
//    Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

public static void main(String[] args) {

//    creamos el ArrayList
    ArrayList<String> paises = new ArrayList<String>();

//    Agregamos los elementos
    paises.add("Polonia");
    paises.add("Portugal");
    paises.add("Mexico");
    paises.add("Francia");

//    recorremos el ArrayList

    for (String pais : paises) {
        System.out.println("Pais: " + pais);
    }

//    copiamos a una linkedList

    LinkedList<String> copiaPaises = new LinkedList<String>(paises);

//    recorremos la Linkedlist

    for (String copia: copiaPaises) {
        System.out.println("Estamos copiando el pais: " + copia);
    }





}
}
