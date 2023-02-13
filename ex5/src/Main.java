public class Main {

    //Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e
    //identifique o maior e menor valor do mesmo. Imprima no console estes valores ou
    //"Não é possível calcular" qdo não for possível.
    //
    //Teste a função com as seguintes entradas:
    //
    //{56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47}
    //{1}
    //{1, -1}
    //null
    //{-2,-2,-2,-2}
    //{20,10, 30}
    public static void main(String[] args) {
        int[][] arrays = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2, -2, -2, -2},
                {20, 10, 30}
        };

        int i = 1;

        for (int[] array : arrays) {
            if (array == null || array.length == 0) {
                System.out.println("Não é possível calcular o array " + i + ".");
            } else {

                int maior = Integer.MIN_VALUE;
                int menor = Integer.MAX_VALUE;

                for(int number : array) {
                    if (maior < number) {
                        maior = number;
                    }
                    if (menor > number) {
                        menor = number;
                    }
                }

                System.out.printf("O maior e o menor número do array %d são, respectivamente: %d e %d.\n", i, maior, menor);
            }

            i++;
        }
    }
}