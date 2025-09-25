package com.atualiza.modelo;

public class Veiculo {

    private int id_veiculo;
    private int id_usuario; // Chave estrangeira para o usuário dono do veículo
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String tipo_combustivel;
    private int quilometragem;

    // Construtor vazio
    public Veiculo() {
    }

    // Construtor completo
    public Veiculo(int id_veiculo, int id_usuario, String marca, String modelo, int ano, String placa, String tipo_combustivel, int quilometragem) {
        this.id_veiculo = id_veiculo;
        this.id_usuario = id_usuario;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
    }

    // Construtor para criar um novo veículo (o ID será gerado pelo banco de dados)
    public Veiculo(int id_usuario, String marca, String modelo, int ano, String placa, String tipo_combustivel, int quilometragem) {
        this.id_usuario = id_usuario;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
    }

    // Métodos Getters e Setters
    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}