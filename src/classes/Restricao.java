package classes;
public class Restricao {

    private String tipo_restricao;
    private String gravidade;

    public Restricao(String tipo_restricao, String gravidade) {
        this.tipo_restricao = tipo_restricao;
        this.gravidade = gravidade;
    }

    public String getTipo_restricao() {
        return tipo_restricao;
    }

    public void setTipo_restricao(String tipo_restricao) {
        this.tipo_restricao = tipo_restricao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }


}
