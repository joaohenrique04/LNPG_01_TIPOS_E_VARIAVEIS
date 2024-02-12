/**
 * 
 * java_01
 */

 import java.util.Scanner;

 public class Java02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float numero, resto;

        System.out.println("Vamos descobrir se um número é par ou ímpar!");
        System.out.printf("Informe o valor: ");
        numero = input.nextFloat();

        resto = numero%2;

        if (resto == 0)
            System.out.println("O valor é par!");
        else
            System.out.println("O número é ímpar!");

        input.close();
    }
}