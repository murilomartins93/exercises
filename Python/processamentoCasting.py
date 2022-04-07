x: int
y: int
x = 5
y = 2 * x
print(x)
print(y)

a: int
b: float
a = 5
b = 2 * x
print(a)
print(f"{b:.1f}")

b1: float; b2: float; h: float; area: float
b1 = 6.0
b2 = 8.0
h = 5.0
area = (b1 + b2) / 2.0 * h
print(area)

c: int; d: int; resultado: int
c = 5
d = 2
resultado = c // d #SE REALMENTE QUISER SÓ A PARTE INTEIRA, TEM QUE USAR O OPERADOR DE DIVISÃO INTEIRA
print(resultado)  # O PYTHON PROCESSA O QUE ELE ACHA O CORRETO, FAZENDO O CASTING AUTOMATICO

e: float; f: int
e = 5.0
f = int(e)  #SE QUISER CONVERTER O TIPO PRECISA FORÇAR E DEIXAR EXPLICITO
print(f)
