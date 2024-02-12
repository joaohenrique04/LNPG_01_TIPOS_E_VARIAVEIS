/**
 * 
 * java_01
 */

 import java.util.Scanner;

 public class Java03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.println("Vamos converter Celsius para Fahrenheit!");
        System.out.printf("Informe o valor em Celsius: ");
        celsius = input.nextFloat();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Em Fahrenheit: " + fahrenheit + " ºF");

        input.close();
    }
}