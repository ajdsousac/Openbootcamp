import java.util.ArrayList;

public class ArrayListInt {

//    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
//    A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último,
//    vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
//    siempre y cuando cumplas el primer "for" de relleno.

    public static void main(String[] args) {
        // 1. creamos el ArrayList
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        //    2. realizamos el bucle para rellenarlo

        for (int i = 0; i < 10; i++){
            numeros.add(i + 1);
        }

        System.out.println(numeros);


        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);}
            }

        System.out.println(numeros);
        }
    }

