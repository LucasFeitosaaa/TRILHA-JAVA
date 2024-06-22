public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaInvestimento ci = new ContaInvestimento();

        cc.depositar(45.0);
        System.out.println("Saldo Conta Corrente: R$" + cc.getSaldo());

        cc.sacar(20.0);
        System.out.println("Seu novo saldo é: R$" + cc.getSaldo());

        ci.depositar(50.0);
        System.out.println("Você possui investido: R$" + ci.getSaldo());

        cc.transferir(ci, 25.0);
        System.out.println("Saldo Conta Corrente após transferência: R$" + cc.getSaldo());
        System.out.println("Saldo Conta Investimento após receber transferência: R$" + ci.getSaldo());
    }

    }

