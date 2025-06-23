package classes;

public class Professor extends Pessoa{

    private String matricula;
    private String turma;

    public Professor() {
        super("Jaider", "mail.com", "vermelho");
        this.matricula = "ABC123";
        this.turma = "AX";
    }

    public Professor(String nome, String email, String senha, String matricula, String turma) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void relatorioAluno(String matricula) {}
    public void cadastrarAluno() {};
    public void editarAluno() {};
    public void validarCardapio() {
        System.out.println("Cardapio Valido");
    };

    public void menu() {
        System.out.println("--- Menu do Professor ---");
        System.out.println("1. Validar Cardápio");
        System.out.println("2. Gerenciar Alunos");

        this.validarCardapio();
    }
}
