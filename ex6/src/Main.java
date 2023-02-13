import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //Dado a lista de números:
    //
    //List<Integer> lista = Arrays.asList(1,2,3,4);
    //
    //Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> listaTriplicada = new ArrayList<>();

        for (int number:lista) {
            listaTriplicada.add(number*3);
        }

        System.out.println(listaTriplicada);
    }
}