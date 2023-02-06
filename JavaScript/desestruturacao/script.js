const obj = {
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
      active: true
  }
};

const { id, client } = obj;
console.log(id);
console.log(client);

// ----------
function subTotal1(item) {
  return item.price *item.quantity;
}
console.log(subTotal1(obj.items[1]));

// ou
function subTotal2( { price, quantity }) {
  return price * quantity;
}
console.log(subTotal2(obj.items[1]));

// ----------

function total( { items } ) {
  let sum = 0;
  for (let i = 0; i < items.length; i++) {
    sum += subTotal2(items[i]);
  }
  return sum;
}
console.log(total(obj));

// ---------- Atribuir a uma estrutura já desestruturada 

const [item1, item2] = obj.items;
console.log(item1);
console.log(item2);