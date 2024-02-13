#include <stdio.h>

int main() {

    int numero;
    float resto;

    printf("Vamos descobrir se um numero eh par ou impar!\n");
    printf("Informe o valor: ");
    scanf("%i", &numero);

    resto = numero%2;
    
    if (resto == 0) {
        printf("O numero eh par.");
    }
    else {
        printf("O numero eh impar.");
    }
    return 0;
}