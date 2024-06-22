public class ContaBanco {
    private double saldo;

    public ContaBanco() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
         saldo += valor;
         System.out.println("Depósito realizado: R$" + valor);   
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado: R$" + valor);
    }

    public void transferir(ContaBanco destino, double valor) {
        saldo -= valor;
        System.out.println("Transferencia Realizada: R$" + valor + " para investimento.");
        
    }
  
 

}