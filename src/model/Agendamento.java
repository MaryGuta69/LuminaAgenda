/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 *
 * @author maryg
 */
public class Agendamento {
    private Date data;
    private String horario;
    
private Cliente cliente;
private Profissional profissional;
private Servico servico;

private Status status;
private TipoAtendimento tipoAtendimento;
 public Agendamento(Date data, String horario, Cliente cliente, Profissional profissional, Servico servico, 
         Status status, TipoAtendimento tipoAtendimento) {
     this.data = data;
     this.horario = horario;
     this.cliente = cliente; 
     this.profissional = profissional;
     this.servico = servico;
     this.status = status;
     this.tipoAtendimento = tipoAtendimento;
 }
 public Date getData(){
     return data;
 }
 public String getHorario(){
     return horario;
 }
 public Cliente getCliente(){
     return cliente;
 }
 public Profissional getProfissional (){
     return profissional;
 }
 public Servico getServico(){
     return servico;
 }
 public Status getStatus(){
     return status;
 }
 public TipoAtendimento getTipoAtendimento(){
     return tipoAtendimento;
 }
     
 }
 
 
 
    

