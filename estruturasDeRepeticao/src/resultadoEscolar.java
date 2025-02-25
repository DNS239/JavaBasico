public class resultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;
        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";// Condiçaõ termnaria
        String resultado = nota >= 7 ? "Aprovado" : nota>= 5 && nota <7 ? "Recuperação" : "Reprovado";// Condiçaõ termnaria

        System.out.println("Resultado: " + resultado);

        // if (nota == 7)
        // System.out.println("Aprovado");

        // else if (nota >= 5 && nota < 7)// True or False
        // System.out.println("Prova de recuperação");

        // else
        // System.out.println("Reprovado");
    }
}
