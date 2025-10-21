a = int(input('Digite el valor de A: '))
b = int(input('Digite el valor de B: '))
c = int(input('Digite el valor de C: '))

def funcABC (a,b,c):
    return (a^3 * (b^2 - 2*a*c))/ 2*b


print(funcABC(a,b,c))