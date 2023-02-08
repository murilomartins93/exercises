const cep = "15020340";
const cep2 = "14070440";
const url = `http://viacep.com.br/ws/${cep}/json/`;

const fetchResult = fetch(url);

async function getJsonResponse(url) {
  const response = await fetch(url);
  const jsonBody = await response.json();
  return jsonBody;
}

// Console.log é sincrono, enquanto a função é assincrona
console.log(getJsonResponse(url));
// Logo, a chamada de uma função async dentro de uma função sync, vai imprimir a promise
// Uma solução é usar o .then
getJsonResponse(url)
  .then(result => {
    console.log(result);
  })
// Outra opção é criar uma função async 
async function showCepData(cep) {
  const url = `http://viacep.com.br/ws/${cep}/json/`;
  const json = await getJsonResponse(url);
  console.log(json);
}

showCepData(cep2);

console.log("A");
console.log("B");
console.log("C");