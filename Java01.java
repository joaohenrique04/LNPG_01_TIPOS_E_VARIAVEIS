/**
 * 
 * java_01
 */

 import java.util.Scanner;

 public class Java01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float var1, var2;

        System.out.println("Vamos brincar de Calculadora!");
        System.out.printf("Informe o primeiro valor: ");
        var1 = input.nextFloat();

        System.out.printf("Informe o segundo valor: ");
        var2 = input.nextFloat();

        System.out.println("Soma: " + (var1+var2));
        System.out.println("Subtração: " + (var1-var2));
        System.out.println("Multiplicação: " + (var1*var2));
        System.out.println("Divisão: " + (var1/var2));

        input.close();
    }
}