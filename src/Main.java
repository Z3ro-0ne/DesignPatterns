//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import classes.*;

public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor();

        System.out.println("Nome: " + prof.getNome());
        System.out.println("Mail: " + prof.getEmail());
        System.out.println("Senha: " + prof.getSenha());
        System.out.println("Usuario: " + prof.getTipo_usuario());
        System.out.println("Matricula: " + prof.getMatricula());
        System.out.println("Turma: " + prof.getTurma());
    }
}