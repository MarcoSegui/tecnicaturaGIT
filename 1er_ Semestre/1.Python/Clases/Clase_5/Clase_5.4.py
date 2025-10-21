#ingresar 2 num y mostrar el mas grande

num1 = int(input('Ingrese un numero: '))
num2 = int(input('Ingrese otro numero: '))

if  num1 > num2 :
    print(f'El numero {num1} es mayor a {num2}')
elif num2 > num1 :
    print(f'El numero {num2} es mayor a {num1}')
else:
    print(f'El numero {num1} es igual a {num2}')
