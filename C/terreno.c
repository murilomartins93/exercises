#include <stdio.h>

int main()
{
   double larg, comp, valor, area, preco;

   printf("Digite a largura do terreno: ");
   scanf("%lf", &larg);

   printf("Digite o comprimento do terreno: ");
   scanf("%lf", &comp);

   printf("Digite o valor do metro quadrado: ");
   scanf("%lf", &valor);

   area = comp * larg;

   printf("Area do Terreno = %.2lf\n", area);

   preco = area * valor;

   printf("Preco do Terreno = %.2lf\n", preco);

   return 0;
}
