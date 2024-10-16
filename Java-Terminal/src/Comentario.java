public class Comentario {
    public static void main(String[] args) {
        
    }


    /*  
     * Este método foi elaborado as pressas 
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou multiplicar
     * dois números
     * 
     * comando pra fazer o documento da classe 
     * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/MeuArquivo.java

     */
    public int somaMultiplica (int n, int x, String m) {
        int r = 0;
        if (m == "M") {
            r = n * x;
        }else{
            //se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
