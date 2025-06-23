package facadeComida;
import classes.*;
import java.util.List;

public class FacadeComida {

    private BancoDeDados db;

    public FacadeComida(BancoDeDados db) {
        this.db = db;
    }
    public void adminAluno(Nutricionista nutri) {

        System.out.println("Insere matricula do Aluno: ");
        String matricula = "123-ABC";

        nutri.relatorioAluno(matricula);
        System.out.println("Iniciando geração de receita para matrícula: " + matricula);

        Receita nova = nutri.criarReceita();

        int comfirmar = 1;

        if(comfirmar == 0) {
            nutri.editarReceita(nova);
        } else {
            db.salvarReceita();
        }


        System.out.println("Receita gerada com sucesso!");
    }
}
