public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    public void tocar() {
        System.out.println("Tocando a faixa.");
    }

    public void pausar() {
        System.out.println("Faixa pausada.");
    }

    public void ligar() {
        System.out.println("Ligando para o número.");
    }

    public void atender() {
        System.out.println("Ligação atendida.");
    }

    public void abrirPágina() {
        System.out.println("Página carregando.");
    }

    public void exibirPágina() {
        System.out.println("Página em exibição.");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.ligar();
        iphone.atender();
        iphone.abrirPágina();
        iphone.exibirPágina();
    }

}
