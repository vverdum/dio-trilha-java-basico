package dispositivos.telefonia;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para o número: " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }
}
