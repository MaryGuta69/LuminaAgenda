/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.AgendamentoDAO;
import model.Agendamento;

/**
 *
 * @author maryg
 */
public class AgendamentoService {

    private AgendamentoDAO dao;

    public AgendamentoService(AgendamentoDAO dao) {
        this.dao = dao;
    }

    public void agendar(Agendamento agendamento) {

        if (agendamento == null) {
            throw new RuntimeException("Agendamento inválido");

        }
        for (Agendamento ag : dao.listar()) {

            if (ag.getCliente().getId()
                    == agendamento.getCliente().getId()) {

                throw new RuntimeException("Cliente já possue agendamento");

            }
        }
        dao.salvar(agendamento);
    }

    public void listarAgendamento() {

        for (Agendamento ag : dao.listar()) {

            System.out.println("Profissional: " +
            ag.getProfissional().getNome());
            System.out.println("Serviço:" +
                    ag.getServico().getNome());
        
        System.out.println("Horário:" + ag.getHorario());

            System.out.println("------------------------");

        }
    }
}
