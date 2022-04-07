print("Bom dia", end='')
print("Boa noite")

x = "Maria"
y = 19

print("%s tem %d anos de idade" % (x, y)) # IMPRIMIR COM PLACEHOLDERS

a: int; b: int
a = 10
b = 10
print(a)
print(b)

c: float
c = 2.3456
print("{:.4f}".format(c)) # IMPRIMIR DADOS COM .FORMAT
print(f"C = {c:.2f}") # IMPRIMIR COM INTERPOLAÇÃO

idade = 32
salario = 4560.9
nome = "Maria Silva"
sexo = "F"

print(f"A funcionaria {nome}, sexo {sexo}, ganha {salario:.2f} e tem {idade} anos")
print("A funcionaria {:s}, sexo {:s}, ganha {:.2f} e tem {:d} anos".format(nome, sexo, salario, idade))
