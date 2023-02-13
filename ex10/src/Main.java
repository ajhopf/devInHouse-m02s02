import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    //Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
    //"diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa", como por exemplo: osso, ana, radar.
    //Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado.
    //
    //Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
    public static void main(String[] args) {
//        String string1 = "osso"; //true
//        String string1 = "ana"; // true
//        String string1 = "cachorro"; // false
        String string1 = "teste";

        List<String> array1 = List.of(string1.split(""));
        List<String> array1Invertido = new ArrayList<>();

        for (int i = array1.size() - 1; i >= 0; i-- ){
            array1Invertido.add(array1.get(i));
        }

        String stringInvertida = String.join("", array1Invertido);

        System.out.println("Palavra invertida: " + stringInvertida);

        boolean palindromo = true;

        for(int i = 0; i < array1.size(); i++) {
            if (!Objects.equals(array1.get(i), array1Invertido.get(i))) {
                palindromo = false;
                break;
            }
        }

        System.out.println("É palíndromo? " + palindromo);
    }
}