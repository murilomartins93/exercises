const inner = document.getElementById("dados").innerHTML.split("\n").map(x => Number(x));

let count = 0;
let sum = 0;

inner.forEach(x => {
   if(x > 0) {
    sum += x;
    count++;
   } 
});

let result = count != 0 ? `MEDIA = ${(sum / count).toFixed(2)}` : `IMPOSSÍVEL CALCULAR`; 
console.log(result);