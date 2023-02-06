// REST: valores passados com virgula => array

function sum(...numbers) {  // rest - numbers is a vector
  let total = 0;
  for (let i = 0; i < numbers.length; i++) {
    total = total + numbers[i];
  }
  return total;
}

const result1 = sum(2, 3, 10, 5); // com rest na função, pode passar os números com vírgula
console.log(result1);

const result2 = Math.max(2, 3, 10, 5); // a função Math.max tem rest imbutido 
console.log(result2);
const result3 = Math.max([2, 3, 10, 5]); // mão funciona pois tem a função tem rest
console.log(result3);


// SPREAD: array => valores separados por virgula
const myNumbers = [2, 3, 10, 5];

const result4 = Math.max(myNumbers); // Nao funciona
console.log(result4);
const result5 = Math.max(...myNumbers); // Funcion, spread do array para vaores com vírgulas
console.log(result5);

// SPREAD: objeto => membros separados por virgula

const item = {
  description: "Celular",
  price: 1499.99,
  quantity: 1,
};

const obj = item // apenas uma referencia ao item original, não é cópia
const cloneItem = { ...item };
const cloneItemPlus = { ...item, weigth: 10 }; // clona e acrescenta novos membros
console.log(cloneItem);
console.log(cloneItemPlus);
