import controller.PedidoController;
import model.*;
import view.PedidoView;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Produto p = new Produto("X-Burguer", 20);

        Pedido pedido = new Pedido();
        pedido.adicionarProduto(p);

        PedidoController controller = new PedidoController();
        PedidoView view = new PedidoView();

        controller.registrarPedido(pedido);

        double faturamento = controller.faturamento(LocalDate.now());

        view.mostrarTotal(faturamento);
    }
}