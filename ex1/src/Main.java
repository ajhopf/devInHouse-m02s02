public class Main {
    //Implemente um código copiando o array abaixo,
    //e depois imprima no console o valor dos seguintes elementos:
    //
    //int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };
    //
    //a) Imprima o valor do primeiro elemento;
    //b) Imprima o valor do último elemento;
    //c) Imprima o valor do terceiro elemento;

    public static void main(String[] args) {

        int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };

        //a)
        System.out.println("Primeiro elemento: " + arr[0]);
        //b)
        System.out.println("Último elemento: " + arr[arr.length - 1]);
        //c)
        System.out.println("Terceiro elemento: " + arr[2]);
    }
}