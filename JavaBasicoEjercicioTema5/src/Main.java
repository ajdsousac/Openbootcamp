public class Main {

    public static void main(String[] args) {


        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.findAll();
        cocheCrud.delete();
        cocheCrud.save();


    }
}