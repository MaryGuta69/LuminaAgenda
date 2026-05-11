/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import dao.AgendamentoDAO;
import dao.AgendamentoDAOImpl;
import service.AgendamentoService;


/**
 *
 * @author maryg
 */
public class Main {
    public static void main (String[]args )
    {
        Cliente c = new Cliente(1, "Maria", "11987654321");
        Profissional p = new Profissional(1, "Ana", "Cabelereira");
        Servico s = new Servico("Corte", 50.0,30);
        Agendamento ag = new Agendamento(
                new Date(),
                "10:00",
                c,
                p,
                s,
                Status.AGENDADO,
                TipoAtendimento.PRESENCIAL
        );
        
        
        Agendamento ag2 = new Agendamento(
                new Date(),
                "14:00",
                c,
                p,
                s,
                Status.AGENDADO,
                TipoAtendimento.PRESENCIAL
        );
        //DAO
        AgendamentoDAO dao = new AgendamentoDAOImpl();
        
        //SERVICE
        AgendamentoService service = new AgendamentoService(dao);
        
        //salvar agendamento
        try{
            service.agendar(ag);
            System.out.println("Primeiro Agendamento realizado!");
            
            service.agendar(ag2);
            System.out.println("Segundo Agendamento realizado!");
        }catch (RuntimeException e) {
            
            System.out.println(e.getMessage());
            
        }
    }
}

    