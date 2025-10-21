# CLASE_9_EJERCICIO_3

print("Escribe 10 Números")

num_neg = 0
num_pos = 0
num_neu = 0

for i in range(10):
    num = int(input("Ingrese un número: "))
    if num < 0:
        num_neg += 1
    elif num > 0:
        num_pos += 1
    else:
        num_neu += 1

print(f"Ha escrito {num_pos} números positivos, {num_neu} números neutros y {num_neg} números negativos")