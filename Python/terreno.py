largura: float
comprimento: float
area: float
valor: float
preco: float

largura = float(input("Digite a largura do terreno: "))
comprimento = float(input("Digite o comprimento do terreno: "))
valor = float(input("Digite o valor do metro quadrado: "))

area = largura * comprimento
preco = area * valor

print(f"Area do terreno = {area:.2f}")
print(f"Preço do terreno = {preco:.2f}")
