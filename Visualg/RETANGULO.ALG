Algoritmo "retangulo"

Var

   base, altura, area, perimetro, diagonal : real

Inicio

   escreva("Digite a medida da base do retângulo: ")
   leia(base)
   escreva("Digite a medida da altura do retângulo: ")
   leia(altura)
   
   area <- base * altura
   perimetro <- 2 * (base + altura)
   diagonal <- raizQ(Exp(base, 2) + Exp(altura, 2))
   
   escreval("A área do retângulo mede ", area:8:4)
   escreval("O perimetro do retângulo mede ", perimetro:8:4)
   escreval("A digonal do retângulo mede ", diagonal:8:4)

Fimalgoritmo