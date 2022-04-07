#include<stdio.h>

int main() {

    int qtd;
    double preco, dinheiro, troco;

    printf("Preco unitario do produto: ");
    scanf("%lf", &preco);
    printf("Quantidade comprada: ");
    scanf("%d", &qtd);
    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiro);

    troco = dinheiro - (qtd * preco);

    if(troco < 0){
        troco = troco * (-1);
        printf("DINHEIRO INSUFICIENTE. FALTAM %.2lf REAIS.\n", troco);
    }
    else {
        printf("TROCO = %.2lf\n", troco);
    }

    return 0;
}
