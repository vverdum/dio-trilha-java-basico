public class SmartTv {

    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;

    public static void ligar() {
        ligada = true;
        }
    public static void desligar() {
        ligada = false;
        }
    public static void aumentarVolume(){
        volume++;
    }
    public static void diminuirVolume(){
        volume--;
    }
    public static void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    }