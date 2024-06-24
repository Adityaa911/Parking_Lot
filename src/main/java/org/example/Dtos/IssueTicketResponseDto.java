package org.example.Dtos;


import org.example.Models.Ticket;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private TicketStatus ticketStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }


}
