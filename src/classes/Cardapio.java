package classes;
import java.time.LocalDate;
public class Cardapio {
    private LocalDate inicio;
    private LocalDate fim;

    public Cardapio(LocalDate inicio, LocalDate fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public void visualizarCardapio() {};
    public void editarCardapio() {};
}
