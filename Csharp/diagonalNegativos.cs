using System;

namespace diagonalNegativos {
    internal class Program {
        static void Main(string[] args) {

            int N, i, j;

            Console.Write("Qual a ordem da matriz? ");
            N = int.Parse(Console.ReadLine());

            int[,] mat = new int[N, N];

            // Entrada de dados
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    Console.Write("Elemento [" + i + "," + j + "]: ");
                    mat[i, j] = int.Parse(Console.ReadLine());
                }
            }

            Console.WriteLine();
            Console.WriteLine("DIAGONAL PRINCIPAL:");
            // Diagonal Principal
            for (i = 0; i < N; i++) {
                Console.Write(mat[i, i] + " ");
            }

            // Quantidade de Negativos

            int count = 0;
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                    if (mat[i, j] < 0) {
                        count++;
                    }
                }
            }

            Console.WriteLine();
            Console.WriteLine("QUANTIDADE DE NEGATIVOS = " + count);
        }
    }
}
