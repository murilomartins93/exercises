#include<stdio.h>

int main(){

    int n, i, j, soma;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    int mat[n][n];

    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    soma = 0;
    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            soma = mat[i][j] + soma;
        }
    }

    printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", soma);

    return 0;
}
