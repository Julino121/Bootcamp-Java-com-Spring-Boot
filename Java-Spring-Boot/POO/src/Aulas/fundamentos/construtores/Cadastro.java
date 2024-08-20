package Aulas.fundamentos.construtores;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da Pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite o endereço da Pessoa: ");
        String endereco = sc.nextLine();
        System.out.println("Digite o cpf da Pessoa: ");
        String cpf = sc.nextLine();

        Pessoa cadastro = new Pessoa(nome, endereco, cpf);

        //

        System.out.println("\n NOME: " + cadastro.getNome() + "\n CPF: " + cadastro.getCpf() + "\n ENDEREÇO: " + cadastro.getEndereco());
    }

}
