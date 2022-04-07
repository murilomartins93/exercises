#include<stdio.h>

int main(){

    int n, i, j, maior;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    int mat[n][n];

    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    printf("MAIOR ELEMENTO DE CADA LINHA:\n");
    for(i=0; i<n; i++){
        maior = mat[i][0];
        for(j=1; j<n; j++){
            if(mat[i][j] > maior){
                maior = mat[i][j];
            }
        }
        printf("%d\n", maior);
    }

    return 0;
}
