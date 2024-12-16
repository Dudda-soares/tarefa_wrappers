import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor digite um numero: ");
        int numero1 = teclado.nextInt();
        Integer num1 = numero1;
        System.out.println(num1);

        System.out.println("Por favor digite segundo numero: ");
        byte bi = teclado.nextByte();
        Byte bi1 = bi;
        System.out.println(bi1);

        System.out.println("Por favor digite terceiro numero: ");
        double numero = teclado.nextDouble();
        Double numero2 = numero;
        System.out.println(numero2);

    }
}