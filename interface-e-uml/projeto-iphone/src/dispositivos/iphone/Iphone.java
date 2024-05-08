package dispositivos.iphone;

import dispositivos.internet.Internet;
import dispositivos.internet.NavegadorInternet;
import dispositivos.musica.Ipod;
import dispositivos.musica.ReprodutorMusical;
import dispositivos.telefonia.AparelhoTelefonico;
import dispositivos.telefonia.Telefone;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private Ipod ipod;
    private Telefone telefone;
    private Internet internet;
    @SuppressWarnings("unused")
    private String musica;

    public Iphone() {
        this.ipod = new Ipod();
        this.telefone = new Telefone();
        this.internet = new Internet();
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - iPod");
        System.out.println("2 - Telefone");
        System.out.println("3 - Internet");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (opcao) {
            case 1:
                iphone.usarIpod(scanner);
                break;
            case 2:
                iphone.usarTelefone(scanner);
                break;
            case 3:
                iphone.usarInternet();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }

    private void usarIpod(Scanner scanner) {
        System.out.println("Digite o nome da música:");
        String musica = scanner.nextLine();

        this.ipod.tocar(musica);

        System.out.println("Tocando: " + musica);
        System.out.println("Escolha uma ação:");
        System.out.println("1 - Pausar");
        System.out.println("2 - Selecionar outra música");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (opcao) {
            case 1:
                this.ipod.pausar(musica);
                break;
            case 2:
                System.out.println("Digite o nome da nova música:");
                String novaMusica = scanner.nextLine();
                this.ipod.selecionar(novaMusica);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private void usarTelefone(Scanner scanner) {
        System.out.println("Digite o número de telefone:");
        String numero = scanner.nextLine();

        this.telefone.ligar(numero);

        System.out.println("Escolha uma ação:");
        System.out.println("1 - Atender");
        System.out.println("2 - Iniciar correio de voz");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (opcao) {
            case 1:
                this.telefone.atender();
                break;
            case 2:
                this.telefone.iniciarCorreioVoz();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private void usarInternet() {
        this.internet.exibirPagina();

        System.out.println("Escolha uma ação:");
        System.out.println("1 - Adicionar nova aba");
        System.out.println("2 - Atualizar página");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (opcao) {
            case 1:
                this.internet.adicionarNovaAba();
                break;
            case 2:
                this.internet.atualizarPagina();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
    

    // Implementações dos métodos das interfaces (delegam para os objetos internos)
    @Override
    public String tocar(String musica) {
        this.musica = musica;
        return this.ipod.tocar(musica);
    }

    @Override
    public void pausar(String musica) {
        this.ipod.pausar(musica);
    }

    @Override
    public void selecionar(String musica) {
        this.ipod.selecionar(musica);
    }

    @Override
    public void ligar(String numeroTelefone) {
        this.telefone.ligar(numeroTelefone);
    }

    @Override
    public void atender() {
        this.telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        this.telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        this.internet.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        this.internet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        this.internet.atualizarPagina(); 
    }
    
    
}
