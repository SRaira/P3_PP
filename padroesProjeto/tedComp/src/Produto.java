import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Produto {


    private String nome;
    private double valor;
    private DiaHora diaHora;

    public Produto(String nome,double valor, DiaHora diaHora){
        this.nome = nome;
        this.valor = valor;
        this.diaHora = diaHora;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double valorDesconto(){
        LocalTime inicio = LocalTime.parse("19:59:59", DateTimeFormatter.ISO_TIME);
        LocalTime termino = LocalTime.parse("23:59:59",DateTimeFormatter.ISO_TIME);

        if (this.diaHora.getDia() == Semana.SABADO || this.diaHora.getDia() == Semana.DOMINGO){
            return valor * 0.9;
        }else if (this.diaHora.getHora().isAfter(inicio) && this.diaHora.getHora().isBefore(termino)){
            return valor * 0.9;
        }
        return valor;
    }
}
