import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContaTerminal {
    private int numero = 0;
    private String agencia = "";
    private String nomeCliente = "";

    private float saldo = 100f;

    public static void main(String[] args) {
        ContaTerminal contaterminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá esta é o Banco Digial!");
        System.out.println("Agora iremos criar a sua conta e para isso " +
                "siga as etapas!");
        System.out.println("Por favor, digite o número da Agência !");
        contaterminal.agencia = scanner.next();

        System.out.println("Agora, digite o número da Conta!");
        contaterminal.numero = scanner.nextInt();

        System.out.println("Agora, digite o seu Nome!");
        contaterminal.nomeCliente = scanner.next();

        System.out.println("Agora, digite o seu saldo!");
        contaterminal.saldo = scanner.nextFloat();

        System.out.println("Olá " + contaterminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                contaterminal.agencia + ", conta " + contaterminal.numero + " e seu saldo " + contaterminal.saldo + " já está disponível para saque");

    }
}