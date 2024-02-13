#include <stdio.h>

int main() {

    int idade;

    printf("Vamos descobrir se voce eh de maior!\n");
    printf("Informe sua idade: ");
    scanf("%i", &idade);

    if (idade > 17) {
        printf("Voce eh de maior.");
    }
    else {
        printf("Voce nao eh de maior.");
    }
    
    return 0;
}