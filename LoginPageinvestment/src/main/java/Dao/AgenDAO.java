/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rick
 */

public class AgenDAO {
    
    private final Connection connection;

    public AgenDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Agendamento agenda) throws SQLException{
                
        String sql = "insert into agenda(empresa, cnpj, entrada, saida, servico, kilos, data, hora, obs, valor) values(?,?,?,?,?,?,?,?,?,?);";
            //conexao com o botao agendar
            PreparedStatement statement = connection.prepareStatement(sql);
                //declaração da ordem a dar as variáveis
                statement.setString(1, agenda.getEmpresa());
                statement.setString(2, agenda.getCnpj());
                statement.setString(3, agenda.getEntrada());
                statement.setString(4, agenda.getSaida());
                statement.setString(5, agenda.getServico());
                statement.setString(6, agenda.getKilos());
                statement.setDate(7, agenda.getData());
                statement.setString(8,agenda.getHora());
                statement.setString(9, agenda.getObs());
                statement.setFloat(10, agenda.getValor());
            
            statement.execute();
    }
}
