package main.java.com.crud.model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;


    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void mmain(String[] args){
        System.out.println("TESTE 1 - Construtor padrão");
        Usuario usuario1 = new Usuario();

        usuario1.setId(1);
        usuario1.setNome("Caique");
        usuario1.setEmail("Caique@outtlook.com");
        usuario1.setSenha("123456");

        System.out.println("ID: " + usuario1.getId());
        System.out.println("NOME: " + usuario1.getNome());
        System.out.println("E-MAIL: " + usuario1.getEmail());
        System.out.println("SENHA: " + usuario1.getSenha());
        System.out.println("-----------------------------");
    }

}


