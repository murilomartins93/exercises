#include<stdio.h>

void limpar_entrada() {
 char c;
 while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int i, N, qtd, cobaias, coelho, rato, sapo;
    double pcoelho, prato, psapo;
    char tipo;

    printf("Quantos casos de teste serao digitados? ");
    scanf("%d", &N);

    cobaias = 0;
    coelho = 0;
    rato = 0;
    sapo = 0;

    for(i=1;i<=N; i++){
        printf("Quantidade de cobaias: ");
        scanf("%d", &qtd);
        limpar_entrada();
        printf("Tipo de cobaia: ");
        scanf("%c", &tipo);

        switch(tipo){
        case 'C' :
            coelho = coelho + qtd;
        break;
        case 'R' :
            rato = rato + qtd;
        break;
        case 'S' :
            sapo = sapo + qtd;
        break;
        }
    }

    cobaias = coelho + rato + sapo;
    pcoelho = (double)coelho / cobaias * 100.0;
    prato = (double)rato / cobaias * 100.0;
    psapo = (double)sapo / cobaias * 100.0;

    printf("\nRELATORIO FINAL:\n");
    printf("Total: %d cobaias\n", cobaias);
    printf("Total de coelhos: %d\n", coelho);
    printf("Total de ratos: %d\n", rato);
    printf("Total de sapos: %d\n", sapo);
    printf("Percentual de coelhos: %.2lf%%\n", pcoelho);
    printf("Percentual de ratos: %.2lf%%\n", prato);
    printf("Percentual de sapos: %.2lf%%\n", psapo);

    return 0;
}
