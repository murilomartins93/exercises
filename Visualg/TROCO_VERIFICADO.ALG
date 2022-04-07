Algoritmo "troco_verificado"

Var
   precoUnitario, dinheiro, troco : real
   quantidade : inteiro
   
Inicio
    escreva("Preço unitário do produto: ")
    leia(precoUnitario)
    escreva("Quantidade comprada: ")
    leia(quantidade)
    escreva("Dinheiro recebido: ")
    leia(dinheiro)

    troco <- dinheiro - precoUnitario * quantidade
    
    se troco >= 0 entao
       escreva("TROCO = ", troco)
    senao
       escreva("DINHEIRO INSUFICIENTE. FALTAM ", abs(troco):5:2, " REAIS.")
    fimse
    
Fimalgoritmo