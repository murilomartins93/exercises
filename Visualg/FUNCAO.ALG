Algoritmo "Funcao"

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

   escreva("Digite o primeiro n�mero: ")
   leia(m)
   escreva("Digite o segundo n�mero: ")
   leia(n)
   produto(m, n)
   escreva("O resultado �", res)

Fimalgoritmo