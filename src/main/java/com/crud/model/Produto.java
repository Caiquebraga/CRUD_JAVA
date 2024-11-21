package main.java.com.crud.model;


import main.java.com.crud.repository.ProdutoRepository;

public class Produto {

    private  int id;
    private String nome;
    private String preco;

    public Produto(){

    }

    public Produto(int id, String nome, String preco ){

       this.id = id;
       this.nome = nome;
       this.preco = preco;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPreco (){
        return preco;
    }

    public void Setpreco(String preco){
        this.preco = preco;
    }



}
