# Clase_10_Ejercicio_7
# DADA LAS HORAS TRABAJADAS DE 5 PERSONAS Y LA TARIFA DE PAGO CALCULAR EL SALARIO, Y LA SUMATORIA DE TODOS LOS SALARIOS

i = 1
resPer = 0
resTotal = 0

while i <= 5:
    print(f'Trabajador N°{i}:')
    hrPer = float(input('Digite las horas trabajadas:'))
    salPer = float(input('Digite el salario por hora trabajada:'))
    resPer = (hrPer * salPer)
    print(f'Esta persona cobró ${resPer:.2f} por las {hrPer:.2f} horas trabajadas')
    resTotal += resPer
    i += 1

print(f'En total se pagaron sueldos por ${resTotal:.2f}')
