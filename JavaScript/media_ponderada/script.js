const inner = document.getElementById("dados").innerHTML.split("\n").map(x => Number(x));
const weights = [2, 3, 5];

let sum = 0;
let weight = 0;
for(let i = 0; i < inner.length; i++) {
    sum += inner[i] * weights[i];
    weight += weights[i];
}

console.log((sum / weight).toFixed(1));