const p1 = {
  name: "Computador",
  price: 3000,
  quantity: 2,
};

const Product = function (name, price, quantity) {
  this.name = name;
  this.price = price;
  this.quantity = quantity;
  this.label = function() {   // Override the prototype function
    return `Dados Função Interna: ${this.name}, ${this.price.toFixed(2)}, ${this.quantity}.`;
  }
};

const p2 = new Product("Mouse", 200, 3);

Product.prototype.total = function () {
  return this.price * this.quantity;
};
const p3 = new Product("Monitor", 800, 10);

Product.prototype.add = function (amount) {
  this.quantity += amount;
};

Product.prototype.remove = function (amount) {
  if (this.quantity >= amount) {
    this.quantity -= amount;
  }
};

Product.prototype.label = function () {
  return `Dados: ${this.name}, ${this.price.toFixed(2)}, ${this.quantity}.`;
};

// Classe

class Product2 {
  constructor(name, price, quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  total() {
    return this.price * this.quantity;
  }
  add(amount) {
    this.quantity += amount;
  }
  remove(amount) {
    if (this.quantity >= amount) {
      this.quantity -= amount;
    }
  }
  label() {
    return `Dados: ${this.name}, ${this.price.toFixed(2)}, ${this.quantity}.`;
  }
}
