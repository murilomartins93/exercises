// Parametros:
// quantia: valor em reais
// cotacao: valor da cotação do dólar
// Efeito: retorna o valor equivalente em dólares
funcao realParaDolar(quantia, cotacao : real) : real

Var

Inicio

   retorne quantia / cotacao

Fimfuncao

Algoritmo "CAMBIO"

Var

   cotacao, quantia, dolar : real

Inicio

   escreva("Digite a cotacao do dolar: ")
   leia(cotacao)
   escreva("Digite a quantia em reais: ")
   leia(quantia)

   dolar <- realParaDolar(quantia, cotacao)
   escreval("Voce pode comprar ", dolar:4:2, " dolares com esta quantia")
   
Fimalgoritmo