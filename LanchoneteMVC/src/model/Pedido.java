package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos = new ArrayList<>();
    private LocalDate data = LocalDate.now();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double getTotal() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean estaVazio() {
        return produtos.isEmpty();
    }
}