// Parametros:
// total: valor total do im�vel
// entrada: valor pago na entrada do financiamento
// meses: quantidades de meses em que o restante ser� financiado
// Efeito: retorna o valor da presta��o do financiamento sem juros
funcao prestacao(total, entrada: real; meses: inteiro) : real

Var

Inicio

   retorne (total - entrada) / meses

Fimfuncao

Algoritmo "FINANCIAMENTO"

Var

   valorTotal, valorEntrada, valorPrestacao : real
   qtdMeses : inteiro

Inicio

   escreva("Valor total do imovel: ")
   leia(valorTotal)
   escreva("Valor pago na entrada: ")
   leia(valorEntrada)
   escreva("Sera financiado em quantos meses? ")
   leia(qtdMeses)

   valorPrestacao <- prestacao(valorTotal, valorEntrada, qtdMeses)
   escreval("Valor de cada prestacao: ", valorPrestacao:4:2)
   
Fimalgoritmo