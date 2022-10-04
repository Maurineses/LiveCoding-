let arreglo = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio', 'gato', 'amigo', 'piano', 'correa'];
let string = 'bocina';
let agregar = document.getElementById("text");
let btn = document.getElementById("btn");
let ul = document.getElementById("ul");



btn.addEventListener('click', function(e){
    string = agregar.value;
    let nuevoArreglo = elementoMayor(string, arreglo);
    ul.innerHTML="";
    nuevoArreglo.forEach(element => {
        console.log(element);
        ul.innerHTML+= `<li>${element}</li>`;
    });
})



function elementoMayor(string, array) {
    
    arreglo= [] ;
    for (let i = 0; i < array.length; i++) {
            if(array[i].length> string.length){
                arreglo.push(array[i]);
            }
    }
    return arreglo;
}