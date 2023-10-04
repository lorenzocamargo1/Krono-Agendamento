/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe que representa um cliente, derivada da classe Empresa.
 * Armazena informações específicas do cliente, como endereço e CEP.
 * 
 * Esta classe possui construtores para inicialização e métodos para acesso e modificação dos atributos.
 * 
 * @author loren
 */
public class Cliente extends Empresa {
    private String endereco; // Armazena o endereço do cliente.
    private String cep;      // Armazena o CEP (Código de Endereçamento Postal) do cliente.

    /**
     * Construtor para inicializar um cliente com informações detalhadas.
     * 
     * @param endereco Endereço do cliente.
     * @param cep CEP do cliente.
     * @param id ID do cliente.
     * @param nome Nome do cliente.
     * @param telefone Telefone do cliente.
     * @param email E-mail do cliente.
     * @param cnpj CNPJ (Cadastro Nacional da Pessoa Jurídica) do cliente.
     */
    public Cliente(String endereco, String cep, int id, String nome, String telefone, String email, String cnpj) {
        super(id, nome, telefone, email, cnpj);
        this.endereco = endereco;
        this.cep = cep;
    }

    /**
     * Construtor para inicializar um cliente com informações básicas.
     * 
     * @param id ID do cliente.
     * @param nome Nome do cliente.
     * @param endereco Endereço do cliente.
     * @param cep CEP do cliente.
     */
    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    /**
     * Obtém o endereço do cliente.
     * 
     * @return O endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     * 
     * @param endereco O novo endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o CEP do cliente.
     * 
     * @return O CEP do cliente.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o CEP do cliente.
     * 
     * @param cep O novo CEP do cliente.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
}

