package classes;
import java.time.LocalDate;
public class Aluno extends Pessoa{

    private LocalDate data_nascimento;
    private String matricula;
    private String turma;

    public Aluno() {
        super("Jaider", "mail.com", "vermelho", "Aluno");
        this.data_nascimento = LocalDate.of(1999, 9, 28);
        this.matricula = "XYZ987";
        this.turma = "AX";
    }

    public Aluno(String nome, String email, String senha, String tipo_usuario, LocalDate data_nascimento,
                 String matricula, String turma) {
        super(nome, email, senha, tipo_usuario);
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;
        this.turma = turma;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    public void obterRestricao() {}

}
