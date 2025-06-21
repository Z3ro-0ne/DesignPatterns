package factoryUsuarios;
import classes.*;

import java.time.LocalDate;

public class UsuarioAluno extends Usuario{

    private LocalDate data_nascimento;
    private String matricula;
    private String turma;

    public UsuarioAluno(String nome, String email, String senha, LocalDate data_nascimento,
                        String matricula, String turma) {
        super(nome, email, senha);
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;
        this.turma = turma;
    }
    @Override
    protected Pessoa criarUsuario() {
        return new Aluno(this.getNome(), this.getEmail(), this.getSenha(), this.data_nascimento,
                        this.matricula, this.turma);
    }
}
