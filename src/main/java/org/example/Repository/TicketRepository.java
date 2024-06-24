package org.example.Repository;

import org.example.Models.Ticket;

import java.util.HashMap;

public class TicketRepository {

    HashMap<Long,Ticket> hm2 = new HashMap<>();

    private Long prevTicketId =0L;

    public Ticket SaveTicket(Ticket ticket) {
        if(ticket.getId()==null){
            prevTicketId+=1;
            ticket.setId(prevTicketId);
            hm2.put(prevTicketId,ticket);
        }
        return ticket;
    }
}
