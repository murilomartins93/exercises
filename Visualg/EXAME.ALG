// Parametros:
// medida: quantidade de glicose no sangue (mg/dl)
// Efeito: escreve na tela a classificação da glicose
procedimento mostrarGlicose(medida : real)

Var

   msg : caracter

Inicio

   se (medida <= 100) entao
      msg <- "Normal"
   senao
        se (medida <= 140) entao
            msg <- "Elevado"
        senao
              msg <- "Diabetes"
        fimse
   fimse

   escreval("Classificacao: ", msg)

Fimprocedimento


// Parametros:
// medida: quantidade de triglicerídeos no sangue (mg/dl)
// Efeito: escreve na tela a classificação do triglicérides
procedimento mostrarTriglicerides(medida : real)

Var

   msg : caracter

Inicio

   se (medida <= 200) entao
      msg <- "Desejável"
   senao
      msg <- "Aumentado"
   fimse

   escreval("Classificacao: ", msg)

Fimprocedimento

// Parametros:
// medida: quantidade de colesterol no sangue (mg/dl)
// Efeito: escreve na tela a classificação do colesterol
procedimento mostrarColesterol(medida : real)

Var

   msg : caracter

Inicio

   se (medida <= 200) entao
      msg <- "Desejável"
   senao
        se (medida <= 240) entao
            msg <- "Limiar"
        senao
              msg <- "Elevado"
        fimse
   fimse

   escreval("Classificacao: ", msg)

Fimprocedimento


Algoritmo "EXAME"

Var

   medida : real

Inicio

   escreva("Medida da glicose: ")
   leia(medida)
   mostrarGlicose(medida)
   escreva("Medida de triglicerideos: ")
   leia(medida)
   mostrarTriglicerides(medida)
   escreva("Medida da glicose: ")
   leia(medida)
   mostrarColesterol(medida)

Fimalgoritmo