#include<stdio.h>

int main()
{

    int i, N;
    double soma, media;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    double vet[N];

    for(i=0; i < N; i++)
    {
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
    }

    soma = 0;
    for(i=0; i < N; i++)
    {
        soma = vet[i] + soma;
    }

    media = soma / N;

    printf("\nVALORES = "); // vetor
    for(i=0; i < N; i++)
    {
        printf("%.1lf ", vet[i]);
    }

    printf("\nSOMA = %.2lf", soma); // soma
    printf("\nMEDIA = %.2lf", media); // media

    return 0;
}
