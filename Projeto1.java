import java.sql.SQLException;
import java.util.Scanner;

public class Projeto1 {

    public static void main(String[] args) throws SQLException {
        ContaBancaria c1 = new ContaBancaria();
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("----------------$$$$---------------");
            System.out.println("-------------BANCO FUN-------------");
            System.out.println("1-ABERTURA DE CONTA");
            System.out.println("2-OPERAR CONTA");
            System.out.println("3-LISTAR CONTAS");
            System.out.println("4-SAIR DO SISTEMA");

            numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    c1.abrirConta();
                    break;

                case 2:
                    c1.operarConta();
                    break;

                case 3:
                    c1.listarContas();
                    break;

                case 4:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (numero != 4);
    }
}
