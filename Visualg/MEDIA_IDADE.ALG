Algoritmo "media_idade"

Var

   idade, soma, reps : inteiro
   media : real

Inicio

   soma <- 0
   reps <- 0

   escreval("Digite as idades: ")
   leia(idade)

   enquanto idade >= 0 faca
      soma <- soma + idade
      reps <- reps + 1
      leia(idade)
   fimenquanto

   se reps = 0 entao
      escreva("IMPOSSIVEL CALCULAR")
   senao
      media <- soma / reps
      escreva("MEDIA = ", media:4:2)
   fimse

Fimalgoritmo