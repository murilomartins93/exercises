Algoritmo "medidas"

Var

   A, B, C, AreaQuadrado, AreaTriangulo, AreaTrapezio : real
   
Inicio

   escreva("Digite a medida A: ")
   leia(A)
   escreva("Digite a medida B: ")
   leia(B)
   escreva("Digite a medida C: ")
   leia(C)
   
   AreaQuadrado <- Exp(A, 2)
   AreaTriangulo <- B*A/2
   AreaTrapezio <- (A+B)*C/2

   escreval("Área do Quadrado: ", AreaQuadrado:8:4)
   escreval("Área do Triângulo: ", AreaTriangulo:8:4)
   escreval("Área do Trapézio: ", AreaTrapezio:8:4)

Fimalgoritmo