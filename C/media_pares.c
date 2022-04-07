#include<stdio.h>

int main(){

    int N, i, count;
    double media, soma;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &N);

    int vet[N];

    soma = 0;
    count = 0;
    for(i=0; i<N; i++){
        printf("Digite um numero: ");
        scanf("%d", &vet[i]);
        if(vet[i]%2==0){
            soma = soma + vet[i];
            count++;
        }
    }

    media = soma / count;

    if(count!=0){
        printf("MEDIA DOS PARES = %.1lf", media);
    }
    else {
        printf("NENHUM NUMERO PAR");
    }
    
    return 0;
}