const inner = document.getElementById("dados").innerHTML.split("\n").map(x => Number(x));
const interval = [10, 20];

let inside = 0;
let outside = 0;
inner.forEach(x => {
      x >= interval[0] && x <= interval[1] ? inside++ : outside++;
   } 
);

console.log(`${inside} DENTRO\n${outside} FORA`);