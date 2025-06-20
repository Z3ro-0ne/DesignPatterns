package classes;

import java.util.List;

public class Receita {

    private String nome;
    private List<String> ingredientes;
    private int tem_preparo;
    private String dificuldade;

    public Receita(String nome, List<String> ingredientes, int tem_preparo, String dificuldade) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.tem_preparo = tem_preparo;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTem_preparo() {
        return tem_preparo;
    }

    public void setTem_preparo(int tem_preparo) {
        this.tem_preparo = tem_preparo;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void trocarIngrediente() {}
    public void removerIngrediente() {}
    public void adicionarIngrediente() {}

}
