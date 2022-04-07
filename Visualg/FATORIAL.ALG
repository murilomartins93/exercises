Algoritmo "fatorial"

Var

   N, i, F : inteiro

Inicio

   escreva("Digite o valor de N: ")
   leia(N)
   
   F <- 1
   para i de N ate 1 passo -1 faca
      F <- i * F
   fimpara

   escreval("FATORIAL = ", F)
   
Fimalgoritmo


