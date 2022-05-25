// Parametros:
// peso: peso da pessoa
// altura: altura da pessoa
// Efeito: retorna o valor da IMC da pessoa
Funcao imc (peso, altura : real) : real

Var

Inicio

   retorne peso / Exp(altura, 2.0)

Fimfuncao

Algoritmo "IMC_FUNCAO"

Var

   peso, altura : real

Inicio

   escreva("Digite o peso: ")
   leia(peso)
   escreva("Digite a altura: ")
   leia(altura)

   escreval("IMC = ", imc(peso, altura):4:2)
   
Fimalgoritmo