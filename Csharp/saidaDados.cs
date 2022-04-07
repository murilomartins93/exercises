using System;
using System.Globalization;

namespace SaídaDados {
    internal class Program {
        static void Main(string[] args) {

            Console.Write("Bom dia");
            Console.Write("Boa noite\n");

            Console.WriteLine("Bom dia");
            Console.WriteLine("Boa noite");

            int x, y;
            x = 10;
            y = 20;
            Console.WriteLine(x);
            Console.WriteLine(y);

            CultureInfo CI = CultureInfo.InvariantCulture;
            double z;
            z = 2.3456;
            Console.Write(z.ToString("F2", CI));

            int idade;
            double salario;
            string nome;
            char sexo;
            idade = 32;
            salario = 4560.9;
            nome = "Maria Silva";
            sexo = 'F';
            Console.WriteLine("A funcionaria " + nome + ", sexo"
                + sexo + ", ganha " + salario.ToString("F2", CI) 
                + " e tem " + idade + " anos");

            int a;
            double b;
            a = 5;
            b = 2 * a;
            Console.WriteLine(a);
            Console.WriteLine(b.ToString("F2", CI));

            double b1, b2, h, area;
            b1 = 6.0;
            b2 = 8.0;
            h = 5.0;
            area = (b1 + b2) / 2.0 * h;
            Console.WriteLine(area.ToString("F3", CI));

            int x1, x2;
            double resultado;
            x1 = 5;
            x2 = 2;
            resultado = (double) x1 / x2;
            Console.WriteLine(resultado.ToString("F2", CI));

            double d;
            int f;
            d = 5.0;
            f = (int)d;
            Console.WriteLine(f);

        }
    }
}
