package main.java.com.crud.model;



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

    public static void main(String[] args){

        System.out.println("Testando Construtor");

        Produto produto1 = new Produto();

        produto1.setId(1);
        produto1.setNome("Notbook");
        produto1.Setpreco("400");

        System.out.println("ID " + produto1.getId());
        System.out.println("Nome " + produto1.getNome());
        System.out.println("Preco " + produto1.getPreco());
    }




}
