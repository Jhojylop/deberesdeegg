import service.MenuService;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        menuService.starUp();
    }
}