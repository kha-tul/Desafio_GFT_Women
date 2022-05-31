package desafio.gft;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

/*
Telefone Encriptado (vale 3 pontos)
Em alguns lugares é comum lembrar um número do telefone associando
seus dígitos a letras. Dessa maneira a expressão MY LOVE significa 69
5683. Claro que existem alguns problemas, uma vez que alguns números
de telefone não formam uma palavra ou uma frase e os dígitos 1 e 0 não
estão associados a nenhuma letra.
Sua tarefa é ler uma expressão e encontrar o número de telefone
correspondente baseado na tabela abaixo. Uma expressão é composta
por letras maiúsculas (A-Z), hifens (-) e os números 1 e 0.
Letras -> Número
ABC -> 2
DEF -> 3
GHI -> 4
JKL -> 5
MNO -> 6
PQRS -> 7
TUV -> 8
WXYZ -> 9
Entrada
A entrada consiste em uma expressão. Cada expressão possui C
caracteres, onde 1 ≤ C ≤ 30.
Saída

Para cada expressão você deve imprimir o número de telefone
correspondente.
Exemplo de entrada:
1-HOME-SWEET-HOME
MY-MISERABLE-JOB
Saída correspondente:
1-4663-79338-4663
69-647372253-562
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite numero: ");

        int numero = scan.nextInt();

        List<Integer> natural = Arrays.asList(7, 11);
        List<Integer> craps = Arrays.asList(2, 3, 12);
        List<Integer> ponto = Arrays.asList(4, 5, 6, 8, 9, 10);

    }
}
