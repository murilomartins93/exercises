const x = 10;

if (x>0) {
    var a = 100;
    let b = 200;
    const c = 300;
    console.log("Imprimindo dentro do If:")
    console.log(a);
    console.log(b);
    console.log(c);
}

console.log("Imprimindo fora do If:")
console.log(a); // Var Vaza o escopo de uma estrutura de controle
//console.log(b);
//console.log(c);

console.log("Imprimindo resultado do For:")
for (let i = 0; i < 5; i++) {
    console.log(i);
}
// console.log(i) let não vaza escopo
// no caso do for tem que ser let pois a variável precisa mudarconsole.log("Imprimindo fora do If:")