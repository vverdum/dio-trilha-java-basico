public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        @SuppressWarnings("unused")
        SmartTv smartTv = new SmartTv();

        System.out.println("TV smart ligada? "+ SmartTv.ligada);
        System.out.println("Qual é o canal atual? "+ SmartTv.canal);
        System.out.println("Em que volume está atualmente? "+ SmartTv.volume);

        SmartTv.ligar();
        System.out.println("TV smart ligada agora? "+ SmartTv.ligada); 

        SmartTv.desligar();
        System.out.println("TV smart ligada agora? "+ SmartTv.ligada); 
        
        SmartTv.mudarCanal(13);
        System.out.println("Qual é o canal atual? "+ SmartTv.canal);

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();
        System.out.println("Em que volume está atualmente? "+ SmartTv.volume);



    }
    


}
