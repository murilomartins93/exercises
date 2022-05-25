// Parametros:
//   nome : nome do cliente
//   total : valor total do imóvel
//   entrada : valor pago de entrada
// Efeito : imprime na tela o relatório com o valor a ser parcelado
Procedimento relatorio(nome : caracter; total, entrada : real)

Var

   aux : real
   
Inicio

   aux <- total - entrada
   
   escreval
   escreval("RELATORIO")
   escreval("NOME: ", nome)
   escreval("VALOR TOTAL: ", total:4:2)
   escreval("VALOR DE ENTRADA: ", entrada:4:2)
   escreval("VALOR PARCELADO: ", aux:4:2)

Fimprocedimento

Algoritmo "FUNCAORELATORIO"

Var

   nomeCliente : caracter
   valorTotal, valorEntrada, valorParcelado : real

Inicio

   escreva("Nome: ")
   leia(nomeCliente)
   escreva("Valor Total: ")
   leia(valorTotal)
   escreva("Valor de Entrada: ")
   leia(valorEntrada)
   
   relatorio(nomeCliente, valorTotal, valorEntrada)
   
Fimalgoritmo