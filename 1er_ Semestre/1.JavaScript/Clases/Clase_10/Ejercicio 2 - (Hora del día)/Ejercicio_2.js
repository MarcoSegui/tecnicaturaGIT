// Ejercisio 2 - Hora del día

let hora = 18;
let saludo;

if (6 <= hora && hora <= 11)  {
    saludo = 'Good Morning';
}
else if (12 <= hora && hora <= 16 )    {
    saludo = 'Good Afternoom';
}
else if (17 <= hora && hora <= 19) {
    saludo = 'Good Evening';
}
else if (20 <= hora && hora <= 5)    {
    saludo = 'Good Night';
}
else{
    saludo = 'El valor ingresado fue incorrecto';
}

console.log('La hora ingresada corresponde al saludo ' + saludo);
