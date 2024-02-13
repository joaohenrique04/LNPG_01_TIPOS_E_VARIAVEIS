#include <stdio.h>

int main() {

    int numero;
    float conv;

    printf("Vamos converter Celsius para Fahrenheit!\n");
    printf("Informe o valor (Celsius): ");
    scanf("%i", &numero);

    conv = (numero * 9/5) + 32;
    
    printf("O valor em Fahrenheit fica: %.1f", conv);
    return 0;
}