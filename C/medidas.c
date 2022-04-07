#include<stdio.h>

int main(){

    double a, b, c, areaQ, areaT, areaTR;

    printf("Digite a medida A: ");
    scanf("%lf", &a);
    printf("Digite a medida B: ");
    scanf("%lf", &b);
    printf("Digite a medida C: ");
    scanf("%lf", &c);

    areaQ = a * a;
    areaT =  (a * b) / 2.0;
    areaTR = ((a + b) * C ) / 2.0 ;

    printf("AREA DO QUADRADO = %.4lf.\n", areaQ);
    printf("AREA DO TRIANGULO = %.4lf.\n", areaT);
    printf("AREA DO TRAPEZIO = %.4lf.\n", areaTR);

    return 0;
}
