package DesafioControleDeFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try{
            int [] parametros = parametros();
            contar(parametros[0], parametros[1]);

        } catch (ParametrosException e) {
            System.out.println(e.getMessage());
        }

    }

    static int[] parametros() throws ParametrosException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        if (valor1 < valor2) {
            throw new ParametrosException("O primeiro valor deve ser maior que o segundo.");

        }
        return new int[]{valor1, valor2};
    }
    static void contar(int parametro1, int parametro2) {
        int iteracoes = parametro1 - parametro2;
        for (int i = 1; i <= iteracoes; i++) {
            System.out.println("Imprimindo o numero " + i);
        }


    }
}
