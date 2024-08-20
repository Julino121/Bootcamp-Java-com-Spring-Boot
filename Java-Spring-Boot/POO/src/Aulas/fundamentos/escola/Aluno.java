package Aulas.fundamentos.escola;

public class Aluno {
    private String nome;
    private int idade;
    private String email;


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
