public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligarDesligar();
        // smartTv.ligarDesligar();
        smartTv.mudarCanal(25);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
    }
}
