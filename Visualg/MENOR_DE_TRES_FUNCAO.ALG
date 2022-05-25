Funcao menorDeTres(x, y, z : inteiro): inteiro

Var

Inicio

   se(x < y) e (x < z) entao
        retorne x
   senao
        se (y < z) entao
            retorne y
        senao
            retorne z
        fimse
   fimse

Fimfuncao

Algoritmo "menorDeTres"

Var

   a, b, c, menor : inteiro


Inicio

   escreval("Digite tres numeros inteiros:")
   leia(a)
   leia(b)
   leia(c)

   menor <- menorDeTres(a, b, c)
   
   escreval("Menor = ", menor)

Fimalgoritmo