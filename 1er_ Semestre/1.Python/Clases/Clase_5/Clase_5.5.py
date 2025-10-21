#ingresar los siguientes datos de un libro "nombre, id, precio, envio free" luego mostrar en consola

nameBook = input("Ingresa tu nombre del libro: ").capitalize().strip()
idBook = int(input('Ingresa tu id del libro: '))
price = int(input('Ingresa el precio del libro: '))
shipFree = input("¿El envío es gratis? true / false: ").capitalize().strip()




if shipFree == 'True':
    shipFree = 'Sí'
elif shipFree == 'False':
    shipFree = 'No'
else:
    shipFree = 'El valor ingresado no es válido'

print(f'Nombre: {nameBook}\nID: {idBook}\nPrecio: ${price}\n¿Envío gratis?: {shipFree}')





#NOTA: conversion de datos booleanos
#shipFree = bool(input("¿El envío es gratis? true / false: ").capitalize().strip())
#shipFree = shipFree == 'True'
#Hace una validación para comprobar si el dato es estrictamente igual y si lo es, lo convierte en boooleano true, de lo contrario, false