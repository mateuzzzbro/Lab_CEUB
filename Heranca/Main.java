public class Main {
    public static void main(String[] args) {
    // Criação de objetos
    Aluno aluno = new Aluno("João", 20, "A12345", 8.5, 9.0);
    Professor professor = new Professor("Maria", 40, "Matemática");
    Funcionario funcionario = new Funcionario("Carlos", 35, "Administração", 3500.00);
    // Exibe as informações dos objetos
    System.out.println("Informações do Aluno:");
    aluno.exibirInfo();
    System.out.println("\nInformações do Professor:");
    professor.exibirInfo();
    System.out.println("\nInformações do Funcionário:");
    funcionario.exibirInfo();
    }
    }