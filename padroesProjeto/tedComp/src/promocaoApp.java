import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class promocaoApp {

    public static void main(String[] args) {

        String nome;
        double valor;
        DiaHora diaHora;
        String dia;
        String hora;
        Produto produto;

        Scanner input = new Scanner(System.in);

        System.out.println("Supermecado PP - 'PROMOÇÃO PARA VOCÊ'");
        System.out.println("Qual o nome do produto? ");
        nome = input.nextLine();
        System.out.println("Qual o valor do produto? ");
        valor = Double.parseDouble(input.nextLine());
        System.out.println("Qual o dia da semana? (Ex: segunda) ");
        dia = input.nextLine().toUpperCase();
        System.out.println("Qual horário da compra? (Ex: 07:25:00 hora,minutos e segundos)");
        hora = input.nextLine();

        diaHora = new DiaHora(Semana.valueOf(dia), LocalTime.parse(hora, DateTimeFormatter.ISO_TIME));
        produto = new Produto(nome, valor, diaHora);

        System.out.println("O valor do produto na: " + produto.getNome() + ", que será pago é de R$ " + produto.valorDesconto());
    }

}
