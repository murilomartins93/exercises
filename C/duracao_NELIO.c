#include<stdio.h>
#include<math.h>

int main() {

    int tempo, hora, minuto, segundo, resto;

    printf("Digite a duracao em segundos: ");
    scanf("%d", &tempo);

    hora = tempo / 3600;
    resto = tempo % 3600;

    minuto = resto / 60;
    segundo = resto % 60;

    printf("%d:%d:%d.\n", hora, minuto, segundo);

    return 0;
}
