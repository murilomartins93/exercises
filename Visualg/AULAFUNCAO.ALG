Funcao media(a : real; b: real): real

var

   soma : real

Inicio

   soma <- a + b
   retorne soma / 2

Fimfuncao

Algoritmo "aula_funcoes"

Var

   altura1, altura2, resultado : real

Inicio

   escreval("Digite duas alturas:")
   leia(altura1)
   leia(altura2)

   resultado <- media(altura1, altura2)

   escreval("MEDIA = ", resultado:4:2)

Fimalgoritmo
