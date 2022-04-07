Algoritmo "dardo"

Var

   d1, d2, d3, maior : real

Inicio

   escreval("Digite as tres distancias: ")
   escreva("Distância 1: ")
   leia(d1)
   escreva("Distância 2: ")
   leia(d2)
   escreva("Distância 3: ")
   leia(d3)
   
   se (d1 > d2) e (d1 > d3) entao
      maior <- d1
   senao
      se d2 > d3 entao
         maior <- d2
      senao
         maior <- d3
      fimse
   fimse
   
   escreva("MAIOR DISTÂNCIA = ", maior:4:2)
   
Fimalgoritmo