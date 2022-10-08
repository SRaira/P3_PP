package prova;

public interface Repositorio {

    public Pessoa recupera (String cpf);
    public Pessoa primeiro ();
    public Pessoa proximo ();
    public void guarda (Pessoa nova);
}
