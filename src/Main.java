//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import classes.*;
import factoryUsuarios.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Usuario usuario;
        //Coleta de dados pela tela ou banco (assumindo)
        String tipo = "Nutricionista";
        String nome = "Dr. Stone";
        String email = "senku@uni.stone";
        String senha = "science";
        String crn = "1200";
        String turma = "A1";
        String matricula = "1111";
        LocalDate data = LocalDate.of(5738, 1, 1);

        if (tipo.equals("Aluno")) {
            usuario = new UsuarioAluno(nome, email, senha, data, matricula, turma);
        } else if (tipo.equals("Professor")) {
            usuario = new UsuarioProfessor(nome, email, senha, matricula, turma);
        } else if(tipo.equals("Nutricionista")) {
            usuario = new UsuarioNutricionista(nome, email, senha, crn);
        } else {
            throw new RuntimeException("Tipo de usuário não suportado para esta aplicação.");
        }

        usuario.login();
    }
}