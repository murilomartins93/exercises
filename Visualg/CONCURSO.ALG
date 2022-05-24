Algoritmo "Concurso"

Var

   n, i, count, posMaior : inteiro
   totalAprov, medAprov, porcAprov, maiorMed : real
   nome : vetor [0..9] de caracter
   nota1, nota2, med: vetor [0..9] de real
   
Inicio

   escreva("Qual a quantidade de pessoas? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreval("Digite os dados da", i+1, "a pessoa:")
      escreva("Nome: ")
      leia(nome[i])
      escreva("Nota etapa 1: ")
      leia(nota1[i])
      escreva("Nota etapa 2: ")
      leia(nota2[i])
      med[i] <- (nota1[i] + nota2[i]) / 2.0
   fimpara

   escreval
   escreval("TABELA")
   para i de 0 ate n-1 faca
      escreval(nome[i], ", ", nota1[i]:4:1, ", ", nota2[i]:4:1, ", MEDIA = ", med[i]:4:2)
   fimpara
   
   count <- 0
   escreval
   escreval("PESSOAS APROVADAS:")
   para i de 0 ate n-1 faca
      se (med[i] >= 70) entao
         escreval(nome[i])
         count <- count + 1
         totalAprov <- totalAprov + med[i]
      fimse
   fimpara
   
   porcAprov <- count * 100 / n
   
   maiorMed <- med[0]
   para i de 0 ate n-1 faca
      se (med[i] > maiorMed) entao
         maiorMed <- med[i]
         posMaior <- i
      fimse
   fimpara

   escreval
   escreval("Porcentagem de aprovação: ", porcAprov:4:1, "%")
   escreval("Maior média: ", nome[posMaior])
   
   se (totalAprov <> 0) entao
      medAprov <- totalAprov / count
      escreval("Nota média dos aprovados: ", medAprov:4:2)
   senao
      escreval("Não há candidatos aprovados")
   fimse
   
Fimalgoritmo