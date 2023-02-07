import * as nb from './numbers.js'
// import { sum, round } from './numbers.js' não necessita do apelido
import Product from './product.js' // import explícito para chamada do objeto
// import Prod from './product.js'  pode dar apelido pra importação padrão pois foi exportada a classe Product como padrão

const x = nb.sum(3, 4);
console.log(x);

console.log(nb.round(3.343, 1));

const obj = new Product("Computer", 800.00, 10);
// const obj = new Prod("Computer", 800.00, 10);
console.log(obj);

/*  Export e Export Default
    Ambos comandos são utilizados para criar módulos, e permitir que ao importar em outro
    arquivo, possa ser utilizado tudo que há naquele módulo.
    A principal diferença é, como o próprio nome sugere (default), o export default é o 
    membro (class, variável, const, etc) se expõe por padrão naquele módulo e, portanto, 
    só pode haver um membro padrão sendo exportado por módulo.
    Qual a vantagem disso?
    Diferente de um export explícito ou nomeado, o default não precisa ser referenciado 
    com o mesmo nome ao ser importado.
*/ 