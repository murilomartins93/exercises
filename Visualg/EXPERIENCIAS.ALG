Algoritmo "experiencias"

Var

   N, i, cobaia, totalcob, sapo, rato, coelho : inteiro
   tipodecobaia : caractere

Inicio

   sapo <- 0
   rato <- 0
   coelho <- 0
   totalcob <- 0

   escreva("Quantos casos de teste serão digitados? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Quantidade de cobaias: ")
      leia(cobaia)
      escreva("Tipo de cobaias: ")
      leia(tipodecobaia)
      escolha tipodecobaia
         caso "S"
            sapo <- cobaia + sapo
         caso "R"
            rato <- cobaia + rato
         caso "C"
            coelho <- cobaia + coelho
      fimescolha
      totalcob <- cobaia + totalcob
    fimpara

   escreval
   escreval("RELATÓRIO FINAL:")
   escreval("Total: ", totalcob, " cobaias")
   escreval("Total de coelhos: ", coelho)
   escreval("Total de ratos: ", rato)
   escreval("Total de sapos: ", sapo)
   escreval("Porcentual de coelhos ", (coelho*100/totalcob):4:2)
   escreval("Porcentual de ratos ", (rato*100/totalcob):4:2)
   escreval("Porcentual de sapos ", (sapo*100/totalcob):4:2)



Fimalgoritmo