Algoritmo "ProcedimentoComParametro"

Procedimento produto(x, y : inteiro)

Var

   aux : inteiro
   
Inicio

   aux <- x * y
   res <- aux

Fimprocedimento

Var

   res, m, n: inteiro

Inicio

   escreva("Digite o primeiro número: ")
   leia(m)
   escreva("Digite o segundo número: ")
   leia(n)
   produto(m, n)
   escreva("O resultado é", res)

Fimalgoritmo