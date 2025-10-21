a = int(input('Digite el valor de A: '))
b = int(input('Digite el valor de B: '))

def cambioVal(a,b): # Los cambios dentro de las funciones solo aplican de manera local, no reflejandose en el resto del codigo
    if a != b:
        aux =b
        b = a
        a = aux
    return print(a,b)


cambioVal(a,b)


