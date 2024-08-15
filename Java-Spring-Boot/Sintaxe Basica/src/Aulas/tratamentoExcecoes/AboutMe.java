package Aulas.tratamentoExcecoes;

import java.util.Scanner;

public class AboutMe {
    public void dados() {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite a idade:");
            int idade = sc.nextInt();

            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
