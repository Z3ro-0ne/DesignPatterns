package classes;

public abstract class Pessoa {

    private String nome;
    private String email;
    private String senha;
    private String tipo_usuario;

    public Pessoa() {
        this.nome = "Jaider";
        this.email = "mail.com";
        this.senha = "vermelho";
    }

    public Pessoa(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

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
    public void login() {}

    public void logout() {}

    public abstract void menu();

}
