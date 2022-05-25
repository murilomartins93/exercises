// Parametros:
// quantia: valor recebido como salário
// Efeito: retorna o imposto a ser pago sobre o salário
funcao impostoSobreSalario(quantia: real) : real

Var

   mensal : real
   
Inicio

   mensal <- quantia / 12
   se(mensal < 3000.0) entao
      retorne 0
   senao
      se(mensal >= 3000.0) e (mensal < 5000.0) entao
            retorne quantia * 10 / 100
      senao
            retorne quantia * 20 / 100
      fimse
   fimse

Fimfuncao


// Parametros:
// quantia: valor recebido como prestação de serviços
// Efeito: retorna o imposto a ser pago sobre prestação de serviços
funcao impostoSobreServicos(quantia: real) : real

Var

Inicio

   se (quantia <> 0) entao
      retorne quantia * 15 / 100
   senao
      retorne 0
   fimse

Fimfuncao


// Parametros:
// quantia: valor recebido como ganho de capital
// Efeito: retorna o imposto a ser pago sobre ganhos de capital
funcao impostoSobreGC(quantia: real) : real

Var

Inicio

   se (quantia <> 0) entao
      retorne quantia * 20 / 100
   senao
      retorne 0
   fimse

Fimfuncao


// Parametros:
// salario: valor recebido como salário
// servicos: valor recebido como prestação de serviços
// gc: valor recebido como ganho de capital
// Efeito: retorna o imposto bruto total a ser pago
funcao impostoBrutoTotal(salario: real; servicos: real; gc: real) : real

Var

Inicio

   retorne impostoSobreSalario(salario) + impostoSobreServicos(servicos) + impostoSobreGC(gc)

Fimfuncao


// Parametros:
// salario: valor recebido como salário
// servicos: valor recebido como prestação de serviços
// gc: valor recebido como ganho de capital
// gastosMedicos: valor gasto com despesas médicas
// gastosEducacionais: valor gasto com despesas educacionais
// Efeito: retorna o valor que o contribuinte pode abater no seu imposto
funcao abatimento(salario: real; servicos: real; gc: real; gastosMedicos: real; gastosEducacionais: real) : real

Var

   total, max : real

Inicio

   total <- gastosMedicos + gastosEducacionais
   max <- impostoBrutoTotal(salario, servicos, gc) * 30 / 100

   se(total >= max) entao
      retorne max
   senao
      retorne total
   fimse

Fimfuncao

// Parametros:
// salario: valor recebido como salário
// servicos: valor recebido como prestação de serviços
// gc: valor recebido como ganho de capital
// gastosMedicos: valor gasto com despesas médicas
// gastosEducacionais: valor gasto com despesas educacionais
// Efeito: retorna o total de imposto devido
funcao impostoDevido(salario: real; servicos: real; gc: real; gastosMedicos: real; gastosEducacionais: real) : real

Var

Inicio

   retorne impostoBrutoTotal(salario, servicos, gc) - abatimento(salario, servicos, gc, gastosMedicos, gastosEducacionais)

Fimfuncao

// Parametros:
// salario: valor recebido como salário
// servicos: valor recebido como prestação de serviços
// gc: valor recebido como ganho de capital
// gastosMedicos: valor gasto com despesas médicas
// gastosEducacionais: valor gasto com despesas educacionais
// Efeito: mostra na tela o relatório dos impostos incidentes sobre a renda
procedimento relatorio(salario: real; servicos: real; gc: real; gastosMedicos: real; gastosEducacionais: real) : real

Var

Inicio

   escreval
   escreval("RELATÓRIO:")
   escreval("Imposto sobre salário: ", impostoSobreSalario(salario):4:2)
   escreval("Imposto sobre serviços: ", impostoSobreServicos(servicos):4:2)
   escreval("Imposto sobre ganho de capital: ", impostoSobreGC(gc):4:2)
   escreval("Imposto bruto total: ", impostoBrutoTotal(salario, servicos, gc):4:2)
   escreval("Abatimento: ", abatimento(salario, servicos, gc, gastosMedicos, gastosEducacionais):4:2)
   escreval("Imposto devido: ", impostoDevido(salario, servicos, gc, gastosMedicos, gastosEducacionais):4:2)

Fimprocedimento


Algoritmo "CONTRIBUINTES"

Var

   salary, service, capital, medical, education : real

Inicio

   escreva("Renda anual com salário: ")
   leia(salary)
   escreva("Renda anual com prestação de serviço: ")
   leia(service)
   escreva("Renda anual com ganho de capital: ")
   leia(capital)
   escreva("Gastos médicos: ")
   leia(medical)
   escreva("Gastos educacionais: ")
   leia(education)
   relatorio(salary, service, capital, medical, education);

Fimalgoritmo