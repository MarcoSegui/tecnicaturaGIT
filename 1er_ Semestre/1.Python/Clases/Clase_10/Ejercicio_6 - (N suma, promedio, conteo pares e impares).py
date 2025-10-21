# Clase_10_Ejercicio_6
# INGRESAR "N" ENTEROS, VISUALIZAR LA SUMA DE LOS NÚMEROS PARES DE LA LISTA, CUÁNTOS NÚMEROS PARES EXISTEN Y CUÁL ES EL PROMEDIO DE LOS NÚMEROS IMPARES

n = int(input('Escribe la cantidad de elementos:'))

numPar = 0
numImpar = 0
sumaPar = 0
sumaImpar = 0

for i in range (n):
    num = int(input(f'Ingrese el {i+1}° numero: '))
    if num % 2 == 0:
        numPar += 1
        sumaPar += num
    else:
        numImpar += 1
        sumaImpar += num

promImpar = sumaImpar / numImpar

print(f'Se observan {numPar} numeros pares que sumados dan como resultado {sumaPar} y el promedio de los numeros impares es {int(promImpar)}')
