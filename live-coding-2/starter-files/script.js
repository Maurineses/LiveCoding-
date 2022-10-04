
// API
const API_ENDPOINT = 'https://yesno.wtf/api';


/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API
 * 2. Output the API's response
 * 3. Attach fetchAnswer to an event listener
 * 4. Clear output after 3 seconds
 * 5. Optional: add loading/error states
 *
 */

let btnSub = document.getElementById("button")
let respuesta = document.getElementById("answer");
let pregunta = document.getElementById("input");

btnSub.addEventListener("click",function (event) {
  event.preventDefault();
  if(question.value.length >5){
   let promesa = fetch('https://yesno.wtf/api', {
    method: "GET",

});
  promesa.then((response) =>{
      response.json().then( (data) =>{
        console.log(data.answer);
        answer.innerText = data.answer;
        const timeOut = setTimeout(clear, 3000);
        

      })
  })

}

});



