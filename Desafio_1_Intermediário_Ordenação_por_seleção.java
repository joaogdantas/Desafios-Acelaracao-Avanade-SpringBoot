import java.util.Arrays;
import java.util.Scanner;

//  Desafio
//  Implemente um algoritmo de ordenação por seleção para ordenar um array de inteiros.

//  Entrada
//  Na primeira linha, informe a quantidade de números que deverá conter o Array. Na segunda linha em diante, informe os números que serão contidos no array.

//  Saída
//  O array de inteiros ordenado.

//  Exemplos
//  A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

// Entrada -> Saída

// 6 3 6 2 1 9 5 -> [1, 2, 3, 5, 6, 9]

// 3 10 8 6 -> [6, 8, 10]

// 5 3 4 2 1 5 -> [1, 2, 3, 4, 5]


public class Desafio_1_Intermediário_Ordenação_por_seleção {
    public class Problem {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] numbers;

            int arrayLength = sc.nextInt();
            numbers = new int[arrayLength];

            for(int i = 0; i < arrayLength; i++){

                numbers[i] = sc.nextInt();
                sc.nextLine();
            }

            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));

        }
    }

}
