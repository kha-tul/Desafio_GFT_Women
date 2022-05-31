package desafio.gft;
/*
Tipos de Triângulos (vale 2 pontos)
Determine se um triângulo é equilátero, isósceles ou escaleno.
Um triângulo equilátero tem os três lados com o mesmo comprimento.
Um triângulo isósceles tem pelo menos dois lados com o mesmo
comprimento.
Um triângulo escaleno tem todos os lados de comprimentos diferentes.
Considere também que só irá existir um triângulo se, e somente se, os
seus lados obedeceram à seguinte regra: um de seus lados deve ser maior
que o valor absoluto (módulo) da diferença dos outros dois lados e menor
que a soma dos outros dois lados.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Informe o lado A do triangulo: ");
        a = sc.nextInt();
        System.out.print("Informe o lado B do triangulo: ");
        b = sc.nextInt();
        System.out.print("Informe o lado C do triangulo: ");
        c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.print("O triângulo é Eqüilátero!");
            } else if (a == b || a == c || b == c) {
                System.out.print("O triângulo é Isósceles!");
            } else {
                System.out.print("O triângulo é Escaleno!");
            }
        } else {
            System.out.print("Não é um triângulo");
        }
    }
}
