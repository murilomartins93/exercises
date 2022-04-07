#include<stdio.h>

int main(){

    int m, n, i, j;

    printf("Quantas linhas vai ter cada matriz? ");
    scanf("%d", &m);
    printf("Quantas colunas vai ter cada matriz? ");
    scanf("%d", &n);

    int matA[m][n], matB[m][n], matC[m][n];

    printf("Digite os valores da matriz A:\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matA[i][j]);
        }
    }

    printf("Digite os valores da matriz B:\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matB[i][j]);
        }
    }

    printf("\nMATRIZ SOMA:\n");
    for(i=0; i<m; i++){
        for(j=0; j<n; j++){
            matC[i][j] = matA[i][j] + matB[i][j];
            printf("%d ", matC[i][j]);
        }
        printf("\n");
    }

    return 0;
}
