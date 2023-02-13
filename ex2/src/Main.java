public class Main {
    public static void main(String[] args) {

        /*Implemente um código copiando o array abaixo, e
        depois imprima no console o valor dos seguintes elementos:

        double[][] notas = {
            {10, 8.5, 5.5, 9.5},
            {8.5, 7, 7.5, 6},
            {8, 9, 10, 7.5},
            {9, 9.5, 10, 8}
        };
        a) Imprima o valor da nota do primeiro elemento do terceiro array de notas.
        b) Imprima o valor da nota do segundo elemento do quarto array de notas.
        c) Imprima o valor da soma das quatro primeiras notas de cada array.
        */

        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        //a)
        System.out.println("Primeiro elemento do terceiro array: " + notas[2][0]);
        //b)
        System.out.println("Segundo elemento do quarto array: " + notas[3][1]);
        //c)
        for(int i = 0; i < notas.length; i++) {
            double soma = 0;
            for(int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            System.out.println("Soma das quatro primeiras notas do array " + (i + 1) + ": " +  soma);
        }
    }
}