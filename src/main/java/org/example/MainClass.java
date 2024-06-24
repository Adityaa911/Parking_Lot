package org.example;


import org.example.Controller.TicketController;
import org.example.Dtos.IssueTicketRequestDto;
import org.example.Dtos.IssueTicketResponseDto;
import org.example.Models.Ticket;
import org.example.Models.VechileType;
import org.example.Repository.GateRepository;
import org.example.Repository.ParkingSpotRespository;
import org.example.Repository.TicketRepository;
import org.example.Repository.VechileRepository;
import org.example.Service.TicketService;

public class MainClass {

    public static void main(String[] args) {

        IssueTicketRequestDto issueTicketRequestDto = new IssueTicketRequestDto();
          issueTicketRequestDto.setGateId(123L);
          issueTicketRequestDto.setVechileNumber("Mp20-1129");
          issueTicketRequestDto.setVechileOwner("AdityaGupta");
          issueTicketRequestDto.setVechileType(VechileType.TWO_WHEELER);

        VechileRepository vechileRepository = new VechileRepository();
        ParkingSpotRespository parkingSpotRespository = new ParkingSpotRespository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService;
        ticketService = new TicketService(
                        gateRepository,
                vechileRepository,
                parkingSpotRespository,
                ticketRepository
                );
        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDto issueTicketResponseDto = ticketController.IssueTicket(issueTicketRequestDto);

        Ticket ticket = issueTicketResponseDto.getTicket();
    }
}
