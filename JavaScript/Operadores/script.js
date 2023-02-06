console.log("Operadores Aritméticos");
console.log(`3 + 4 = ${3 + 4}`);
console.log(`3 - 4 = ${3 - 4}`);
console.log(`3 * 4 = ${3 * 4}`);
const result = 19 / 3;
console.log(`19 / 3 = ${result} ${typeof result}`);
console.log(`19 / 3 = ${result.toFixed(2)} ${typeof result.toFixed()}`);
console.log(`19 % 3 = ${19 % 3}`);
console.log(`3 ** 4 = ${3 ** 4}`);

console.log("Operadores comparativos");
console.log(`10 > 5 = ${10 > 5}`);
console.log(`10 < 5 = ${10 < 5}`);
console.log(`10 >= 5 = ${10 >= 5}`);
console.log(`10 <= 5 = ${10 <= 5}`);

console.log("Operadores comparativos de igualdade");
console.log(`"" == false: ${"" == false}`); //Converte para um tipo em comum, depois compara
console.log(`"" === false: ${"" === false}`);  //Compara levando em conta também o tipo
console.log(`"17" == 17: ${"17" == 17}`);  
console.log(`"17" === 17: ${"17" === 17}`);

console.log("Operadores comparativos de igualdade");
const x = "Maria";
const y = "Maria";
const a = new String("Maria");
const b = new String("Maria");
console.log(`const x = "Maria"`);
console.log(`const y = "Maria"`);
console.log(`const a = new String("Maria")`);
console.log(`const b = new String("Maria")`);
console.log(`x === y: ${x === y}`); //valores iguais
console.log(`a === b: ${a === b}`);  //objetos diferentes
console.log(`a === b valores: ${a.valueOf === b.valueOf}`);  //objetos diferentes
console.log(`typeof x: ${typeof x}`);
console.log(`typeof a: ${typeof a}`);

console.log("Operadores lógicos");
console.log(`(10 > 5) && (10 > 20): ${(10 > 5) && (10 > 20)}`);
console.log(`(10 > 5) && (10 < 20): ${(10 > 5) && (10 < 20)}`);
console.log(`(10 > 5) || (10 > 20): ${(10 > 5) || (10 > 20)}`);
console.log(`(10 < 5) || (10 > 20): ${(10 > 5) && (10 > 20)}`);
console.log(`!(10 > 5): ${!(10 > 5)}`);