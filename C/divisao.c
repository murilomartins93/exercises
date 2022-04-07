#include<stdio.h>

int main(){

    int N, i, x, y;
    double divisao;

    printf("Quantos casos voce vai digitar? ");
    scanf("%d", &N);

    for(i=1;i<=N;i++){
        printf("Entre com o numerador: ");
        scanf("%d", &x);
        printf("Entre com o denominado: ");
        scanf("%d", &y);
        if(y==0){
            printf("DIVISAO IMPOSSIVEL.\n");
        }
        else{
            divisao = (double)x / y;
            printf("DIVISAO = %.2lf\n", divisao);
        }
    }
    return 0;
}
