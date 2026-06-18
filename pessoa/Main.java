public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria Silva", 20, "ALU001", 8.0, 7.5);
        System.out.println("Dados aluno 1:");
        aluno1.exibirDados();

        System.out.println();

        Aluno aluno2 = new Aluno("Carlos Mendes", 19, "ALU002", 4.5, 5.0);
        System.out.println("Dados aluno 2:");
        aluno2.exibirDados();

        System.out.println();

        Aluno aluno3 = new Aluno("Ana Costa", 21, "ALU003", 2.0, 3.5);
       System.out.println("Dados aluno 3:");
        aluno3.exibirDados();

        System.out.println();

        Professor professor = new Professor("João Santos", 38, "PROF001", 5000.00, "Matemática");
        System.out.println("Dados professor:");
        professor.exibirDados();
    }
}