#include<stdio.h>

int main(){

    int i, N;
    double x1, x2, x3, media;

    printf("Quantos casos voce vai digitar? ");
    scanf("%d", &N);

    for(i=1;i<=N;i++){
        printf("Digite tres numeros:\n");
        scanf("%lf %lf %lf", &x1, &x2, &x3);
        media = ((2.0 * x1) + (3.0 * x2) + (5.0* x3)) / 10.0;
        printf("MEDIA = %.1lf\n", media);
    }

    return 0;
}
