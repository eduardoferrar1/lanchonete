package controller;

import model.Pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {

    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(Pedido p) {

        if (p.estaVazio()) {
            throw new IllegalArgumentException("Pedido vazio");
        }

        pedidos.add(p);
    }

    public double faturamento(LocalDate data) {
        double total = 0;

        for (Pedido p : pedidos) {
            if (p.getData().equals(data)) {
                total += p.getTotal();
            }
        }

        return total;
    }
}