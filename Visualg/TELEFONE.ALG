Algoritmo "Telefone"

Var

   n, i, j : inteiro
   nome, telefone : vetor [0..9] de caracter
   type, minutos: vetor [0..9] de inteiro
   valorConta : vetor [0..9] de real
   mat : vetor [0..2, 0..1] de real
   
Inicio

   escreva("Informe a quantidade de clientes: ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreval("Dados do", i+1, "o cliente:")
      escreva("Nome: ")
      leia(nome[i])
      escreva("Telefone: ")
      leia(telefone[i])
      escreva("Tipo: ")
      leia(type[i])
      escreva("Minutos: ")
      leia(minutos[i])
      escreval
   fimpara

   escreval
   escreval("Informe o preco basico e excedente de cada tipo de conta:")
   para i de 0 ate 2 faca
      escreval("Tipo", i, ": ")
      para j de 0 ate 1 faca
         leia(mat[i, j])
      fimpara
   fimpara
   
   para i de 0 ate n-1 faca
      se (minutos[i] <= 90) entao
         valorConta[i] <- mat[type[i], 0]
      senao
         valorConta[i] <- mat[type[i], 0] + (minutos[i] - 90) * mat[type[i], 1]
      fimse
   fimpara

   escreval
   escreval("RELATÓRIO DE CLIENTES:")

   escreval
   para i de 0 ate n-1 faca
      escreval(nome[i], ", ", telefone[i], ", Tipo:", type[i], ", Minutos:", minutos[i], ", Conta: R$ ", valorConta[i]:4:2)
   fimpara

Fimalgoritmo