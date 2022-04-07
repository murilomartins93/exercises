#include<stdio.h>

int main(){

    double d1, d2, d3, maior;

    printf("Digite as tres distancias:\n");
    scanf("%lf %lf %lf", &d1, &d2, &d3);

    if(d1 > d2 && d1 > d3){
        maior = d1;
    }
    else if(d2 > d3){
        maior = d2;
    }
    else{
        maior = d3;
    }

    printf("MAIOR DISTANCIA = %.2lf\n", maior);

    return 0;
}
