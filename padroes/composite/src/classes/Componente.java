package classes;
public abstract class Componente {
  protected String nome;

    public Componente(String nome) {
        this.nome = nome;
    }

    public abstract void adicionar(Componente componente);
    public abstract void remover(Componente componente);
    public abstract void exibir();
}
