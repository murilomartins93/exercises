using System;
using System.Globalization;

namespace retangulo {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo CI = CultureInfo.InvariantCulture;

            double a, b, area, perimetro, diagonal;

            Console.Write("Base do retangulo: ");
            b = double.Parse(Console.ReadLine(), CI);
            Console.Write("Altura do retangulo: ");
            a = double.Parse(Console.ReadLine(), CI);

            area = a * b;
            perimetro = 2 * a + 2 * b;
            diagonal = Math.Sqrt(Math.Pow(a, 2) + Math.Pow(b, 2));

            Console.WriteLine("AREA = " + area.ToString("F4", CI));
            Console.WriteLine("PERIMETRO = " + perimetro.ToString("F4", CI));
            Console.WriteLine("DIAGONAL = " + diagonal.ToString("F4", CI));
        }
    }
}
