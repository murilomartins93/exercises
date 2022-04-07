N: int
soma: float
media: float

N = int(input("Quantos números você vai digitar? "))

vet: [float] = [0 for x in range(N)]

soma = 0
for i in range(0, N):
    vet[i] = float(input("Digite um número: "))
    soma = soma + vet[i]

media = soma / N

print(f"\nVALORES = ", end="")
for i in range(0, N):
    print(f"{vet[i]:.1f} ", end="")

print(f"\nSOMA = {soma:.2f}")
print(f"MEDIA = {media:.2f}")
