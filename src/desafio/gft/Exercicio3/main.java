package desafio.gft.Exercicio3;

import java.util.Scanner;

public class main extends automóvel {
    public main(String combustivel, String tipo) {
        super(combustivel, tipo);

        Scanner scanner = new Scanner(System.in);
        String veiculo = scanner.next();

        System.out.println("Digite o tipo de veículo: ");

        if (veiculo == tipo) {
            System.out.println("Diesel");
        } else if (veiculo == tipoVeiculo()) {
            System.out.println("Gasolina");
        }
    }
}
