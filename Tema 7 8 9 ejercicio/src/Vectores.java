import java.util.Vector;

public class Vectores {
//    Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

    public static void main(String[] args) {
        Vector<String> nombres = new Vector<>();
        nombres.add("Adrian");
        nombres.add("Laleska");
        nombres.add("Anthony");
        nombres.add("Jose");
        nombres.add("America");
        nombres.remove(1);
        nombres.remove(1);

        for (String i : nombres) {
            System.out.println(i);

        }
}
//Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

/**
 * El problema de utilizar los vectores y no determinar la capacidad estimada, radica en que cuando se supera la cacapidad predeterminada
 * se crea un nuevo vector con el doble de capacidad, creando y copiando en simultaneo los datos del vector anterior, proceso el cual
 * consume muchos recursos en el ordenador y puede no ser la forma mas optima de operar.
 */
}
