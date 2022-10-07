import java.time.LocalTime;

public class DiaHora {

    private Semana dia;
    private LocalTime hora;

    public DiaHora(Semana dia, LocalTime hora){
        this.dia = dia;
        this.hora = hora;
    }

    public Semana getDia() {
        return dia;
    }

    public void setDia(Semana dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
