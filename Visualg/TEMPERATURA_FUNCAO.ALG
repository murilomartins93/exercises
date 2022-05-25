// Parametros:
// f: temperatura em Fahrenheit
// Efeito: retorna a temperatura equivalente em Celsius
funcao fahrenheitParaCelsius(f: real) : real

Var

Inicio

   retorne (5 / 9) * (f - 32)

Fimfuncao

Algoritmo "TEMPERATURA"

Var

   f : real

Inicio

   escreva("Digite a temperatura em Fahrenheit: ")
   leia(f)

   escreval("Temperatura em Celsius = ", fahrenheitParaCelsius(f):4:2)
   
Fimalgoritmo