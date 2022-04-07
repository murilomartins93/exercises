#include<stdio.h>

void limpar_entrada() {
 char c;
 while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int N, i, L1, L2, L3;
    double lucro, totalcompra, totalvenda, lucrototal;

    printf("Serao digitados dados de quantos produtos? ");
    scanf("%d", &N);

    char produto[N];
    double compra[N], venda[N];

    for(i=0; i<N; i++){
        printf("Produto %d:\n", i+1);
        printf("Nome: ");
        scanf("%s", &produto[i]);
        printf("Preco de compra: ");
        scanf("%lf", &compra[i]);
        printf("Preco de venda: ");
        scanf("%lf", &venda[i]);
    }

    lucro = 0;
    L1 = 0;
    L2 = 0;
    L3 = 0;

    for(i=0; i<N; i++){
        lucro = (100 * (venda[i] - compra[i]))/ compra[i];
        if(lucro < 10){
            L1++;
        }
        else if(lucro < 20){
            L2++;
        }
        else{
            L3++;
        }
        totalcompra = compra[i] + totalcompra;
        totalvenda = venda[i] + totalvenda;
    }

    lucrototal = totalvenda - totalcompra;

    printf("\nRELATORIO:\n");
    printf("Lucro abaixo de 10%%: %d\n", L1);
    printf("Lucro entre 10%% e 20%%: %d\n", L2);
    printf("Lucro acima de 20%%: %d\n", L3);
    printf("Valor total de compra: %.2lf\n", totalcompra);
    printf("Valor total de venda: %.2lf\n", totalvenda);
    printf("Lucro total: %.2lf\n", lucrototal);

    return 0;
}
