public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(27);
        persona1.setNombre("Adrian");
        persona1.setTelefono("+58 414 444 08 57");
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}
    class    Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad (int edad) {
            this.edad = edad;
        }
        public int getEdad() {
            return edad;
        }

        public void setNombre (String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }

        public void setTelefono (String telefono) {
            this.telefono = telefono;
        }
        public String getTelefono() {
            return telefono;
        }
    }
