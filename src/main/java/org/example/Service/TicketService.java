package org.example.Service;

import org.example.Exceptions.GateNotFoundException;
import org.example.Factory.SpotAssignmentStartegyFactory;
import org.example.Models.*;
import org.example.Repository.GateRepository;
import org.example.Repository.ParkingSpotRespository;
import org.example.Repository.TicketRepository;
import org.example.Repository.VechileRepository;
import org.example.Strategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VechileRepository vechileRepository;
    private ParkingSpotRespository parkingSpotRespository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,VechileRepository vechileRepository,ParkingSpotRespository
                  parkingSpotRespository,TicketRepository ticketRepository)
    {
        this.parkingSpotRespository = parkingSpotRespository;
        this.vechileRepository=vechileRepository;
        this.gateRepository=gateRepository;
        this.ticketRepository = ticketRepository;
    }


    public Ticket IssueTicket(Long gateId,
                              String vechileNumber,
                              String vechileOwnerName,
                              VechileType vechileType) throws GateNotFoundException {

        Ticket ticket = new Ticket();

        ticket.setEntryDate(new Date());

//        Gate gate;
//        ticket.setGeneratedBy(gate.getOperator());


        //Find the Gateid by gate object
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);

        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException("Invalid gateId: " + gateId);
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);

        //find or store the vechile object in db

        Optional<Vechile> optionalVechile = vechileRepository.findVechileByVechileNumber(vechileNumber);

        Vechile savedVechile = null;

        if (optionalVechile.isEmpty()) {
            Vechile vechile = new Vechile();
            vechile.setVechileType(vechileType);
            vechile.setVechileNumber(vechileNumber);
            vechile.setOwnerName(vechileOwnerName);

            savedVechile = vechileRepository.Save(vechile);
        } else {
            savedVechile = optionalVechile.get();
        }

        ticket.setVechile(savedVechile);

        //Asign the spot for vechile

        ParkingLot parkingLot = parkingSpotRespository.getParkingLotByGateId(gateId);

        SpotAssigmnetStraegyType spotAssigmnetStraegyType = parkingLot.getSpotAssigmnetStraegyType();

        SpotAssignmentStrategy spotAssignmentStrategy =
                SpotAssignmentStartegyFactory.getSpotAssignmentStaregyFprType(spotAssigmnetStraegyType);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vechileType,gate);
        ticket.setParkingSpot(parkingSpot);

        ticket.setNumber("Number_" + gateId + "_" + ticket.getCreatedAt());

        return  ticketRepository.SaveTicket(ticket);

    }
}
