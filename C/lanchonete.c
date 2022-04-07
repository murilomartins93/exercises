#include<stdio.h>

int main(){

    int cod, qtd;
    double valor, preco;

    printf("Codigo do produto comprado: ");
    scanf("%d", &cod);

    printf("Quantidade comprada: ");
    scanf("%d", &qtd);

    switch(cod){
    case 1 :
        preco = 5.00;
    break;
    case 2 :
        preco = 3.50;
    break;
    case 3 :
        preco = 4.80;
    break;
    case 4 :
        preco = 8.90;
    break;
    case 5 :
        preco = 7.32;
    break;
    }

    valor = preco * qtd;
    printf("Valor a pagar: R$%.2lf\n", valor);

    return 0;
}
