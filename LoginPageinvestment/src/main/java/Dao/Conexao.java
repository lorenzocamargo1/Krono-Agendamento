/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author walison
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        //conectando o banco de dados ao banco SQL
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/krono", "postgres", "aluno123");
        return conexao;
    }
}
