/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.Conexao;
import Dao.UsuarioDAO;
import Model.Usuario1;
import View.Cadastro;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Walison
 */
public class CadastroController {
    
    private final Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void salvaUsuario () {
        //chamando os campos pela view
        String nome = view.getjTextFieldNome().getText();
        String sobrenome = view.getjTextFieldSobrenome().getText();
        String email = view.getjTextFieldEmail().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        String confirmaSenha = view.getjPasswordFieldConfSenha().getText();
        
        
        // Verifica se algum campo obrigatório está em branco
    if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmaSenha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.", "Campos em Branco", JOptionPane.WARNING_MESSAGE);
    } else {
        
         // Verifica se a senha e a confirmação de senha coincidem
    if (senha.equals(confirmaSenha)) {
        Usuario1 usuario = new Usuario1(nome, sobrenome, email, senha);

        // Realiza a conexão e a inserção no banco de dados
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
            usuarioDAO.insert(usuario);

            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
            

        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        // As senhas não coincidem, exiba uma mensagem de erro ao usuário
        JOptionPane.showMessageDialog(null, "As senhas não coincidem. Por favor, tente novamente.");
    }
    }
}
}
