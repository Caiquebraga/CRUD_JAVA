package main.java.com.crud;

import main.java.com.crud.model.Produto;
import main.java.com.crud.repository.ProdutoRepository;

public class Main {
    public static void main(String[] args) {
        ProdutoRepository repository = new ProdutoRepository();

        Produto produto1 = new Produto(1, "Computador", "600");
        Produto produto2 = new Produto(2, "Monitor", "750");

        repository.addProduto(produto1);
        repository.addProduto(produto2);

        for (Produto produto : repository.listarProdutos()) {
            System.out.println("ID : " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}
