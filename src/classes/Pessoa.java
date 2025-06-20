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
        this.tipo_usuario = "Professor";
    }

    public Pessoa(String nome, String email, String senha, String tipo_usuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
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

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void login() {}

    public void logout() {}

}
