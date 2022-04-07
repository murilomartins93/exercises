Algoritmo "troco"

Var

   precounidade, dinheiropago, troco : real
   quantidade : inteiro

Inicio

   escreva("Digite o preço unitário do produto: ")
   leia(precounidade)
   escreva("Digite a quantidade de produto comprada pelo cliente: ")
   leia(quantidade)
   escreva("Digite o valor do dinheiro recebido do cliente: ")
   leia(dinheiropago)

   troco <- dinheiropago - (precounidade * quantidade)

   escreva("O troco é de ", troco:4:2)
   
Fimalgoritmo