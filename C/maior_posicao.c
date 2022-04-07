#include<stdio.h>

int main(){

    int n, pos;
    double maior;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    double vet[n];

    for (int i=0; i<n; i++){
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
        }

    maior = vet[0];
    for (int i=0; i<n; i++){
        if(vet[i]>maior){
            maior = vet[i];
            pos = i;
            }
        }

    printf("\nMAIOR VALOR = %.1lf\nPOSICAO DO MAIOR VALOR = %d\n", maior, pos);

    return 0;
}
