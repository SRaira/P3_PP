package prova;
//Prof so consegui chegar ate aqui, se tiver certo ainda por cima kkk

public class Utilitarios {

    public void duplica(Repositorio a, Repositorio b){
        Pessoa pessoa = a.primeiro();
        while (pessoa != null){
            b.guarda(pessoa);
            pessoa = a.proximo();
        }
    }

    public void diferenca(){} //não sei fazer




}
