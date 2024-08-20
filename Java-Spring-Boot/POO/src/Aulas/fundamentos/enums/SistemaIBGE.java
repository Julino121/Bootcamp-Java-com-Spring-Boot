package Aulas.fundamentos.enums;

import java.util.Scanner;

public class SistemaIBGE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer opcao = 0;
        for(EstadosBrasileiros uf: EstadosBrasileiros.values() ) {
            System.out.println(opcao + "-> " + uf.getSigla() + "-" + uf.getNomeMaiusculo());
            opcao++;
        }

        System.out.println("Escolha o estado que deseja");
        EstadosBrasileiros ufSelecionado = EstadosBrasileiros.values()[sc.nextInt()];

        System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
    }

}
