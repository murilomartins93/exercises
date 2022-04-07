x: int
soma: int

soma = 0
x = int(input("Digite o primeiro número: "))

while x != 0:
    soma += x
    x = int(input("Digite outro número: "))

print(f"SOMA = {soma:.2f}")
print("SOMA =", soma)

