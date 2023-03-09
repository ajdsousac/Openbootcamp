
//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
//Comentario: en Venezuela, el IVA es de 16%
public class Main {
    public static void main(String[] args){
        double price = 100;
        System.out.println(getFullPrice(price));

}

public static double getFullPrice(double price) {
    return price * 1.16;
}
}