public class CocheCRUDImpl implements CocheCRUD {

    //Atributo
    String marca;

//    constructor

    public CocheCRUDImpl(){}
    public CocheCRUDImpl(String marca) {
        this.marca = marca;
    }

//metodos

    @Override
    public void save() {
        System.out.println("Estoy implementado el metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("Estoy implementado el metodo findAll");
    }

    @Override
    public void delete() {
        System.out.println("Estoy implementado el metodo delete");
    }

}

