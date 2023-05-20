// Desafio
// Desenvolva um programa que receba uma string S como entrada e retorne a mesma string S com as vogais em caixa alta e as consoantes em caixa baixa. O programa deve imprimir a string gerada na saída padrão.

// Entrada
// Uma string qualquer.

// Saída
// A string informada com as vogais em caixa alta e as consoantes em caixa baixa.

// Exemplos

// A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

// Entrada -> Saída
// Hello World -> hEllO wOrld

// Java eh a melhor linguagem de programacao -> jAvA Eh A mElhOr lIngUAgEm dE prOgrAmAcAO

// Kotlin eh a melhor linguagem de programacao depois do Java -> kOtlIn Eh A mElhOr lIngUAgEm dE prOgrAmAçãO dEpOIs dO jAvA

import java.util.Arrays;
import java.util.Scanner;

public class Desafio_2_Intermediário_Manipulação_de_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();
        StringBuilder fraseModificada = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (Character.isLetter(letra)) {
                if ("AEIOUaeiou".indexOf(letra) != -1) {
                    fraseModificada.append(Character.toUpperCase(letra));
                } else {
                    fraseModificada.append(Character.toLowerCase(letra));
                }
            } else {
                fraseModificada.append(letra);
            }
        }

        System.out.println(fraseModificada.toString());
    }
}
