vacaciones = (input("¿Tenes vacaciones?")).lower().strip()
diaLibre = (input('¿Tenes el día libre?')).lower().strip()

if vacaciones == "si" and diaLibre == "si" :
    print('Va a poder ir al partido')
elif vacaciones == "no" or diaLibre == "no" :
    print('No va a poder ir al partido')
else :
    print('Ha ingresado un valor de respuesta incorrecto')
