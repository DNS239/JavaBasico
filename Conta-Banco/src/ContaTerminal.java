import java.util.Scanner;

public class ContaTerminal {
    private double saldo;
    private String cliente;
    private String agencia;
    private String numeroConta;

    // Construtor da classe ContaTerminal
    public ContaTerminal(double saldoInicial, String cliente, String agencia, String numeroConta) {
        this.saldo = saldoInicial;
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    // Método para realizar o saque
    public void sacar(double valorSolicitado) {
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque de R$" + valorSolicitado + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método para exibir a mensagem de boas-vindas
    public void exibirBoasVindas() {
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando dados do cliente e da conta
        System.out.println("Digite o nome do cliente:");
        String cliente = sc.nextLine();

        // Verificando se o usuário informou um número de agência
        String agencia;
        do {
            System.out.println("Digite o número da agência:");
            agencia = sc.nextLine();
            if (agencia.isEmpty()) {
                System.out.println("Número da agência não pode ser vazio. Por favor, informe o número da agência.");
            }
        } while (agencia.isEmpty()); // Repete até que o usuário insira um número de agência válido

        // Verificando se o usuário informou um número de conta
        String numeroConta;
        do {
            System.out.println("Digite o número da conta:");
            numeroConta = sc.nextLine();
            if (numeroConta.isEmpty()) {
                System.out.println("Número da conta não pode ser vazio. Por favor, informe o número da conta.");
            }
        } while (numeroConta.isEmpty()); // Repete até que o usuário insira um número de conta válido

        // Criando a conta com saldo inicial
        ContaTerminal conta = new ContaTerminal(100.0, cliente, agencia, numeroConta);

        // Exibe a mensagem de boas-vindas
        conta.exibirBoasVindas();

        // Primeira simulação de saque
        System.out.println("\nPrimeira simulação:");
        conta.sacar(18.0);

        // Segunda simulação de saque
        System.out.println("\nSegunda simulação:");
        conta.sacar(22.0);
    }
}
