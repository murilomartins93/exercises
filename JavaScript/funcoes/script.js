// Function declaration in JavaScript

function sum1(num1, num2) {
  return num1 + num2;
}

const sum2 = function(num1, num2) {
  return num1 + num2;
}

const sum3 = (num1, num2) => {
  return num1 + num2;
}

const sum4 = (num1, num2) => num1 + num2;

const double1 = function(num) {
  return num * 2;
};

const double2 = num => num * 2;

// Função sem retorno definido, retorna undefined como padrão
function mostrarPreco(preco) {
  console.log("Preço = " + preco);
}

// Variáveis definidas dentro do escopo da função não vazam escopo para fora (Mesmo com VAR)
// Var apenas vaza em estruturas de controle

function areaCirculo(raio) {
  var pi = 3.14;
  return pi * (raio ** 2);
}

// Function hoisting: função no JS são "movidas" para cima pelo motor do JS

test(10);  // as definições de função vão pra cima e funciona chamar a função mesmo estando depois
function test(x) {
  console.log("TESTE = " + x);
}

// Funções podem ser passadas como argumento 

function triple(num) {
  return num * 3;
}

function aplicar(f, number) {
  const result = f(number);
  console.log("RESULTADO = " + result);
}

aplicar(triple, 10);
aplicar(double1, 20);