/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import Model.Usuario1;
import View.Login;

/**
 *
 * @author loren
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario1 obterModelo(){
       String email = view.getTextEmail().getText();
       String senha = view.getTextSenha().getText();
       Usuario1 modelo = new Usuario1(email, senha);
       return modelo;
    }
    public void setarModelo(Usuario modelo){
       String nome  = modelo.getNome();
       String senha = modelo.getSenha();
       
       /*view.getTextUsuario1().setText(nome);
       view.getTextSenha().setText(senha);
    }
    public void limparTela(){
        view.getTextUsuario1().setText("");
        view.getTextSenha().setText("");*/
                
    }
}
