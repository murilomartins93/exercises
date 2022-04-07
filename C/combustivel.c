#include<stdio.h>

int main()
{

    int cod, alcool, gasolina, diesel; ;

    printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
    scanf("%d", &cod);

    alcool = 0;
    gasolina = 0;
    diesel = 0;

    while(cod !=4)
    {
        switch(cod)
        {
        case 1 :
            alcool++;
        break;
        case 2 :
            gasolina++;
        break;
        case 3 :
            diesel++;
        break;
        default :
            printf("Codigo Invalido! ");
        break;
        }
            printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            scanf("%d", &cod);
        }

    printf("MUITO OBRIGADO!\nALCOOL = %d\nGASOLINA = %d\nDIESEL = %d\n", alcool, gasolina, diesel);

    return 0;
}
