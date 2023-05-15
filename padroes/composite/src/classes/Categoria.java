package classes;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Componente {
  private List<Componente> componentes;

  public Categoria(String nome) {
    super(nome);
    this.componentes = new ArrayList<>();
  }

  @Override
  public void adicionar(Componente componente) {
    componentes.add(componente);
  }

  @Override
  public void remover(Componente componente) {
    componentes.remove(componente);
  }

  @Override
  public void exibir() {
    System.out.println(nome + ":");
    for (Componente componente : componentes) {
      if (componente instanceof Produto) {
        System.out.println("- " + componente.nome);
      } else if (componente instanceof Categoria) {
        componente.exibir();
      }
    }
  }
}
