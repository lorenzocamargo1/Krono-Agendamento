/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Dao.Conexao;
import Dao.UsuarioDAO;
import Model.Usuario;
import Model.Usuario1;
import View.Login;
import View.Agenda;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author loren/walison
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    /*public void entrarNoSistema(){
        //Pegar um Usuário da View
        Usuario usuario = helper.obterModelo();
    }*/  
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        //this.view.exibeMensagem("Executei o fiz tarefa");
    }

    public void autenticar() throws SQLException {
        
        // Obter o email e a senha no banco de dados inseridos pelo usuário na interface 
        String Email = view.getTextEmail().getText(); 
        String Senha = view.getTextSenha().getText();
        
        // Criar um objeto de usuário com o email e senha fornecidos
        Usuario1 usuario1 = new Usuario1(Email, Senha);
        // Estabelecer uma conexão com o banco de dados
        Connection conexao = new Conexao().getConnection();
                UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
                
        // Verificar se o usuário existe no banco de dados
        boolean existe = usuarioDAO.existeNoBancoPorEmailESenha(usuario1);
        
        // Verificar se os campos obrigatórios estão preenchidos
        if (Email.isEmpty() || Senha.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Por favor, preencha todos os campos obrigatórios.", "Campos em Branco", JOptionPane.WARNING_MESSAGE);
    } else {

        // Se o usuário existir, direcionar para o menu principal
        if (existe) {
            Agenda telaAgenda = new Agenda();
            telaAgenda.setVisible(true);
            view.dispose();//fecha a tela de login
            
        } else {
            //limpar o campo de senha
            view.getTextSenha().setText("");
            JOptionPane.showMessageDialog(view, "Email ou senha invalidos");
        }
    }
    }
}
