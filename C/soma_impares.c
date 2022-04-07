#include<stdio.h>

int main()
{

    int x, y, i, soma;

    printf("Digite dois numeros: \n");
    scanf("%d", &x);
    scanf("%d", &y);

    soma = 0;
    if(x > y)
    {
        for(i=y; i < x; i++)
        {
            if (i%2 != 0)
            {
                soma = i + soma;
            }
        }
    }
    else
    {
        for(i=x; i < y; i++)
        {
            if (i%2 != 0)
            {
                soma = i + soma;
            }
        }

    }

    printf("SOMA DOS IMPARES = %d", soma);


    return 0;
}
