package edu.dns.segundasemana;
public class MinhaClasse {

public static void main (String [] args) {

    String primeiroNome = "Dns";
    String segundoNome = "Ajala";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resutado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);
}

}