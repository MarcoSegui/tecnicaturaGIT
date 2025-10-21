# Clase_10_Ejercicio_5
# CALCULAR EL FACTORIAL (!n) DE UN NUMERO >= 0

num = int(input('Escribe un numero:'))

factorial = 1
i = 1

while i <= num:
    factorial *= i
    i += 1

print(f'El factorial de {num} es {factorial}')

