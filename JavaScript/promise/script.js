function f(g, h) {
  setTimeout(() => {
    if (10 < 0) {
      g("P");
    } else {
      h("Q");
    }
  }, 3000);
}

const myPromise = new Promise(f);

myPromise
  .then((value) => {
    console.log("Resolveu com o valor " + value);
  })
  .catch((value) => {
    console.log("Rejeitada com o valor " + value);
  });

console.log(myPromise);

/*
  function executeIfResolved(value) {
  console.log("Resolveu com o valor " + value);
  }

function executeIfRejected(value) {
  console.log("Rejeitada com o valor " + value);
}

  myPromise.then(executeIfResolved);
ou
  myPromise.then((value) => {
  console.log("Resolveu com o valor " + value);
  });

  myPromise.catch(executeIfRejected);
*/
