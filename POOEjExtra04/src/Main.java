import service.NifService;

public class Main {
    public static void main(String[] args) {
        NifService nifService = new NifService();
        nifService.crearNif();
        nifService.mostrarNif();
    }
}