import { tax } from "./taxService.js";
import * as pensionService from "./pensionService.js";

export function netSalary(employee) {
    const pension = pensionService.discount(employee.grossSalary);
    return employee.grossSalary - tax(employee.grossSalary) - pension;
}