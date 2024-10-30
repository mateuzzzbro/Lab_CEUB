public class Professor extends Pessoa {
    private String disciplina;
    // Construtor
    public Professor(String nome, int idade, String disciplina) {
    super(nome, idade); // Chama o construtor da superclasse
    this.disciplina = disciplina;
    }
    // Método para exibir informações do professor
    @Override
    public void exibirInfo() {
    super.exibirInfo(); // Chama o método exibirInfo da superclasse
    System.out.println("Disciplina: " + disciplina);
    }
    }