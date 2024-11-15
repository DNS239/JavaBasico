public class Operadores {


    public void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM " + "JAVA";
        // System.out.println(nomeCompleto);
        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);

        // corversão de numero pra positivo
        // int numero = 5;

        // numero = - numero;
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);

        // int numero = 5;
        // //X Repetição

        // System.out.println(++ numero);
        // System.out.println(numero);

        // boolean variavel = true;
        // //System.out.println(!variavel);
        // variavel = !variavel;
        // System.out.println(variavel);

        // int a, b;
        // a = 6;
        // b = 6;

        // String resultado = a == b ? "Verdadeiro" : "FALSO";

        // // if (a==b)
        // // resultado = "Verdadeiro";
        // // else
        // // resultado = "Falso";

        // System.out.println(resultado);

        // String nomeUm = "Denis";
        // String nomeDois = new String("Denis");

        // System.out.println(nomeUm.equals(nomeDois));

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if (numero1 < numero2) {
        //     System.out.println("A nossa condiçao é verdadeira!");
        // }

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        
        // simNao = numero1 > numero2;

        // System.out.println("numeroUm é maior que numeroDois? " + simNao);

        boolean condiçao1 = true;
        boolean condiçao2 = true;

        if (condiçao1 & condiçao2) {
            System.out.println("As duas conições são verdadeiras!");
        }


        if (condiçao1 || condiçao2) {
            System.out.println("Uma duas condições é verdadeiras!");
        }

        System.out.println("Fim");
    }
}
