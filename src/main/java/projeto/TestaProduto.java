public class TestaProduto {

    public static void main(String[] args) {

        Produto p = new Produto("Cadeira", 350.0, 20);

        p.exibirInformacoes();

        p.adicionarAoEstoque(10);

        p.removerDoEstoque(5);

        p.removerDoEstoque(50);

        p.exibirInformacoes();
    }
}