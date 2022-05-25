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

Algoritmo "GLICOSEFUNCAO"

Var

   valorGlicose : real

Inicio

   escreva("Digite o valor da glicose: ")
   leia(valorGlicose)
   mostrarGlicose(valorGlicose)

Fimalgoritmo