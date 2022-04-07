#include<stdio.h>

int main(){

    int senha;

    printf("Digite a senha: ");
    scanf("%d", &senha);

    while(senha != 2002){
        printf("Senha invalida! Tente novamente: ");
        scanf("%d", &senha);
    }

    printf("Acesso Permitido!\n");

    return 0;
}
