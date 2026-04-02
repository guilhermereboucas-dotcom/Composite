import java.util.ArrayList;

public class Kit implements ItemLoja {

    private String nome;
    private ArrayList<ItemLoja> itens= new ArrayList<>();

    public Kit(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemLoja item){
        itens.add(item);
    }

    public void remover(ItemLoja item){
        itens.remove(item);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        double soma = 0;
        for(ItemLoja item : itens){
            soma += item.getPreco();
        }
        return soma;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "+ Kit: " + this.nome + " | Preço total: " + getPreco());
        for(ItemLoja item : itens){
            item.exibir(prefixo + "  ");
        }
    }
}
