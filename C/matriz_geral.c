#include<stdio.h>
#include<math.h>

int main(){

    int n, i, j, linha, coluna;
    double soma;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    double mat[n][n];

    //entrada de dados
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%lf", &mat[i][j]);
        }
    }

    //soma positivos
    soma = 0;
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            if(mat[i][j] > 0){
            soma = soma + mat[i][j];
            }
        }
    }
    printf("\nSOMA DOS POSITIVOS: %.1lf\n", soma);

    //linha escolhida
    printf("\nEscolha uma linha: ");
    scanf("%d", &linha);
    printf("LINHA ESCOLHIDA: ");
    for(j=0; j<n; j++){
        printf("%.1lf ", mat[linha][j]);
    }

    //coluna escolhida
    printf("\n\nEscolha uma coluna: ");
    scanf("%d", &coluna);
    printf("COLUNA ESCOLHIDA: ");
    for(i=0; i<n; i++){
        printf("%.1lf ", mat[i][coluna]);
    }

    //diagonal principal
    printf("\n\nDIAGONAL PRINCIAL: ");
    for(i=0; i<n; i++){
        printf("%.1lf ", mat[i][i]);
        }

    //matriz alterada
    printf("\n\nMATRIZ ALTERADA:\n");
    for(i=0; i<n; i++){
        for(j=0; j<n; j++){
            if(mat[i][j] < 0){
            mat[i][j] = pow(mat[i][j], 2.0);
            }
            printf("%.1lf ", mat[i][j]);
        }
        printf("\n");
    }

    return 0;
}
