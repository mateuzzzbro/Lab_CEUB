public class Pessoa {
    protected String nome;
    protected int idade;
    // Construtor
    public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }
    // Método para exibir informações da pessoa
    public void exibirInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    }
    }
    