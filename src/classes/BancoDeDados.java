package classes;

public class BancoDeDados {
    private static BancoDeDados instance;
    private boolean connection;
    private BancoDeDados() {
        //Inicialização das conexões com o banco
        this.connection = true;
    }
    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }
    public void salvarReceita() {}
    public void salvarAluno() {}
    public void salvarCardapio() {}
}
