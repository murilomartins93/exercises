#include<stdio.h>
#include<string.h>

void ler_texto(char *buffer, int length) {
 fgets(buffer, length, stdin);
 strtok(buffer, "\n");
}

void limpar_entrada() {
 char c;
 while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int i, N, maior, maisvelho;

    printf("Quantas pessoas voce vai digitar? ");
    scanf("%d", &N);

    int idade[N];
    char nome[N][50];

    for(i=0; i<N; i++){
        printf("Dados da %da pessoa:\n", i+1);
        printf("Nome: ");
        limpar_entrada();
        ler_texto(nome[i], 50);
        printf("Idade: ");
        scanf("%d", &idade[i]);
    }

    maior = idade[0];

    for(i=0; i<N; i++){
        if(idade[i] > maior){
            maior = idade[i];
            maisvelho = i;
        }
    }

    printf("PESSOA MAIS VELHA = %s", nome[maisvelho]);

    return 0;
}
