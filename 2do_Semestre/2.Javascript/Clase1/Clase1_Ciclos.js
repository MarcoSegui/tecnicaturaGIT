//Leccion 1: Ciclo while

let cont = 0;

while (cont < 3){
    console.log(cont);
    cont ++;
}

console.log('Cierre del ciclo While');

// Leccion 2: Ciclo Do While

let cont1 = 0;

do {
    console.log(cont1);
    cont1++;
} while(cont1 < 3);

console.log('Cierre del ciclo Do While');

// Leccion 3: Ciclo For

for (let cont2 = 0; cont2 < 3; cont2++){
    console.log(cont2);
}

console.log('Cierre del ciclo For');

// Leccion 4: Palabra reservada BREAK

for (let cont3 = 0; cont3 <= 100; cont3++)  {
    if(cont3 % 2 == 0)   {
        console.log(cont3); // muestra los pares
    }   else if(cont3 >= 10)    {
        break;  //corta el ciclo al llegar a 10
    }
}

console.log('Cierra el ciclo BREAK');

// Lección 5: Palabra reservada CONTINUE (es como decir: "Esta vuelta no me interesa, pasemos a la siguiente")

for (let cont4 = 0; cont4 <= 10; cont4++)  {
    if(cont4 % 2 == 0)   {        
        continue;   //salta la interacicon actual iniciando el siguiente ciclo, haciendo que se ignore el console.log de los pares
    }   
    console.log(cont4); // muestra los impares
}

console.log('Cierre del ciclo CONTINUE');

// Leccion 6: Estiquertas (Labels) son etiquetas que permiten identificar bucles específicos para usar con break y continue.

//Caso BREAK (permite salir de bucles anidados)

inicioA:
for(let i = 0; i < 3; i++)    {
    for(let j = 0; j < 3; j++)  {
        if(i == 1 && j == 1)    {
            break inicioA;  // corta todos los ciclos dentro del rango de la etiqueta inicioA cuando coincide i=1 y j=1
        }
        console.log(i,j);
    }
}

console.log('Cierre del ciclo anidado BREAK - Label: InicioA');


//Caso CONTINUE (permite pasar a la siguiente iteracion en bucles anidados)

inicioB:
for(let i = 0; i < 3; i++)    {
    for(let j = 0; j < 3; j++)  {
        if(i == j)    {
            continue inicioB;  // salta todos los ciclos dentro del rango de la etiqueta inicioB cuando coincide i y j
        }
        console.log(i,j);
    }
}

console.log('Cierre del ciclo anidado CONTINUE - Label: InicioB');