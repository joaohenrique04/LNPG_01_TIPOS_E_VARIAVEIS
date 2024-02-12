/**
 * 
 * java_01
 */

 import java.util.Scanner;

 public class Java04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Vamos descobrir se você é de maior");
        System.out.printf("Informe sua idade: ");
        idade = input.nextInt();

        if (idade >= 18)
            System.out.println("Você é de maior, fica esperto em...");
        else
            System.out.println("Você é de menor!");

        input.close();
    }
}