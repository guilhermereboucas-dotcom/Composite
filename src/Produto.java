public class Produto implements ItemLoja{

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- Produto: " + this.nome + " | Preço: R$ " + this.preco);
    }
}
