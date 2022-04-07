#include<stdio.h>

int main(){

    int x, soma;

    printf("Digite um numero inteiro: ");
    scanf("%d", &x);

    while(x != 0){
        if(x%2!=0){
            x++;
            }
    soma = 5 * x + 20;

    printf("SOMA = %d\nDigite um numero inteiro: ", soma);
    scanf("%d", &x);
    }

    return 0;
}
