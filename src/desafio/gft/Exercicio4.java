package desafio.gft;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



            System.out.println("\n\tEscolha o que deseja fazer:\n" +
                    "\t1 inserir um contato\n" + "\t2 Remover um contato\n" + "\t3 Editar Contato\n");

            while(true) {
                String opcao = scanner.next();
                if (opcao.equals("1"))
                    System.out.println("Contato inserido!");
                if (opcao.equals("2"))
                    System.out.println("Contato Removido!");
                if (opcao.equals("3"))
                    System.out.println("Contato Editado!");
                if (opcao.equals("0")) break;
            }
            System.out.println("Valor inválido!");
            }
        }

