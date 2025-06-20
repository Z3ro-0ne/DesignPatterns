package classes;

public class Professor extends Pessoa{

    private String matricula;
    private String turma;

    public Professor() {
        super("Jaider", "mail.com", "vermelho", "Professor");
        this.matricula = "ABC123";
        this.turma = "AX";
    }

    public Professor(String nome, String email, String senha, String tipo_usuario, String matricula, String turma) {
        super(nome, email, senha, tipo_usuario);
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

    public void obterAluno(String matricula) {}
    public void cadastrarAluno() {};
    public void editarAluno() {};
    public void validarCardapio() {};
}
