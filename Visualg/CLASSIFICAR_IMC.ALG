// Parametros:
// peso: peso da pessoa
// altura: altura da pessoa
// Efeito: retorna o valor da IMC da pessoa
Funcao imc (peso, altura : real) : real

Var

Inicio

   retorne peso / Exp(altura, 2.0)

Fimfuncao

// Parametros:
// peso: peso da pessoa
// altura: altura da pessoa
// Efeito: retorna a classificacao do IMC da pessoa
procedimento mostrarImc (peso, altura : real)

Var

   msg : caracter
   valor : real

Inicio

   valor <- imc(peso, altura)
   
   se (valor < 20) entao
      msg <- "abaixo do peso"
   senao
        se (valor < 25) entao
            msg <- "peso normal"
        senao
             se (valor < 30) entao
                msg <- "sobre peso"
             senao
                msg <- "obeso"
             fimse
        fimse
   fimse

   escreval("Resultado do IMC: ", msg)

Fimprocedimento


Algoritmo "IMC_CLASSIFICAR"

Var

   peso, altura : real

Inicio

   escreva("Digite o peso: ")
   leia(peso)
   escreva("Digite a altura: ")
   leia(altura)
   
   mostrarImc(peso, altura)

Fimalgoritmo