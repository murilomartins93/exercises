Algoritmo "divisao"

Var

   i, N : inteiro
   x, y, divisao : real

Inicio

   escreva("Quantos casos voce vai digitar? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Entre com o numerador: ")
      leia(x)
      escreva("Entre com o denominador: ")
      leia(y)
      se y <> 0 entao
         divisao <- x / y
         escreval("DIVIS�O = ", divisao:4:2)
      senao
         escreval("DIVIS�O IMPOSS�VEL")
      fimse
   fimpara

Fimalgoritmo