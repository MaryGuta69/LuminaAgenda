/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Agendamento;

/**
 *
 * @author maryg
 */
public class AgendamentoDAOImpl implements AgendamentoDAO{
    
    private List<Agendamento> agendamentos = new ArrayList<>();
    
    @Override
    public void salvar(Agendamento agendamento){
        agendamentos.add(agendamento);
    }
    
@Override
public List<Agendamento> listar(){
    return agendamentos;
    
}
}
