N: int
altmed: float
alttotal: float

N = int(input("Quantas pessoas serão digitadas? "))

nome: [str] = [0 for x in range(N)]
idade: [int] = [0 for x in range(N)]
altura: [float] = [0 for x in range(N)]

for i in range(0, N):
    print(f"Dados da {i+1}a pessoa:")
    nome[i] = str(input("Nome: "))
    idade[i] = int(input("Idade: "))
    altura[i] = float(input("Altura: "))

count = 0
alttotal = 0
for i in range(0, N):
    if idade[i] < 16:
        count = count + 1
    alttotal = alttotal + altura[i]

altmed = alttotal / N
porcentagem = (float(100 * count)/N)

print(f"\nAltura média: {altmed:.2f}")
print(f"Pessoas com menos de 16 anos: {porcentagem:.1f}%")

for i in range(0, N):
    if idade[i] < 16:
        print(nome[i])





