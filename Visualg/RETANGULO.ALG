Algoritmo "retangulo"

Var

   base, altura, area, perimetro, diagonal : real

Inicio

   escreva("Digite a medida da base do ret�ngulo: ")
   leia(base)
   escreva("Digite a medida da altura do ret�ngulo: ")
   leia(altura)
   
   area <- base * altura
   perimetro <- 2 * (base + altura)
   diagonal <- raizQ(Exp(base, 2) + Exp(altura, 2))
   
   escreval("A �rea do ret�ngulo mede ", area:8:4)
   escreval("O perimetro do ret�ngulo mede ", perimetro:8:4)
   escreval("A digonal do ret�ngulo mede ", diagonal:8:4)

Fimalgoritmo