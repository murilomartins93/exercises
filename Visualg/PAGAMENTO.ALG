Algoritmo "pagamento"

Var

   funcionario : caractere
   salariohora, pagamento : real
   horas : inteiro
   
Inicio

   escreva("Digite o nome do funcion�rio: ")
   leia(funcionario)
   escreva("Digite o valor por hora trabalhada: ")
   leia(salariohora)
   escreva("Digite as horas trabalhadas por ", funcionario, " no m�s: ")
   leia(horas)

   pagamento <- horas * salariohora
   
   escreva("O pagamento para ", funcionario, " deve ser ", pagamento:8:2)

Fimalgoritmo