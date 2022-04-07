#include<stdio.h>
#include<string.h>

void ler_texto(char *buffer, int length)
{
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");
}

void limpar_entrada()
{
    char c;
    while((c = getchar()) != '\n' && c != EOF) {}

}

int main()
{

    int N;
    double altmedia, altsoma, porcentagem;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    // declaracao dos arrays
    int idade[N];
    double altura[N];
    char nome[N][50];

    // entrada dos dados
    for(int i=0; i < N; i++)
    {
        printf("Digite os dados da %da pessoa:\n", i+1);
        limpar_entrada();
        printf("Nome: ");
        ler_texto(nome[i], 50);
        printf("Idade: ");
        scanf("%d", &idade[i]);
        printf("Altura: ");
        scanf("%lf", &altura[i]);
    }

    // calculo de porcentagem e calculo altura media

    int count = 0;
    altsoma = 0;
    for(int i=0; i < N; i++)
    {
        if(idade[i] < 16)
        {
            count++;
        }
        altsoma = altsoma + altura[i];
    }

    altmedia = altsoma / N;
    porcentagem = ((double)count*100)/N;

    // impressao dos dados
    printf("\nAltura media = %.2lf\n", altmedia);
    printf("\nPessoas com menos de 16 anos: %.1lf%%\n", porcentagem);

    // COMO IMPRIMIR PORCENTAGEM E FAZER APARECER OS NOMES DOS MENORES DE 16.
    for(int i=0; i < N; i++)
    {
        if(idade[i] < 16)
        {
            printf("%s\n", nome[i]);
        }
    }

    return 0;
}
