import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaLanchonete {

    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> pedidosPorDia(LocalDate data) {
        List<Pedido> lista = new ArrayList<>();

        for (Pedido p : pedidos) {
            if (p.getData().equals(data)) {
                lista.add(p);
            }
        }

        return lista;
    }

    public double faturamentoDoDia(LocalDate data) {
        double total = 0;

        for (Pedido p : pedidos) {
            if (p.getData().equals(data)) {
                total += p.getTotal();
            }
        }

        return total;
    }
}