#include<stdio.h>

int main() {

    int M, N, i, j;

    //entrada de dados
    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);

    double mat[M][N], vet[M];

    //leitura da matriz
    for(i=0; i<M; i++){
    printf("Digite os elementos da %da. linha:\n", i+1);
        for(j=0; j<N; j++){
            scanf("%lf", &mat[i][j]);
        }
    }

    //geracao do vetor
    for(i=0; i<M; i++){
       double soma = 0;
       for(j=0; j<N; j++){
            soma = mat[i][j] + soma;
       }
       vet[i] = soma;
    }

    //impressao do vetor
    printf("VETOR GERADO:\n");
    for(i=0; i<M; i++){
       printf("%.1lf\n", vet[i]);
    }
    return 0;
}
