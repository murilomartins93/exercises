Algoritmo "multiplos"

Var

   x1, x2 : inteiro

Inicio

   escreval("Digite dois numeros inteiros: ")
   leia(x1)
   leia(x2)
   
   se (x1%x2=0) ou (x2%x1=0) entao
      escreva("São múltiplos.")
   senao
      escreva("Não são múltiplos.")
   fimse

Fimalgoritmo