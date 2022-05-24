Algoritmo "Bar"

Var

   sexo : caracter
   cerveja, refri, espetinho : inteiro
   ingresso, consumo, couvert, valor : real
   
Inicio

   escreva("Sexo: ")
   leia(sexo)
   escreva("Quantidade de cervejas: ")
   leia(cerveja)
   escreva("Quantidade de refrigerantes: ")
   leia(refri)
   escreva("Quantidade de espetinhos: ")
   leia(espetinho)

   se(sexo = "F") entao
      ingresso <- 8
   senao
      ingresso <- 10
   fimse
   
   consumo <- cerveja * 5.0 + refri * 3.0 + espetinho * 7.0

   escreval
   escreval("RELATÓRIO:")
   escreval("Consumo = R$", consumo:4:2)
   
   couvert <- 4.0
   se(consumo > 30.0) entao
      couvert <- 0
      escreval("Isento de Couvert")
   senao
      escreval("Couvert = R$", couvert:4:2)
   fimse
   
   escreval("Ingresso = R$", ingresso:4:2)

   valor <- consumo + couvert + ingresso
   
   escreval
   escreval("Valor a pagar = R$ ", valor:4:2)

Fimalgoritmo