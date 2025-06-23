package classes;

import facadeComida.FacadeComida;

public class Nutricionista extends Pessoa {

    private String crn;
    private FacadeComida gerenciadorAluno;

    public Nutricionista() {
        this.crn = "1234321";
    }

    public Nutricionista(String nome, String email, String senha, String crn) {
        super(nome, email, senha);
        this.crn = crn;
        this.gerenciadorAluno = new FacadeComida(BancoDeDados.getInstance());
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public void relatorioAluno(String matricula) {}

    public Receita criarReceita() {
        return null;
    }

    public void editarReceita(Receita receita) {}

    public void menu() {
        System.out.println("--- Menu do Nutricionista ---");
        System.out.println("1. Criar receita para Aluno");
        System.out.println("2. Editar dados");
        System.out.println("3. Sair");

        //Nutricionista escolhe uma opção...digamos 1

        gerenciadorAluno.adminAluno(this);

    }

}
