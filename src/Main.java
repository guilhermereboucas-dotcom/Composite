import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Mouse", 80.0);
        Produto produto2 = new Produto("Teclado", 150.0);
        Produto produto3 = new Produto("Monitor", 900.0);
        Produto produto4 = new Produto("Mousepad", 40.0);

        System.out.println("-----------------------------------------------");
        Kit kit1 = new Kit("Kit Periféricos");
        kit1.adicionar(produto1);
        kit1.adicionar(produto2);
        kit1.adicionar(produto4);

        Kit kit2 = new Kit("Kit Setup");
        kit2.adicionar(produto3);
        kit2.adicionar(kit1);

        kit2.exibir("");
        System.out.println("-----------------------------------------------");
    }
}
