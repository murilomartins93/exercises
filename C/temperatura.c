#include<stdio.h>

int main(){

    char temp;
    double fahrenheit, celsius;

    printf("Voce vai digitar a temperatura em qual escala (C/F)?" );
    scanf("%c", &temp);

    switch(temp){
    case 'F':
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &fahrenheit);
        celsius = (fahrenheit - 32) / 1.8;
        printf("Temperatura equivalente em Celsius: %.2lf\n", celsius);
    break;
    case 'C':
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &celsius);
        fahrenheit = celsius * 1.8 + 32;
        printf("Temperatura equivalente em Fahrenheit: %.2lf\n", fahrenheit);
    break;

    default:
        printf("Conversao nao suportada.");
    }

    return 0;
}
