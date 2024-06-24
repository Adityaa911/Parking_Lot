package org.example.Strategy;

import org.example.Models.Gate;
import org.example.Models.ParkingSpot;
import org.example.Models.VechileType;

public interface SpotAssignmentStrategy {

    public ParkingSpot assignSpot(VechileType vechileType, Gate gate);
}
