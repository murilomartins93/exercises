#include<stdio.h>

int main(){

    int idade, count;
    double soma, media;

    printf("Digite as idades:\n");
    scanf("%d", &idade);

    if(idade < 0){
        printf("IMPOSSIVEL CALCULAR\n");
    }
    else {
    count = 0;
    while(idade > 0){
        soma = idade + soma;
        count++;
        scanf("%d", &idade);
    }
    media = soma / count;
    printf("MEDIA = %.2lf", media);
    }

return 0;
}
