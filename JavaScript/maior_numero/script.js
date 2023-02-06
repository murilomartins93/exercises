const result = document.getElementById("dados").innerHTML.split("\n").map(x => Number(x));

let bigger = result[0]; 
result.forEach(x => {
    if (x > bigger) {
        bigger = x;
    }
});

console.log(bigger);