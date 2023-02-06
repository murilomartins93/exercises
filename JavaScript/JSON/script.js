const produto = {
  nome: "Computador",
  preço: 3000.0
}

// Dentro do JS e HTTP
const obj1 = {
  "name": "Computador",
  "price": 50.9,
  "due-date": "2025-04-15"
}

// Dentro do JS apenas
const obj2 = {
  name: "Computador",
  price: 50.9,
  "due-date": "2025-04-15"
}

const obj3 = {
  id: 53,
  date: "2021-10-20",
  items: [
      {
          description: "Celular",
          price: 1499.99,
          quantity: 1
      },
      {
          description: "Mouse",
          price: 100.0,
          quantity: 2
      }
  ],
  client: {
      name: "Maria Red",
      email: "maria@gmail.com",
      active: false
  }
};

console.log(obj1);
console.log(obj2);
console.log(obj3);

console.log(obj3.id);
console.log(obj3.items[1].description);
console.log(obj3.client);
console.log(obj3.client.name);

//Parse text to JSON
const txt = `{"name": "Computador", "price": 50.9, "due-date": "2025-04-15"}`;
const obj = JSON.parse(txt);
console.log(txt);
console.log(txt.name);
console.log(obj.name);

//Parse JSON to text
const text = JSON.stringify(obj3); 
console.log(text);