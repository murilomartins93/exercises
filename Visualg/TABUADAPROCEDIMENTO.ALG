// Parametros:
// n: número para o qual se deseja a tabuada
// Efeito: escreve na tela a tabuada de multiplicação de 1 a 10 para o valor n
procedimento mostrarTabuada(n : inteiro)

Var

   i : inteiro

Inicio

   para i de 1 ate 10 faca
        escreval(n, " x", i, " =", (i*n))
   fimpara

Fimprocedimento

Algoritmo "TABUADAPROCEDIMENTO"

Var

   num : inteiro

Inicio

   escreva("Voce quer a tabuada de qual numero? ")
   leia(num)
   mostrarTabuada(num)

Fimalgoritmo