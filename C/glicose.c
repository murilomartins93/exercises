#include<stdio.h>

int main(){

    double glicose;

    printf("Digite a medida da glicose: ");
    scanf("%lf", &glicose);

    if(glicose <= 100){
        printf("Classificacao: normal");
    }
    else if(glicose > 100 && glicose <= 140){
        printf("Classificacao: elevado");
    }
    else{
        printf("Classificacao: diabetes");
    }

    return 0;
}
