package edu.dns.primeirasemana;
public class BoletimEstudandil {

    public static void main(String[] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");
    }
}