// COMO PEGAR UM ELEMENTO DO HTML POR ID

const elem = document.getElementById("dados"); //acessa o documento Html e pega o elemento do ID
console.log(elem);

// COMO PEGAR O CONTEÚDO DENTRO DE UM ELEMENTO HTML

const conteudo = elem.innerHTML;
console.log(conteudo);

// COMO RECORTAR UM STRING COM BASE EM UM SEPARADOR

const nomeCompleto = "Maria Silva Borges Coelho";
const result1 = nomeCompleto.split(" ");
console.log(result1);

const result2 = conteudo.split('\n'); //Quebra de linha como separador
console.log(result2);

// COMO CONVERTER UM ARRAY DE STRINGS EM UM ARRAY DE NÚMEROS

const str = "4.5";
console.log(`${str} ` + typeof str);
const n = Number(str);
console.log(`${n} ` + typeof n);

const numeros = result2.map(x => Number(x)); // Cada elemento x do array em number de x
console.log(numeros);

// COMO MOSTRAR UM NÚMERO COM ARREDONDAMENTO

const x = numeros[2];
console.log(x.toFixed(2));

console.log(numeros[0].toFixed(1));