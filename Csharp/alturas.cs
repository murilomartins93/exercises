using System;
using System.Globalization;

namespace alturas {
    internal class Program {
        static void Main(string[] args) {

            CultureInfo ci = CultureInfo.InvariantCulture;  
            int N, i, cont;
            double somaAltura, media, porcentagem;

            Console.Write("Quantas pessoas serao digitadas: ");
            N = int.Parse(Console.ReadLine());

            string[] name = new string[N];
            int[] idade = new int[N];
            double[] altura = new double[N];

            for (i = 0; i < N; i++) {
                Console.WriteLine("Dados da " + (i + 1) + "a pessoa:");
                Console.Write("Nome: ");
                name[i] = Console.ReadLine();
                Console.Write("Idade: ");
                idade[i] = int.Parse(Console.ReadLine());
                Console.Write("Altura: ");
                altura[i] = double.Parse(Console.ReadLine(), ci);        
            }

            somaAltura = 0;
            for (i = 0; i < N; i++) {
                somaAltura += altura[i]; 
            }

            media = somaAltura / N;

            Console.WriteLine();
            Console.WriteLine("Altura media: " + media.ToString("F2", ci));

            cont = 0;
            for (i = 0; i < N; i++) {
                if(idade[i] < 16) {
                    cont++;
                }
            }

            porcentagem = (cont * 100) / N;

            Console.WriteLine("Pessoas com menos de 16 anos: " + porcentagem.ToString("F1", ci) + "%");

            for (i = 0; i < N; i++) {
                if (idade[i] < 16) {
                    Console.WriteLine(name[i]);
                }
            }


        }
    }
}
