// Desafio
// Desenvolva um programa que receba um número inteiro N como entrada e gere uma matriz NxN preenchida com valores inteiros sequenciais. O programa deve calcular a soma dos valores da diagonal principal da matriz e imprimir o resultado na saída padrão.

// Entrada
// Um número inteiro N (1 <= N <= 100).

// Saída
// Um número inteiro representando a soma dos valores da diagonal principal da matriz.

// Exemplos
// A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

// Entrada	Saída
// 2 -> 5

// 4 -> 34

// 5 -> 505

import java.util.Scanner;
public class Desafio_3_Avançado_Soma_da_diagonal_principal {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[][] matriz = new int[n][n];

            int valorSequencial = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = valorSequencial;
                    valorSequencial++;
                }
            }

            int soma = 0;

            for (int i = 0; i < n; i++) {
                soma += matriz[i][i];
            }

            System.out.println(soma);
        }
    }

