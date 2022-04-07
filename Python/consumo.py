distancia: int
gasto: float
consumomedio: float

distancia = int(input("Distância percorrida: "))
gasto = float(input("Combustível gasto: "))

consumomedio = distancia / gasto

print(f"Consumo médio = {consumomedio:.3f}")
