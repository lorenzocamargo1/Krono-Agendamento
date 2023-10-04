/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Walison
 */
public class Usuario1 {
    private int id;
    private String nome;
    private String sobronome;
    private String email;
    private String senha;

    // Construtor completo com todos os campos
    public Usuario1(int id, String nome, String sobronome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobronome = sobronome;
        this.email = email;
        this.senha = senha;
    }

    // Construtor para criar um usuário com apenas email e senha
    public Usuario1(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    // Construtor para criar um usuário com todos os campos, exceto o ID
    public Usuario1(String nome, String sobronome, String email, String senha) {
        this.nome = nome;
        this.sobronome = sobronome;
        this.email = email;
        this.senha = senha;
    }
    
    // Métodos getters e setters para acessar e modificar os campos

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

    public String getSobronome() {
        return sobronome;
    }

    public void setSobronome(String sobronome) {
        this.sobronome = sobronome;
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
    
    
}
