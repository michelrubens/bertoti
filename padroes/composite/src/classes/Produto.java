package classes;

public class Produto extends Componente {
  public Produto(String nome) {
    super(nome);
}

@Override
public void adicionar(Componente componente) {
    // Implementação vazia para produtos
}

@Override
public void remover(Componente componente) {
    // Implementação vazia para produtos
}

@Override
public void exibir() {
    System.out.println(nome);
}
  
}
