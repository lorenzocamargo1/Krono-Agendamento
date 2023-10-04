/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroController;
import Dao.Conexao;
import Dao.UsuarioDAO;
import Model.Usuario;
import Model.Usuario1;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author walis
 */
public class Cadastro extends javax.swing.JFrame {

    private final CadastroController controller;

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        controller = new CadastroController(this); //acessando o controller
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBoxMostrar = new javax.swing.JCheckBox();
        jCheckBoxMostar2 = new javax.swing.JCheckBox();
        jButtonVoltar = new javax.swing.JButton();
        jCheckBoxAceitarTermos = new javax.swing.JCheckBox();
        jButtonTermo = new javax.swing.JButton();
        cadastroImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNome.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 230, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jPasswordFieldSenha.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 230, -1));

        jPasswordFieldConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 230, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Confirmar senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 120, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Sobrenome");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jTextFieldSobrenome.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 100, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 230, -1));

        jCheckBoxMostrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxMostrar.setText("Mostrar senha");
        jCheckBoxMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jCheckBoxMostar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxMostar2.setText("Mostrar senha");
        jCheckBoxMostar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMostar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxMostar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jButtonVoltar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 100, 30));

        jCheckBoxAceitarTermos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCheckBoxAceitarTermos.setText("Li e Aceito");
        jCheckBoxAceitarTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAceitarTermosActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAceitarTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 90, -1));

        jButtonTermo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonTermo.setForeground(new java.awt.Color(0, 0, 255));
        jButtonTermo.setText("Termo de uso");
        jButtonTermo.setContentAreaFilled(false);
        jButtonTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTermoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 230, 40));

        cadastroImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/TelaCadastro.png"))); // NOI18N
        cadastroImg.setText("jLabel");
        getContentPane().add(cadastroImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 630, -1));

        pack();
    }// </editor-fold>                        

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        // Obtém os valores dos campos de entrada e remove espaços em branco
         String nome = jTextFieldNome.getText().trim();
         String sobrenome = jTextFieldSobrenome.getText().trim();
         String email = jTextFieldEmail.getText().trim();
         String senha = new String(jPasswordFieldSenha.getPassword()).trim();
         String confirmaSenha = new String(jPasswordFieldConfSenha.getPassword()).trim();

         // Verifica se algum campo obrigatório está vazio
         if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmaSenha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Campos em Branco", JOptionPane.WARNING_MESSAGE);
    } else {
        // Continue com o restante do código
         
         // Verifica o formato do email
         String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
    if (!email.matches(emailRegex)) {
        JOptionPane.showMessageDialog(null, "O formato do email é inválido.", "Email Inválido", JOptionPane.WARNING_MESSAGE);
    } else {
        // Continue com o restante do código
        
        // Verifica a força da senha
    if (senha.length() < 8 || !senha.matches(".*[A-Z].*") || !senha.matches(".*[a-z].*") || !senha.matches(".*\\d.*")) {
        JOptionPane.showMessageDialog(null, "A senha deve conter no minímo 8 caracteres, incluindo letra maiúscula, letra minúscula e número.", "Senha Fraca", JOptionPane.WARNING_MESSAGE);
    } else {
        // Continue com o restante do código
        
         // Verifique se a caixa de seleção 'jCheckBoxAceitarTermos' está marcada
        if (!jCheckBoxAceitarTermos.isSelected()) {
            JOptionPane.showMessageDialog(this, "Você deve aceitar os termos de uso para podermos prosseguir.","Termos não aceitos", JOptionPane.WARNING_MESSAGE);
        } else {
        
        // Verifica se as senhas coincidem
      if (senha.equals(confirmaSenha)) {
        // Se todas as verificações passaram, seu usuario será salvo no banco de dados
        controller.salvaUsuario();
        MenuPrincipal telaMenuPrincipal = new MenuPrincipal();
        telaMenuPrincipal.setVisible(true);
        this.dispose();//fecha a tela de cadastro
        
    } else {
        // As senhas não são iguais, exiba uma mensagem de erro.
        JOptionPane.showMessageDialog(this, "As senhas não coincidem. Por favor, tente novamente.", "Erro de Senha", JOptionPane.ERROR_MESSAGE);
       } 
      }
      }
     }
     }
    }                                        

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jCheckBoxMostrarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        jCheckBoxMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JCheckBox checkBox = (JCheckBox) e.getSource();// Obtém o JCheckBox que acionou o evento
                 if (checkBox.isSelected()) {
                     jPasswordFieldSenha.setEchoChar((char)0);// Exibe a senha
                 }else{
                     jPasswordFieldSenha.setEchoChar('\u2022');// Oculta a senha com caracteres de ponto
                 }
            }
        });
    }                                                

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jCheckBoxMostar2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        jCheckBoxMostar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JCheckBox checkBox = (JCheckBox) e.getSource();// Obtém o JCheckBox que acionou o evento
                 if (checkBox.isSelected()) {
                     jPasswordFieldConfSenha.setEchoChar((char)0);// Exibe a senha
                 }else{
                     jPasswordFieldConfSenha.setEchoChar('\u2022');// Oculta a senha com caracteres de ponto
                 }
            }
        });
    }                                                

    private void jPasswordFieldConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        MenuPrincipal telaMenuPrincipal = new MenuPrincipal();
        telaMenuPrincipal.setVisible(true);
        this.dispose();
    }                                             

    private void jCheckBoxAceitarTermosActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        
    }                                                      

    private void jButtonTermoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
        File file = new File("src\\main\\java\\Documento\\Privacidade.pdf"); // Caminho relativo ao arquivo PDF
        if (file.exists()) {
            Desktop.getDesktop().open(file);
        } else {
            JOptionPane.showMessageDialog(this, "O arquivo PDF não foi encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Ocorreu um erro ao abrir o arquivo PDF.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }                                            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    public JPasswordField getjPasswordFieldConfSenha() {
        return jPasswordFieldConfSenha;
    }

    public void setjPasswordFieldConfSenha(JPasswordField jPasswordFieldConfSenha) {
        this.jPasswordFieldConfSenha = jPasswordFieldConfSenha;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldSobrenome() {
        return jTextFieldSobrenome;
    }

    public void setjTextFieldSobrenome(JTextField jTextFieldSobrenome) {
        this.jTextFieldSobrenome = jTextFieldSobrenome;
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel cadastroImg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonTermo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxAceitarTermos;
    private javax.swing.JCheckBox jCheckBoxMostar2;
    private javax.swing.JCheckBox jCheckBoxMostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordFieldConfSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration                   
}
