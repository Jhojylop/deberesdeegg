import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        int x = 4, y = 3, z = 6, t = 8;
        Integer num = new Integer(1);
        numeros.add(x);
        numeros.add(y);
        numeros.add(z);
        numeros.add(t);
        numeros.add(num);
        numeros.remove(num);
       // numeros.remove(num);
        for (Integer numeritos : numeros) {
            System.out.println(numeritos);
        }
        Iterator iterator = numeros.iterator();

    }
}