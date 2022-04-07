preco: float
qtd: int
valor: float
troco: float

preco = float(input("Preço unitário do produto: "))
qtd = int(input("Quantidade comprada: "))
valor = float(input("Dinheiro recebido: "))

troco = valor - (qtd * preco)

print(f"TROCO = {troco:.2f}")

