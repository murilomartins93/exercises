Algoritmo "BHASKARA"

Var

   a, b, c, delta, x1, x2 : real

Inicio

   escreval("Digite os coeficientes de A, B, C: ")
   escreva("A = ")
   leia(a)
   escreva("B = ")
   leia(b)
   escreva("C = ")
   leia(c)

   delta <- (Exp(b, 2) - 4*a*c)

   se (a = 0) ou (delta < 0) entao
      escreva ("A equação não possui raizes reais.")
   senao
      x1 <- (-b + raizQ(delta)) / (2 * a)
      x2 <- (-b - raizQ(delta)) / (2 * a)
      escreval ("A equação possui duas raizes reais distintas: x1= ",x1:5:4, " e x2= ",x2:5:4)
   fimse

Fimalgoritmo