#include<stdio.h>
#include<math.h>

int main() {

    int tempo, hora, minuto, segundo;

    printf("Digite a duracao em segundos: ");
    scanf("%d", &tempo);

    segundo = tempo % 60;
    minuto = tempo / 60;
    hora = minuto / 60;
    minuto = minuto % 60;

    printf("%d:%d:%d.\n", hora, minuto, segundo);

    return 0;
}
