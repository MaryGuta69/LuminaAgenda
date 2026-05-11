/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maryg
 */
public class Servico {
    
    private String nome;
    private double valor;
    private int duracao;
    
    public Servico( String nome, double valor, int duracao){
        this.nome = nome;
        this.valor = valor;
        this.duracao = duracao;
    }
    public String getNome(){
        return nome;
    }
    public double getValor(){
        return valor;
    }
    public int getDuracao(){
        return duracao;
    }
}
    
    
    
    

