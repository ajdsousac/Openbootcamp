public class ArrayBid {
//    Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.


    public static void main(String[] args) {

        int[][] arraybidi = {
                {5, 6, 7, 8, 9, 10},
                {44, 23, 32, 5}
        };

        for (int i = 0; i < arraybidi.length; i++) {
            for (int j = 0; j < arraybidi[i].length; j++) {
                System.out.println("Posicion: [" + i + "][" + j + "] contiene el valor: " + arraybidi[i][j]);
            }
        }
    }
}
