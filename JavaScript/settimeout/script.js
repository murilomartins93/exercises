//Espera sincrona - NÃO FAZER!!!!!!!!!!
function wait(ms) {
  const end = Date.now() + ms;
  while (Date.now() < end) {
  }
}

console.log("X");
wait(100);
console.log("Y")

// Espera Assincrona

function sayHi() {
  console.log("Olá");
}

//setTimeout(sayHi, 2000);

function sayGoodMorning(nome) {
  console.log("Bom dia " + nome);
}

// Função anonima para passar argumentos no setTimeout

setTimeout(() => {
  sayGoodMorning("Maria");
}, 2000);

setTimeout(() => {
  sayGoodMorning("Maria");
  setTimeout(() => {
    sayGoodMorning("João");
    setTimeout(() => {
      sayGoodMorning("Jorge");
    }, 2000);
  }, 2000);
}, 2000);

console.log("A");
console.log("B");