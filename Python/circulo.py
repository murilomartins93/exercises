import math

r: float
area: float

r = float(input("Digite o valor do raio do círculo: "))

area = math.pi * (math.pow(r, 2))

print(f"AREA = {area:.3f}")