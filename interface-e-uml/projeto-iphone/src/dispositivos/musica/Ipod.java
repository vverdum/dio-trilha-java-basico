package dispositivos.musica;

public class Ipod implements ReprodutorMusical {

    private String musicaAtual;

    @Override
    public String tocar(String musica) {
        this.musicaAtual = musica;
        return "Tocando música: " + musica;
    }

    @Override
    public void pausar(String musica) {
        if (musica.equals(this.musicaAtual)) {
            System.out.println("Pausando música: " + musica);
        } else {
            System.out.println("Essa música não está tocando.");
        }
    }

    @Override
    public void selecionar(String musica) {
        System.out.println("Música " + musica + " selecionada.");
        this.musicaAtual = musica;
    }
}