#include<stdio.h>

int main(){

    int inicio, fim, duracao;

    printf("Hora inicial: ");
    scanf("%d", &inicio);
    printf("Hora final: ");
    scanf("%d", &fim);

    if(inicio < fim){
        duracao = fim - inicio;
    }
    else{
        duracao = 24 + fim - inicio;
    }

    printf("O JOGO DUROU %d HORA(S).\n", duracao);

    return 0;
}
