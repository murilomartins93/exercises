Algoritmo "AREATRIANGULOFUNCAO"

Funcao areaTriangulo(a, b, c : real): real

Var

   area, p : real

Inicio

   p <- (a + b + c) / 2.0

   area <- RaizQ(p * (p - a) * (p - b) * (p - c))

   retorne area

Fimfuncao

Var

   xa, xb, xc, ya, yb, yc, areaX, areaY: real


Inicio

   escreval("Entre com as medidas do triângulo X:")
   leia(xa)
   leia(xb)
   leia(xc)
   
   escreval("Entre com as medidas do triângulo Y:")
   leia(ya)
   leia(yb)
   leia(yc)
   
   areaX <- areaTriangulo(xa, xb, xc)
   areaY <- areaTriangulo(ya, yb, yc)
   
   escreval("Area de X = ", areaX:6:4)
   escreval("Area de Y = ", areaY:6:4)

Fimalgoritmo