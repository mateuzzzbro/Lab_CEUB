public class Funcionario extends Pessoa {
    private String setor;
    private double salario;
    // Construtor
    public Funcionario(String nome, int idade, String setor, double salario) {
    super(nome, idade); // Chama o construtor da superclasse
    this.setor = setor;
    this.salario = salario;
    }
    // Método para exibir informações do funcionário
    @Override
    public void exibirInfo() {
    super.exibirInfo(); // Chama o método exibirInfo da superclasse
    System.out.println("Setor: " + setor);
    System.out.println("Salário: R$" + salario);
    }
    }
    