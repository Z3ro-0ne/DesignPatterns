package classes;

public class Nutricionista extends Pessoa {

    private String crn;

    public Nutricionista() {
        this.crn = "1234321";
    }

    public Nutricionista(String nome, String email, String senha, String crn) {
        super(nome, email, senha);
        this.crn = crn;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public void relatorioAluno() {}

    public void criarReceita() {}

    public void editarReceita() {}

}
