package org.example.Controller;

import org.example.Dtos.IssueTicketRequestDto;
import org.example.Dtos.IssueTicketResponseDto;
import org.example.Dtos.TicketStatus;
import org.example.Exceptions.GateNotFoundException;
import org.example.Models.Ticket;
import org.example.Service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto IssueTicket(IssueTicketRequestDto issueTicketRequestDto) {

        IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();

        try {
            Ticket ticket = ticketService.IssueTicket(
                    issueTicketRequestDto.getGateId(),
                    issueTicketRequestDto.getVechileNumber(),
                    issueTicketRequestDto.getVechileOwner(),
                    issueTicketRequestDto.getVechileType());

            issueTicketResponseDto.setTicket(ticket);
            issueTicketResponseDto.setTicketStatus(TicketStatus.SUCCESS);


        } catch (GateNotFoundException gateNotFoundException) {
            gateNotFoundException.getMessage();
            issueTicketResponseDto.setTicketStatus(TicketStatus.FAILURE);
        }
        return issueTicketResponseDto;
    }
}