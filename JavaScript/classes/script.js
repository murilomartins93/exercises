class Product {
  constructor(name, price, quantity){
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
    if(this.quantity >= amount) {   // If the amount is bigger, it can't remove the quantity
      this.quantity -= amount;
    } 
  }
  label() {
    return `Dados: ${this.name}, ${this.price.toFixed(2)}, ${this.quantity}.`;
  }
}

const p1 = new Product("Tv", 1500.00, 10);