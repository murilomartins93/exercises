const list1 = [1, 2, 3, 4];
const list2 = [];
const nomes = ['MARIA', 'JOAO', 'ANABELA'];

// ------------------------------------------------------------
// map: aplica uma função a cada elemento da coleção original, 
// retornando uma nova coleção com os elementos alterados

function double(x) {
  return x * 2;
}

function triple(x) {
  return x * 3;
}

const m1 = list1.map(double); //passando a ref para a função
const m2 = list1.map(triple);
const m3 = list1.map(x => x * 4);

console.log("MAP ------------------------");
console.log(m1);
console.log(m2);
console.log(m3);

// ------------------------------------------------------------
// filter: retorna uma nova coleção contendo apenas 
// aqueles elementos da coleção original que 
// satisfazem um dado predicado

function odd(x) {
  return x % 2 != 0;
}

const f1 = list1.filter(odd);
const f2 = list1.filter(x => x % 2 == 0);
const f3 = list1.filter(x => x > 2);

console.log("FILTER ------------------------");
console.log(f1);
console.log(f2);
console.log(f3);

// -------------------------------------------------------------
// reduce: aplica cumulativamente uma função aos elementos de 
// uma coleção, retornando o resultado final cumulativo.
// * você pode informar, opcionalmente, um valor inicial como parâmetro (necessário para coleção vazia).

function sum(x, y) {
  return x + y;
}

function product(x, y) {
  return x * y;
}

const r1 = list1.reduce(sum);
const r2 = list2.reduce(sum, 0); //necessáirio elemento incial pois a lista é vazia
const r3 = list1.reduce(product); 
const r4 = list1.reduce(product, 1); // o elemento neutro aqui deve ser 1, senão a multiplicaçao é igual a 0
const r5 = list1.reduce(product, 0); 


console.log("REDUCE ------------------------");
console.log(r1);
console.log(r2);
console.log(r3);
console.log(r4);
console.log(r5);

// ------------------------------------------------------------
// sort: ordena a coleção conforme a função de comparação 
// informada como parâmetro
// ALTERA O VETOR E NÃO CRIA UM NOVO

function compareBySize(s1, s2) {
  return s1.length - s2.length;
}

console.log("SORT -----------------------------");

const s1 = nomes.sort();  // por padrão, sort ordena em ordem alfabética
console.log(s1); 

const s2 = nomes.sort(compareBySize);
console.log(s2);

const s3 = nomes.sort((x, y) => y.length - x.length); // por tamanho decrescente
console.log(s3);

const s4 = [...nomes].sort((x, y) => x.length - y.length); // por tamanho crescente sem mudar o s3
console.log("s3: " + s3 + "\ns4: " + s4);  // [...name] spread que clona o vetor sem alterar o original