Algoritmo "Imposto"

Var

   salary, service, capital, medical, education : real
   salaryTax, serviceTax, capitalTax : real
   deductible, deductibleMax, deductibleTotal, totalTax, dueTax : real

Inicio

   escreva("Renda anual com sal�rio: ")
   leia(salary)
   escreva("Renda anual com presta��o de servi�o: ")
   leia(service)
   escreva("Renda anual com ganho de capital: ")
   leia(capital)
   escreva("Gastos m�dicos: ")
   leia(medical)
   escreva("Gastos educacionais: ")
   leia(education)
   
   salaryTax <- 0
   se(salary/12 < 3000.0) entao
      salaryTax <- 0
   senao
      se(salary/12 >= 3000.0) e (salary/12 < 5000.0) entao
            salaryTax <- salary * 10 / 100
      senao
            salaryTax <- salary * 20 / 100
      fimse
   fimse

   serviceTax <- 0
   se (service <> 0) entao
      serviceTax <- service * 15 / 100
   fimse
   
   capitalTax <- 0
   se (capital <> 0) entao
      capitalTax <- capital * 20 / 100
   fimse
   
   totalTax <- salaryTax + serviceTax + capitalTax
   deductibleTotal <- medical + education
   deductibleMax <- totalTax * 30 / 100
   
   se(deductibleTotal >= deductibleMax) entao
      deductible <- deductibleMax
   senao
      deductible <- deductibleTotal
   fimse

   dueTax <- totalTax - deductible

   escreval
   escreval("RELAT�RIO DE IMPOSTO DE RENDA")
   escreval
   escreval("CONSOLIDADO DE RENDA:")
   escreval("Imposto sobre sal�rio: ", salaryTax:4:2)
   escreval("Imposto sobre servi�os: ", serviceTax:4:2)
   escreval("Imposto sobre ganho de capital: ", capitalTax:4:2)
   escreval
   escreval("DEDU��ES:")
   escreval("M�ximo dedut�vel: ", deductibleMax:4:2)
   escreval("Gastos dedut�veis: ", deductibleTotal:4:2)
   escreval
   escreval("RESUMO:")
   escreval("Imposto bruto total: ", totalTax:4:2)
   escreval("Abatimento: ", deductible:4:2)
   escreval("Imposto devido: ", dueTax:4:2)
   
Fimalgoritmo