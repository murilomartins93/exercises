Algoritmo "Atletas"

Var

   n, i, count : inteiro
   altura, altMaior, altMulher, peso, pesoTotal, pesoMedia, homensPorcentagem, mulherAltMed : real
   nome, sexo, maisAlto : caracter

Inicio

   escreva("Qual a quantidade de atletas? ")
   leia(n)
   
   altMaior <- 0
   count <- 0
   altMulher <- 0
   para i de 1 ate n faca

      escreval("Digite os dados do atleta número", i, ":")
      escreva("Nome: ")
      leia(nome)

      // Sexo
      escreva("Sexo: ")
      leia(sexo)
      enquanto (sexo <> "M") e (sexo <> "F") faca
         escreva("Valor inválido! Favor digitar F ou M: ")
         leia(sexo)
      fimenquanto
      
      se (sexo = "M") entao
         count <- count + 1
      fimse

      // Altura
      escreva("Altura: ")
      leia(altura)
      enquanto (altura <= 0) faca
         escreva("Valor inválido! Favor digitar um valor positivo: ")
         leia(altura)
      fimenquanto
      
      se(altura > altMaior) entao
         altMaior <- altura
         maisAlto <- nome
      fimse
      
      se (sexo = "F") entao
         altMulher <- altMulher + altura
      fimse

      // Peso
      escreva("Peso: ")
      leia(peso)
      enquanto (peso <= 0) faca
         escreva("Valor inválido! Favor digitar um valor positivo: ")
         leia(peso)
      fimenquanto

      pesoTotal <- pesoTotal + peso

   fimpara
   
   pesoMedia <- pesoTotal / n
   homensPorcentagem <- count / n * 100


   escreval
   escreval("RELATÓRIO:")
   escreval("Peso médio dos atletas: ", pesoMedia:4:2)
   escreval("Atleta mais alto: ", maisAlto)
   escreval("Porcentagem de homens: ", homensPorcentagem:4:1, "%")
   
   se(altMulher <> 0) entao
      mulherAltMed <- altMulher / (n - count)
      escreval("Altura média das mulheres: ", mulherAltMed:4:2)
   senao
      escreval("Não há mulheres cadastradas")
   fimse

Fimalgoritmo