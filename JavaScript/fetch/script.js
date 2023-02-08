const cep = "15020340";

const fetchResult = fetch(`http://viacep.com.br/ws/${cep}/json/`);

// Fetch é Assincrono, a resposta é uma promise

fetchResult
  .then((response) => {
    console.log("Fetch Success", response);
    const json = response.json();
    json
      .then((result) => {
        console.log("JSON Success", result);
      })
      .catch((error) => {
        console.log("JSON Error", error);
      });
  })
  .catch((error) => {
    console.log("Fetch Error", error);
  });

console.log("A");
console.log("B");
console.log("C");
