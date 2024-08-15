package Aulas.estruturaRepeticao;

import java.util.Random;

public class ExemploDoWhile {

    public void ligando() {
        System.out.println("Ligando...");
        do{
            System.out.println("Telefone Tocando... ");
        }
        while(tocando());

        System.out.println("Alô...");

    }


    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?: " + atendeu);
        return !atendeu;
    }
}
