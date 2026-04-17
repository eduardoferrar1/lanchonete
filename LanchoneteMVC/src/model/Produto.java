package model;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        if (nome.isEmpty()) throw new IllegalArgumentException();
        if (preco < 0) throw new IllegalArgumentException();

        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}