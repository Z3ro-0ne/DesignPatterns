package factoryUsuarios;
import classes.*;
public class UsuarioProfessor extends Usuario {

    private String matricula;
    private String turma;

    public UsuarioProfessor(String nome, String email, String senha, String matricula, String turma) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.turma = turma;
    }

    @Override
    protected Pessoa criarUsuario() {
        return new Professor(this.getNome(), this.getEmail(), this.getSenha(), this.matricula, this.turma);
    }
}
