/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que representa um agendamento de serviço.
 * Armazena informações sobre o agendamento, como ID, cliente, serviço, valor, data e observação.
 * 
 * Esta classe possui construtor para inicialização e métodos para acesso e modificação dos atributos.
 * Utiliza formatação de data e tratamento de exceções para criar o objeto Date a partir de uma string.
 * 
 * @author loren & Rick
 */
public class Agendamento {
    private String empresa; // Cliente associado ao agendamento.
    private String cnpj;
    private String servico;   // Serviço agendado.       // Valor do agendamento.
    private Date data;         // Data do agendamento 
    private String hora;
    private String entrada;
    private String saida;
    private String kilos;
    private String obs;
    private float valor;

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setSaida(String Saida) {
        this.saida = Saida;
    }
   
    public String getEntrada() {
        return entrada;
    }

    public String getSaida() {
        return saida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }

    public String getKilos() {
        return kilos;
    }

    public void setKilos(String kilos) {
        this.kilos = kilos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    /**
     * Construtor para inicializar um agendamento com informações detalhadas.
     * @param entrada
     * @param saida
     * @param kilos
     * @param cnpj CNPJ da empresa.
     * @param empresa Cliente associado ao agendamento.
     * @param servico Serviço agendado.
     * @param data Data do agendamento no formato "dd/MM/yyyy HH:mm".
     * @param obs Observação da entrega
     */
    public Agendamento(String empresa, String cnpj, String servico, String data,String hora, String entrada, String saida, String kilos, String obs) {
       this.empresa = empresa;
       this.cnpj = cnpj;
       this.servico = servico;
       this.entrada = entrada;
       this.saida = saida;
       this.kilos = kilos;
       this.obs = obs;
        try {
            // Converte a string de data para o objeto java.sql.Date usando SimpleDateFormat.
            java.util.Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            this.data = new java.sql.Date(dataFormatada.getTime()); // Converte para java.sql.Date
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.hora = hora;
    
    }  

    public Agendamento(String empresa, String cnpj, String servico, String data,String hora, String entrada, String saida, String kilos, String obs, float valor) {
       this.empresa = empresa;
       this.cnpj = cnpj;
       this.servico = servico;
       this.entrada = entrada;
       this.saida = saida;
       this.kilos = kilos;
       this.obs = obs;
       this.valor = valor;
       try {
            // Converte a string de data para o objeto java.sql.Date usando SimpleDateFormat.
            java.util.Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            this.data = new java.sql.Date(dataFormatada.getTime()); // Converte para java.sql.Date
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hora = hora;
    
    
    }
    
    
  }