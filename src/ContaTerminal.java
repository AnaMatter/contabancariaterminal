import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agencia!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo");
        saldo = scanner.nextDouble();

        String mensagem = """
                Olá, %s , obrigado por criar uma conta em nosso banco, sua agência é %s 
                conta %d e seu saldo de %.2f já está disponível para saque"
            
                """.formatted(nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);
    }
}