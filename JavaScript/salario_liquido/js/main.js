import Employee from "./models/employee.js"
import * as salaryService from "./services/salaryService.js"; 
const data = document.getElementById("grossSalaryInput").innerHTML.split("\n");

const emp = new Employee(data[0], Number(data[1]));

const netSal = salaryService.netSalary(emp);

console.log(`Funcionário = ${emp.name}`);
console.log(`Salário Bruto = ${emp.grossSalary}`);
console.log(`Salário Líquido = ${netSal.toFixed(2)}`);