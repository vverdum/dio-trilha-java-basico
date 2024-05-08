
package dispositivos.internet;

public class Internet implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página atual.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual.");
    }
}
