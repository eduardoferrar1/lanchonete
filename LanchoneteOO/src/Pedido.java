import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private LocalDate data;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
        this.data = LocalDate.now();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void finalizarPedido() {
        if (produtos.isEmpty()) {
            throw new IllegalStateException("Pedido deve ter pelo menos um produto");
        }
    }

    public LocalDate getData() {
        return data;
    }

    public double getTotal() {
        return calcularTotal();
    }
}