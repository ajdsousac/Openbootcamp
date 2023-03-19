//    Crea una función DividePorCero. Esta, debe generar una excepción
//    ("throws") a su llamante del tipo ArithmeticException
//    que será capturada por su llamante (desde "main", por ejemplo).
//    Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
//    Finalmente, mostraremos en cualquier caso: "Demo de código".


public class Divideporcero {
    public static void main(String[] args) {
        try {
            divideCero(5);
        }catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de código");
    }


    public static void divideCero(int numero1) throws ArithmeticException {
        int result = numero1 / 0;
        System.out.println(result);

    }
}

