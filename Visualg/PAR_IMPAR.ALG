Algoritmo "par_impar"

Var

   N, i, x: inteiro

Inicio

   escreva("Quantos numeros voce vai digitar? ")
   leia(N)
   
   para i de 1 ate N faca
      escreva("Digite um número: ")
      leia(x)

      se (x = 0) entao
         escreval("NULO")
      senao
         se (x%2=0) entao
            se x > 0 entao
               escreval("PAR POSITIVO")
            senao
               escreval("PAR NEGATIVO")
            fimse
         senao
            se x > 0 entao
               escreval("ÍMPAR POSITIVO")
            senao
               escreval("ÍMPAR NEGATIVO")
            fimse
         fimse
      fimse
   fimpara

Fimalgoritmo