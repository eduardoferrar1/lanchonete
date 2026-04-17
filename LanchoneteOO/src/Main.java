import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Hamburguer", "Carne", 15);
        Produto p2 = new Produto(2, "Refrigerante", "Coca", 5);

        Pedido pedido = new Pedido(1);
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        pedido.finalizarPedido();

        SistemaLanchonete sistema = new SistemaLanchonete();
        sistema.registrarPedido(pedido);

        System.out.println("Total do pedido: " + pedido.getTotal());
        System.out.println("Faturamento do dia: " + sistema.faturamentoDoDia(LocalDate.now()));
    }
}