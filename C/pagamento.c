#include<stdio.h>
#include<string.h>

void limpar_entrada() {
 char c;
 while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
 fgets(buffer, length, stdin);
 strtok(buffer, "\n");
}

int main(){

    char nome[50];
    double valor_hora, salario;
    int horas;

    printf("Nome: ");
    ler_texto(nome, 50);
    limpar_entrada;
    printf("Valor por hora: ");
    scanf("%lf", &valor_hora);
    printf("Horas trabalhadas: ");
    scanf("%d", &horas);

    salario = (double) valor_hora * horas;

    printf("O pagamento para %s deve ser %.2lf.\n", nome, salario);

    return 0;
}
