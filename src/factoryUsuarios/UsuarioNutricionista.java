package factoryUsuarios;
import classes.*;

public class UsuarioNutricionista extends Usuario{

    private String crn;

    public UsuarioNutricionista(String nome, String email, String senha, String crn) {
        super(nome, email, senha);
        this.crn = crn;
    }

    @Override
    protected Pessoa criarUsuario() {
        return new Nutricionista(this.getNome(), this.getEmail(), this.getSenha(), this.crn);
    }
}
