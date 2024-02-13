#include <stdio.h>

int main() {

    int var1;
    int var2;
    
    printf("Vamos brincar de Calculadora!\n");
    printf("Informe o primeiro valor: ");
    scanf("%i", &var1);
    printf("Informe o segundo valor: ");
    scanf("%i", &var2);

  printf("Soma: %i\n", (var1+var2));
  printf("Subtracao: %i\n", (var1-var2));
  printf("Multiplicacao: %i\n", (var1*var2));
  printf("Divisao: %i\n", (var1/var2));
  return 0;
}