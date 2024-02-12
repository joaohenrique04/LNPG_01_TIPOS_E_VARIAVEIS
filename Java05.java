/**
 * 
 * java_01
 */

 import java.util.Scanner;

 public class Java05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, peso1, peso2, peso3, media;

        System.out.println("Vamos brincar de calcular média ponderada!");
        System.out.printf("Informe a primeira nota: ");
        nota1 = input.nextFloat();
        System.out.printf("E seu peso: ");
        peso1 = input.nextFloat();
        System.out.printf("Informe a segunda nota: ");
        nota2 = input.nextFloat();
        System.out.printf("E seu peso: ");
        peso2 = input.nextFloat();
        System.out.printf("Informe a terceira nota: ");
        nota3 = input.nextFloat();
        System.out.printf("E seu peso: ");
        peso3 = input.nextFloat();

        media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);

        System.out.println("A média final é: " + media);

        input.close();
    }
}