public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Olá " + MARIO ANDRADE + ", obrigado por criar uma conta em nosso banco, sua agência é " + 067-8 + ", conta " + 1021 + " e seu saldo " + 237.48 + " já está disponível para saque.");

        scanner.close(); // Feche o scanner quando não precisar mais.
    }
}