public class Aluno extends Pessoa {
    private String matricula;
    private double mencao1;
    private double mencao2;
    // Construtor
    public Aluno(String nome, int idade, String matricula, double mencao1, double mencao2) {
    super(nome, idade); // Chama o construtor da superclasse
    this.matricula = matricula;
    this.mencao1 = mencao1;
    this.mencao2 = mencao2;
    }
    // Método para calcular a média final
    public double mediaFinal() {
    return (mencao1 + mencao2) / 2;
    }
    // Método para exibir informações do aluno
    @Override
    public void exibirInfo() {
    super.exibirInfo(); // Chama o método exibirInfo da superclasse
    System.out.println("Matrícula: " + matricula);
    System.out.println("Menção 1: " + mencao1);
    System.out.println("Menção 2: " + mencao2);
    System.out.println("Média Final: " + mediaFinal());
    }
    }
    