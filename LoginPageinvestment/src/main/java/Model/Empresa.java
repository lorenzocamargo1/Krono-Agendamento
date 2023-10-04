/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe abstrata que representa uma empresa.
 * Armazena informações básicas sobre uma empresa, como ID, nome, telefone, email e CNPJ.
 * 
 * Essa classe serve como base para outras classes que representam tipos específicos de empresas.
 * 
 * Possui construtores para inicialização e métodos para acesso e modificação dos atributos.
 * 
 * @author loren
 */
abstract public class Empresa {
    protected int id;             // ID único da empresa.
    protected String nome;        // Nome da empresa.
    protected String telefone;    // Número de telefone da empresa.
    protected String email;       // Endereço de email da empresa.
    protected String cnpj;        // CNPJ (Cadastro Nacional da Pessoa Jurídica) da empresa.

    /**
     * Construtor para inicializar uma empresa com ID e nome.
     * 
     * @param id ID único da empresa.
     * @param nome Nome da empresa.
     */
    public Empresa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Construtor para inicializar uma empresa com informações detalhadas.
     * 
     * @param id ID único da empresa.
     * @param nome Nome da empresa.
     * @param telefone Número de telefone da empresa.
     * @param email Endereço de email da empresa.
     * @param cnpj CNPJ da empresa.
     */
    public Empresa(int id, String nome, String telefone, String email, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
    }

    /**
     * Obtém o ID da empresa.
     * 
     * @return O ID da empresa.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID da empresa.
     * 
     * @param id O novo ID da empresa.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome da empresa.
     * 
     * @return O nome da empresa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da empresa.
     * 
     * @param nome O novo nome da empresa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número de telefone da empresa.
     * 
     * @return O número de telefone da empresa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone da empresa.
     * 
     * @param telefone O novo número de telefone da empresa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o email da empresa.
     * 
     * @return O email da empresa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email da empresa.
     * 
     * @param email O novo email da empresa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o CNPJ da empresa.
     * 
     * @return O CNPJ da empresa.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da empresa.
     * 
     * @param cnpj O novo CNPJ da empresa.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

