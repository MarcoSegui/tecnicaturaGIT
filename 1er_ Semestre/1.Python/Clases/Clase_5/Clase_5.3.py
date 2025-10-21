edad = int(input('Ingrese su edad: '))



if edad >= 20 and edad < 30 :
    print("Eres todo un adolencente")
elif edad >= 30 and edad < 40 :
    print("Eres un adulto")
else :
    if edad >= 40 or edad < 20 :
        print("No estas en el rango buscado")
