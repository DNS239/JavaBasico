public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligarDesligar() {
        ligada =!ligada;
        System.out.println("TV " + (ligada? "Ligada" : "Desligada"));
    }

    public void mudarCanal(int novoCanal) {
        if(ligada && novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("TV desligada ou canal inválido");
        }
        
    }

    public void aumentarVolume() {
        if(ligada && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("TV desligada ou volume máximo atingido");
        }
    }

    public void diminuirVolume() {
        if(ligada && volume < 100) {
            volume--;
            System.out.println("Volume diminuido para " + volume);
        } else {
            System.out.println("TV desligada ou volume minimo atingido");
        }
    }
}
