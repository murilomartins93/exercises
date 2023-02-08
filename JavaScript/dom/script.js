/*
  console.log(window);
  console.log(document);
  window.alert("Olá Mundo!");
*/

// Query Selectors
const item1 = document.querySelector("li");
console.log(item1);
console.log(item1.innerHTML);
console.log(item1.outerHTML);

const items = document.querySelectorAll("li");
console.log(items);

const card1 = document.querySelector(".card");
console.log(card1);

// Create Element
const paragraph = document.createElement("p");
paragraph.innerHTML = "Descrição";
card1.appendChild(paragraph);

// CSS Manipulation
card1.classList.add("super-border");

// Get Elements by class
const cards = document.querySelectorAll(".card");
console.log(cards);

const cards2 = document.getElementsByClassName("card");
console.log(cards2);
console.log(cards2[1]);

console.log("Node to Array")

// Convert Node List to array
console.log("With Array.from");
Array.from(cards).map(item => {
  console.log(item);
});
console.log("With spread");
[...cards].map(item => {
  console.log(item.innerHTML);
});

// Get Elements by dataset
console.log("-----------");
const card3 = document.querySelector('[class="card"]');
const card4 = document.querySelector('[data-product-id="32"]');
console.log(card3);
console.log(card4);
