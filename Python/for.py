for i in range(0, 6, 2):
    print(i)

n = int(input("Quantos números serão digitados? "))

soma: int = 0
for i in range(0, n):
    x = int(input("Digite um número: "))
    soma += x

print("SOMA = ", soma)
