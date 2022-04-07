Algoritmo "teste_para"

Var

   i, ii, a, b, c, soma : inteiro

Inicio

   para i de 1 ate 5 faca
      escreval("Valor de i: ", i)
   fimpara
   
   para ii de 4 ate 1 passo -1 faca
      escreval("Valor de i: ", ii)
   fimpara

   
   escreval("Quantos numeros serao digitados? ")
   leia(a)

   soma <- 0

   para b de 1 ate a faca
      escreva("Digite um numero: ")
      leia(c)
      soma <- soma + c
   fimpara
   escreval("SOMA = ", soma)
   
Fimalgoritmo