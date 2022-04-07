#include<stdio.h>

int main()
{

    int N, i, tab;

    printf("Deseja a tabuada para qual valor? ");
    scanf("%d", &N);

    tab = 0;
    for (i=1; i <= 10; i++)
    {
        tab = i * N;
        printf("%d X %d = %d\n", N, i, tab);
    }
    return 0;
}
