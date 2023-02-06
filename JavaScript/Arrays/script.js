// TAMANHO DO ARRAY

const values = [1, 2, 3]
const valores = ["Maria", 37, false, 1.64];
const t1 = valores.length;
const t2 = values.length;

console.log("Teste length");
console.log(t1);
console.log(t2);

// REMOVER ELEMENTOS:

const nomes = ["Maria", "João", "Ana", "Marcos"];
const r1 = nomes.pop(); // remove last element
const r2 = nomes.shift(); // remove first element

console.log("Teste pop e shift");
console.log(r1);
console.log(r2);
console.log(nomes);

// INSERIR ELEMENTOS:

const alturas = [1.65, 1.82, 1.7];
alturas.push(1.75);
alturas.unshift(1.58);

console.log("Teste push e unshift");
console.log(alturas);

// INSERIR E REMOVER GERAL

const letras = ["A", "B", "C", "D", "E", "F"];
console.log("Teste splice");
console.log(`Before = ${letras}`);
letras.splice(2, 3); // remove 3 starting at index 2 inclusive
console.log(`After removing 3 starting at index 2 = ${letras}`);
letras.splice(2, 0, "X", "Y"); // inserting starting at index 2
console.log(`After inserting 2 starting at index 2 = ${letras}`);
letras.splice(3, 2, "1", "2"); // replacing starting at index 3
console.log(`After replacing 2 starting at index 3 = ${letras}`);

// CONCATENAR ARRAYS

const meninas = ["Maria", "Ana"];
const meninos = ["João", "Marcos"];

const todos = meninas.concat(meninos);
console.log("Teste Concat");
console.log(todos);

// ACESSO E ATRIBUIÇÃO

const idades = [20, 30, 40, 50];
idades[1] = 38;

console.log("Teste acesso e atribuição");
console.log(idades);

// PERCORRER ARRAY

const frutas = ["Banana", "Laranja", "Uva"];

console.log("Teste percorrer array");
for (let i = 0; i < frutas.length; i++) {
  console.log(frutas[i]);
}

// PERCORRER ARRAY COM FOREACH

console.log("Teste percorrer array com forEach");
frutas.forEach(item => {
  console.log(item);
});