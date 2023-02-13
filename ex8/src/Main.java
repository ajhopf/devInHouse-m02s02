import java.util.Arrays;
import java.util.List;

public class Main {
    //Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.
    //
    //List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > 50) {
                System.out.printf("Número maior que 50! Número: %d; Índice: %d", numeros.get(i), i);
                break;
            }
        }
    }
}