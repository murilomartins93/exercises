nome: str
valor: float
qtd: int
pagamento: float

nome = input("Nome: ")
valor = float(input("Valor por hora: "))
qtd = int(input("Horas trabalhadas: "))

pagamento = qtd * valor

print(f"O pagamento para {nome} deve ser R${pagamento:.2f}.")
