import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitação dos dados da conta
            System.out.println("Programa: Por favor, digite o número da Agência!");
            String agencia = scanner.nextLine();

            System.out.println("Programa: Por favor, digite o número da Conta!");
            int numeroConta = Integer.parseInt(scanner.nextLine());

            System.out.println("Programa: Por favor, digite o Nome do Cliente!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Programa: Por favor, digite o Saldo da Conta!");
            double saldo = Double.parseDouble(scanner.nextLine());

            // Exibição das informações da conta
            System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numeroConta)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque."));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
