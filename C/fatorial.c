#include<stdio.h>

int main(){

    int N, i, fatorial;

    printf("Digite o valor de N: ");
    scanf("%d", &N);

    while(N>15){
        printf("Valor nao permitido. Digite novo valor de N: ");
        scanf("%d", &N);
    }

    fatorial = 1;
    for(i=n;i>0;i--){
        fatorial = fatorial * i;
    }

    printf("FATORIAL = %d\n", fatorial);

    return 0;
}
