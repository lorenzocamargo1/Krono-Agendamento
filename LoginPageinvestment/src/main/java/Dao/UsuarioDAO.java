/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Usuario1;
import View.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Walison
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    
    
    public void insert(Usuario1 usuario1) throws SQLException{
                
                String sql = "insert into usuario(nome, sobrenome, email, senha) values(?,?,?,?);";
                //conexao com o botao salvar
                // Gere uma hash BCrypt para a senha
    String senhaCriptografada = BCrypt.hashpw(usuario1.getSenha(), BCrypt.gensalt());
            PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setString(1, usuario1.getNome());
                statement.setString(2, usuario1.getSobronome());
                statement.setString(3, usuario1.getEmail());
                
                statement.setString(4, senhaCriptografada);// Insira a senha criptografada
                
                 statement.execute();
    }
                
                /*int count = statement.executeUpdate();
                if (count > 0) {
            
        }
    }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString(),"Error raise", JOptionPane.ERROR_MESSAGE);
}
        private String md5(char[] c){
                try{
                    
                }*/
    
            
           
    
    
    public void update(Usuario1 usuario1) throws SQLException {
        
        //update no SQL
        String sql = "update usuario set usuario = ?, senha = ? where id = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setString(1, usuario1.getNome());
                statement.setString(2, usuario1.getSobronome());
                statement.setString(3, usuario1.getEmail());
                statement.setString(4, usuario1.getSenha());
                statement.setInt(5, usuario1.getId());
            
            statement.execute();
        
    }
    
    public void insertOrUpdate(Usuario1 usuario1) throws SQLException {
        
        if(usuario1.getId() > 0) {
            update(usuario1);
        }else{
            insert(usuario1);
        }
    }
    
    public void delete(Usuario1 usuario1) throws SQLException {
        
        String sql = "delete from usuario where id = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(5, usuario1.getId());
            
            statement.execute();
    }
    
    public ArrayList<Usuario1> selectAll() throws SQLException {
        
        String sql = "select * from usuario";
            PreparedStatement statement = connection.prepareStatement(sql);
    
            return pesquisa(statement);
    }

    private ArrayList<Usuario1> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario1> usuarios = new ArrayList<>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String sobrenome = resultSet.getString("sobrenome");
            String email = resultSet.getString("email");
            String senha = resultSet.getString("senha");
            
            Usuario1 usuarioComDadosDoBanco = new Usuario1(id, nome, sobrenome, email, senha);
            usuarios.add(usuarioComDadosDoBanco);
        }
        return usuarios;
    }
    
    public Usuario1 selectPorId(Usuario1 usuario1) throws SQLException {
        
        String sql = "select * from usuario where id = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(5, usuario1.getId());
            
        return pesquisa(statement).get(0);
            
    }

    public boolean existeNoBancoPorEmailESenha(Usuario1 usuario1) throws SQLException {
        String sql = "select * from usuario where email = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario1.getEmail());
        ResultSet resultSet = statement.executeQuery();
        
        if (resultSet.next()) {
        String senhaArmazenadaNoBD = resultSet.getString("senha");

        // Verifique se a senha inserida pelo usuário corresponde à senha armazenada no BD usando BCrypt
        if (BCrypt.checkpw(usuario1.getSenha(), senhaArmazenadaNoBD)) {
            return true; // Senha correta
        }
    }

    return false; // Email ou senha incorretos ou usuário não encontrado
    }
}
