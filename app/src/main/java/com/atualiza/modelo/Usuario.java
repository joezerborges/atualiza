
// O nome do pacote deve ser o mesmo do seu projeto
package com.atualiza.modelo;

// Classe que representa a entidade Usuario
public class Usuario {

    // Atributos da classe, que correspondem às colunas da tabela USUARIO no banco de dados
    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    // Construtor vazio (obrigatório para algumas frameworks)
    public Usuario() {
    }

    // Construtor para criar um objeto Usuario com todos os dados
    public Usuario(int id_usuario, String nome, String email, String senha, String telefone) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    // Construtor sem o ID, para ser usado ao criar um novo usuário (o ID é gerado pelo banco de dados)
    public Usuario(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    // Métodos Getters e Setters para acessar e modificar os atributos
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
