public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero++) {
            if (numero == 3) {
                System.out.println("Numero 3 encontrado. Saindo do loop.");
                break; // interrompe o loop
            }
            System.out.println("Numero: " + numero); 
        } 
    }
}
