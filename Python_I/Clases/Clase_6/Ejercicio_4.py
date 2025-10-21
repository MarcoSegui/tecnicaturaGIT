import math
pi = math.pi

radio = int(input('Digite el radio: '))


def area(radio):
    return pi * (radio^2)

def longitud(radio):
    return 2 * pi * radio

print(f'El área es: {(area(radio)):.2f} m² y la longitud es: {(longitud(radio)):.2f} m') # :.2f se usa para acortar la cantidad de decimales de un numero largo