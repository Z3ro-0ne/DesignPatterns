package factoryUsuarios;
import classes.*;

public abstract class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    protected abstract Pessoa criarUsuario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void login() {
        System.out.println("Iniciando sessão.");

        Pessoa user = criarUsuario();

        System.out.println("Bem-vindo(a), " + user.getNome() + "!");

        user.menu();

    }

    public void logout() {
        System.out.println("Fechando sessão...");
        System.out.println("Até mais " + this.nome + "!");
    }

}
