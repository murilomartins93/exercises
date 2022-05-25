// Parametros:
// quantia: valor do salário bruto
// Efeito: retorna o imposto a ser pago
funcao imposto(quantia: real) : real

Var

Inicio

   se (quantia <= 4000) entao
        retorne quantia * 20 / 100
   senao
        retorne quantia * 25 / 100
   fimse

Fimfuncao


// Parametros:
// quantia: valor do salário bruto
// Efeito: retorna o desconto de previdência a ser pago
funcao previdencia(quantia: real) : real

Var

Inicio

   se (quantia <= 1500) entao
        retorne quantia * 10 / 100
   senao
        retorne quantia * 15 / 100
   fimse

Fimfuncao

// Parametros:
// quantia: valor do salário bruto
// Efeito: retorna o valor do salário líquido
funcao salarioLiquido(quantia: real) : real

Var

Inicio

   retorne quantia - imposto(quantia) - previdencia(quantia)

Fimfuncao


Algoritmo "SALARIO_LIQUIDO"

Var

   bruto, liquido : real

Inicio

   escreva("Digite o valor do salario bruto: ")
   leia(bruto)
   liquido <- salarioLiquido(bruto)
   escreval("Salario liquido = R$ ", liquido:4:2)
   
Fimalgoritmo