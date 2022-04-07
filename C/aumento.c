#include<stdio.h>

int main(){

    int porcento;
    double salario, aumento;

    printf("Digite o salario da pessoa: ");
    scanf("%lf", &salario);

    if(salario <= 1000){
        porcento = 20;
    }
    else if (salario <= 3000){
        porcento = 15;
    }
    else if (salario <= 8000){
        porcento = 10;
    }
    else {
        porcento = 5;
    }

    aumento = salario * porcento/100;
    salario = salario + aumento;
    printf("Novo salario = R$ %.2lf\nAumento = R$ %.2lf\nPorcentagem = %d%%\n", salario, aumento, porcento);

    return 0;
}
