import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicitação de dados ao usuário
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.println("Por favor, digite o nome do cliente");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da conta ");
            double saldo = scanner.nextDouble();

            // Exibição da mensagem final
            System.out.println("\nolá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponível para saque.");
        }
    }
}