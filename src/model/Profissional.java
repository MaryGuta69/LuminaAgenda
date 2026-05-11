/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maryg
 */
public class Profissional {
    
    private int id;
    private String nome;
    private String especialidade;
    
    public Profissional(int id, String nome, String especialidade){
        this.id = id; 
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String especialidade() {
        return especialidade;
    }
    }
    

