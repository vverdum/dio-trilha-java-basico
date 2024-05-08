package dispositivos.musica;

public interface ReprodutorMusical {
    String tocar(String musica);
    void pausar(String musica);
    void selecionar(String musica);
}
