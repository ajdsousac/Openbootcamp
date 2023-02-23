/////Crea una clase Persona con las siguientes variables:
//
//La edad
//
//El nombre
//
//El teléfono
//
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
        System.out.println("A continuacion se muestra la informacion del Cliente:");
    cliente1.Nombre = ("Adrian");
        System.out.println("El Nombre del Cliente es: " + (cliente1.Nombre));
    cliente1.Edad = 20;
        System.out.println("La Edad del cliente es: " + (cliente1.Edad));
    cliente1.Telefono = ("+58-4144440857");
        System.out.println("El numero de telefono del cliente es: " + (cliente1.Telefono));
    cliente1.Credito = 5000;
        System.out.println("El credito del cliente es de: " + (cliente1.Credito));


    Trabajador trabajador1 = new Trabajador();
        System.out.println("A continuacion se muestra la informacion del trabajador:");
        trabajador1.Nombre = ("Jose");
        System.out.println("El Nombre del trabajador es: " + (trabajador1.Nombre));
        trabajador1.Edad = 35;
        System.out.println("La Edad del trabajador es: " + (trabajador1.Edad));
        trabajador1.Telefono = ("+58-4143667281");
        System.out.println("El numero de telefono del trabajador es: " + (trabajador1.Telefono));
        trabajador1.salario = 1400;
        System.out.println("El salario del trabajador es de: " + (trabajador1.salario));
    }
}
class Persona {
   int Edad = 0;
   String Nombre;
   String Telefono;
   }

class Cliente extends Persona{
    int Credito;

}
class Trabajador extends Persona{
    int salario;
}
