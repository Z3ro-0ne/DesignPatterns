package factoryUsuarios;
import classes.*;
public class UsuarioCozinheira extends Usuario{

    public UsuarioCozinheira(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    protected Pessoa criarUsuario() {
        return new Cozinheira(this.getNome(), this.getEmail(), this.getSenha());
    }
}
