/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe que representa um usuário da plataforma pertencente a uma empresa.
 * Derivada da classe Empresa, armazena informações sobre um usuário, como senha e nível de acesso.
 * 
 * Esta classe possui construtores para inicialização e métodos para acesso e modificação dos atributos.
 * 
 * @author loren
 */
public class Usuario extends Empresa {
   
    protected String senha;         // Senha do usuário.
    protected String nivelAcesso;   // Nível de acesso do usuário.

    /**
     * Construtor para inicializar um usuário com informações básicas.
     * 
     * @param id ID do usuário.
     * @param nome Nome do usuário.
     * @param senha Senha do usuário.
     */
    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    /**
     * Construtor para inicializar um usuário com informações detalhadas.
     * 
     * @param senha Senha do usuário.
     * @param nivelAcesso Nível de acesso do usuário.
     * @param id ID do usuário.
     * @param nome Nome do usuário.
     * @param telefone Telefone do usuário.
     * @param email Email do usuário.
     * @param cnpj CNPJ do usuário.
     */
    public Usuario(String senha, String nivelAcesso, int id, String nome, String telefone, String email, String cnpj) {
        super(id, nome, telefone, email, cnpj);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    /**
     * Obtém a senha do usuário.
     * 
     * @return A senha do usuário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuário.
     * 
     * @param senha A nova senha do usuário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Obtém o nível de acesso do usuário.
     * 
     * @return O nível de acesso do usuário.
     */
    public String getNivelAcesso() {
        return nivelAcesso;
    }

    /**
     * Define o nível de acesso do usuário.
     * 
     * @param nivelAcesso O novo nível de acesso do usuário.
     */
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}

