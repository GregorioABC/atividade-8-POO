import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens;
    private String usuario;

    public CarrinhoDeCompras(String usuario) {
        this.usuario = usuario;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public void removerItem(String item) {
        this.itens.remove(item);
    }

    public List<String> listarItens() {
        return this.itens;
    }
}