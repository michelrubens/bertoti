import classes.Categoria;
import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria os produtos
        Produto smartphone = new Produto("Smartphone");
        Produto notebook = new Produto("Notebook");
        Produto tablet = new Produto("Tablet");
        Produto smartTV = new Produto("Smart TV");
        Produto soundbar = new Produto("Soundbar");
        Produto iphone = new Produto("iPhone");
        Produto samsungGalaxy = new Produto("Samsung Galaxy");
        Produto livro = new Produto("Livro");
        Produto brinquedo = new Produto("Brinquedo");
        Produto bolaFutebol = new Produto("Bola de futebol");
        Produto raqueteTenis = new Produto("Raquete de tênis");

        // Cria as categorias
        Categoria celulares = new Categoria("Celulares");
        celulares.adicionar(iphone);
        celulares.adicionar(samsungGalaxy);

        Categoria eletronicos = new Categoria("Eletrônicos");
        eletronicos.adicionar(smartTV);
        eletronicos.adicionar(soundbar);
        eletronicos.adicionar(celulares);

        Categoria esportes = new Categoria("Esportes");
        esportes.adicionar(bolaFutebol);
        esportes.adicionar(raqueteTenis);

        // Cria o catálogo
        Categoria catalogo = new Categoria("Catálogo");
        catalogo.adicionar(smartphone);
        catalogo.adicionar(notebook);
        catalogo.adicionar(tablet);
        catalogo.adicionar(eletronicos);
        catalogo.adicionar(livro);
        catalogo.adicionar(brinquedo);
        catalogo.adicionar(esportes);

        // Exibe o catálogo completo
        catalogo.exibir();
    }
}