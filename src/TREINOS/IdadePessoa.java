package TREINOS;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    boolean verificarIdade(int idade) {
        this.idade = idade;
        if (idade >= 18) {
            return true;
        }
        return false;
    }
}
