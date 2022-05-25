// Parametros:
// x: primeiro numero
// y: segundo numero
// z: terceiro numero
// Efeito: retorna o menor numero
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

Funcao menorDeCinco(s, t, u, v, w: inteiro): inteiro

Var

   aux : inteiro
   
Inicio

   aux <- menorDeTres(s, t, u)
   retorne menorDeTres(aux, v, w)

Fimfuncao


Algoritmo "menorDeTres"

Var

   n1, n2, n3, n4, n5, menor, menor2 : inteiro

Inicio

   escreval("Digite cinco numeros inteiros:")
   leia(n1)
   leia(n2)
   leia(n3)
   leia(n4)
   leia(n5)

   menor <- menorDeTres(menorDeTres(n1, n2, n3), n4, n5)
   menor2 <- menorDeCinco(n1, n2, n3, n4, n5)
   
   escreval("Menor = ", menor)
   escreval("Menor = ", menor2)

Fimalgoritmo