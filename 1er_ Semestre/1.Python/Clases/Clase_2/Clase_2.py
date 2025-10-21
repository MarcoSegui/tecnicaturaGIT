variableA = 10
variableB = 'pepinillo Rick'
variableC = True
variableD = False

lista = (variableA, variableB, variableC, variableD)

for i in range(4):
    print(f'La variable {lista[i]} es del tipo {type(lista[i])}')

x = 10
y = 20
z = x + y

print (z)
print (id(x))

#Las literales se escriben x296 y x616

print (id(y))
print (id(z))