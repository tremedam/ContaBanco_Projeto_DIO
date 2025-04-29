public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente = "João Silva";
        String agencia = "1234";
        int numeroConta = 56789;
        double saldo = 1000.50;

        System.out.println("Olá, " + nomeCliente + "!");
        System.out.println("Bem-vindo à sua conta.");
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }
}