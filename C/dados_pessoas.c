#include<stdio.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int i, N, homem;
    double menor, maior, soma, media;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d",&N);

    double altura[N];
    char genero[N];

    for(i=0; i<N; i++){
        printf("Altura da %da pessoa: ", i+1);
        scanf("%lf", &altura[i]);
        limpar_entrada();
        printf("Genero da %da pessoa: ", i+1);
        scanf("%c", &genero[i]);
    }

    menor = altura[0];
    maior = altura[0];
    soma = 0;
    homem = 0;

    for(i=0; i<N; i++){
        if(altura[i]<menor){
            menor = altura[i];
        }
        if(altura[i]>maior){
            maior = altura[i];
        }
        if(genero[i]=='F'){
            soma = soma + altura[i];
        }
        if(genero[i]=='M'){
            homem++;
        }
    }

    media = soma / (N - homem);

    printf("Menor altura = %.2lf\nMaior altura = %.2lf\nMedia das alturas das mulheres = %.2lf\nNumero de homens = %d\n", menor, maior, media, homem);


    return 0;
}
