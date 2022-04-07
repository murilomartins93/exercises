#include<stdio.h>

int main()
{
    int N, i, x, dentro, fora;

    printf("Quantos numeros voce vai digitar: ");
    scanf("%d", &N);

    dentro = 0;
    for(i=1; i<=N; i++){
        printf("Digite um numero: ");
        scanf("%d", &x);
        if(x>=10 && x<=20){
            dentro++;
        }
    }
    fora = N - dentro;
    printf("%d DENTRO\n%d FORA\n", dentro, fora);

    return 0;
}
