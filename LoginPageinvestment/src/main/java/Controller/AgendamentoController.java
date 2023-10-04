/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.Conexao;
import Dao.AgenDAO;
import Model.Servico;
import Model.Agendamento;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import View.Agenda;
import java.util.InputMismatchException;

/**
 *
 * @author Rick
 */
public class AgendamentoController {
    int entradaArray = 1;
    int saidaArray = 1; // Defina um valor padrão para evitar problemas
    
    private final Agenda view;

    public AgendamentoController(Agenda view) {
        this.view = view;
    }
    
    private float[][] distancias = {
    {0, 430, 586, 1020, 858, 1617, 1850, 704},    // Cidade 1 (São Paulo)
    {430, 0, 434, 924, 1160, 1926, 2035, 1026},   // Cidade 2 (Rio de Janeiro)
    {586, 434, 0, 716, 624, 1118, 1310, 716},     // Cidade 3 (Belo Horizonte)
    {1020, 924, 716, 0, 173, 1453, 2062, 1450},   // Cidade 4 (Brasília)
    {858, 1160, 624, 173, 0, 1383, 1877, 837},    // Cidade 5 (Goiânia)
    {1617, 1926, 1118, 1453, 1383, 0, 879, 3330}, // Cidade 6 (Salvador)
    {1850, 2035, 1310, 2062, 1877, 879, 0, 3320}, // Cidade 7 (Recife)
    {704, 1026, 716, 1450, 837, 3330, 3320, 0}    // Cidade 8 (Curitiba)
    };

    public void salvaAgendamento() {
        try {
            String empresa = view.getJTextEmpresa().getText();
            String cnpj = view.getTextFieldcnpj().getText();
            String entrada = view.getComboBoxBaseEntrada().getSelectedItem().toString();
            String saida = view.getComboBoxBaseSaida().getSelectedItem().toString();
            String servico = view.getComboBoxServico().getSelectedItem().toString();
            String data = view.getTextFieldData().getText();
            String hora = view.getTextFieldHora().getText();
            String obs = view.getTextAreaObservacao().getText();
            String kilos = view.getTextPesagem().getText();
            float valor = 0;
            Servico service = new Servico(servico, kilos, entradaArray, saidaArray);

            entradaArray = mapearEntradaParaIndice(entrada);
            saidaArray = mapearSaidaParaIndice(saida);

            if (entradaArray >= 1 && entradaArray <= distancias.length &&
        saidaArray >= 1 && saidaArray <= distancias[0].length) {
    float distanciaEmKm = distancias[entradaArray - 1][saidaArray - 1];
    if (servico.equals("KronoDrive")) {
        valor = service.getKilosInt() * 10 + distanciaEmKm * 15;
    } else if (servico.equals("KronoLog")) {
        valor = service.getKilosInt() * 2500 + distanciaEmKm * 550;
    }
            }

            JOptionPane.showMessageDialog(null, "O valor da compra foi de: " + valor);

            if (entrada.equals(saida)) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha com cidades diferentes.");
                return;
            }
            // Verifica se algum dos campos obrigatórios está vazio
            if (empresa.isEmpty()|| cnpj.isEmpty() || entrada.isEmpty() || saida.isEmpty() ||
                    servico.isEmpty() || data.isEmpty() || kilos.isEmpty() || hora.isEmpty())  {

                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos obrigatórios.");
                return;
            }

            // Verifica se o CNPJ é válido
            if (!isCnpjValido(cnpj)) {
                JOptionPane.showMessageDialog(null, "CNPJ inválido!");
                return;
            }

            Agendamento agend = new Agendamento(empresa, cnpj, servico, data, hora, entrada, saida, kilos, obs, valor);

            Connection conexao = new Conexao().getConnection();
            AgenDAO agendaInsert = new AgenDAO(conexao);
            agendaInsert.insert(agend);

            // Mostrar mensagem de sucesso após a inserção bem-sucedida
            JOptionPane.showMessageDialog(null, "Agendamento salvo com sucesso");
        } catch (SQLException ex) {
            // Tratar exceções de SQL aqui, se necessário
            JOptionPane.showMessageDialog(null, "Erro ao salvar o agendamento: " + ex.getMessage());
        }
    }

    private int mapearEntradaParaIndice(String entrada) {
        int indice = 0;

        if ("Base Bandeirantes".equals(entrada)) {
            indice = 1;
        } else if ("Base Machado de Assis".equals(entrada)) {
            indice = 2;
        } else if ("Base Dragão do Mar".equals(entrada)) {
            indice = 3;
        } else if ("Base Candango".equals(entrada)) {
            indice = 4;
        } else if ("Base Corumbá".equals(entrada)) {
            indice = 5;
        } else if ("Base Pelourinho".equals(entrada)) {
            indice = 6;
        } else if ("Base Frevo".equals(entrada)) {
            indice = 7;
        } else if ("Base Tingui".equals(entrada)) {
            indice = 8;
        }

        return indice;
    }

    private int mapearSaidaParaIndice(String saida) {
        int indice = 0;

        if ("Base Bandeirantes".equals(saida)) {
            indice = 1;
        } else if ("Base Machado de Assis".equals(saida)) {
            indice = 2;
        } else if ("Base Dragão do Mar".equals(saida)) {
            indice = 3;
        } else if ("Base Candango".equals(saida)) {
            indice = 4;
        } else if ("Base Corumbá".equals(saida)) {
            indice = 5;
        } else if ("Base Pelourinho".equals(saida)) {
            indice = 6;
        } else if ("Base Frevo".equals(saida)) {
            indice = 7;
        } else if ("Base Tingui".equals(saida)) {
            indice = 8;
        }

        return indice;
    }
 
  public boolean isCnpjValido(String cnpj) {
        // Remove caracteres não numéricos do CNPJ
        cnpj = cnpj.replaceAll("[^0-9]", "");

        // Verifica se o CNPJ tem 14 dígitos após a remoção de caracteres não numéricos
        if (cnpj.length() != 14) {
            return false;
        }
        
        try {
            // Calcula os dígitos verificadores do CNPJ
            int soma = 0;
            int peso = 2;
            for (int i = 11; i >= 0; i--) {
                int digito = Character.getNumericValue(cnpj.charAt(i));
                soma += digito * peso;
                peso = (peso == 9) ? 2 : peso + 1;
            }

            int resto = soma % 11;
            int digitoVerificador1 = (resto < 2) ? 0 : (11 - resto);

            soma = 0;
            peso = 2;
            for (int i = 12; i >= 0; i--) {
                int digito = Character.getNumericValue(cnpj.charAt(i));
                soma += digito * peso;
                peso = (peso == 9) ? 2 : peso + 1;
            }

            resto = soma % 11;
            int digitoVerificador2 = (resto < 2) ? 0 : (11 - resto);

            // Verifica se os dígitos verificadores calculados são iguais aos dígitos originais do CNPJ
            return (digitoVerificador1 == Character.getNumericValue(cnpj.charAt(12)) &&
                    digitoVerificador2 == Character.getNumericValue(cnpj.charAt(13)));
        } catch (InputMismatchException e) {
            return false;
        }
    }
}

