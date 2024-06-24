package org.example.Models;

import java.util.List;

public class ParkingLot extends Base_Model{
    private List<ParkingFloor> parkingFloors;

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public FeesCalculationStrategyType getFeesCalculationStrategyType() {
        return feesCalculationStrategyType;
    }

    public void setFeesCalculationStrategyType(FeesCalculationStrategyType feesCalculationStrategyType) {
        this.feesCalculationStrategyType = feesCalculationStrategyType;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<VechileType> getSuppotedVechileTypes() {
        return suppotedVechileTypes;
    }

    public void setSuppotedVechileTypes(List<VechileType> suppotedVechileTypes) {
        this.suppotedVechileTypes = suppotedVechileTypes;
    }

    public SpotAssigmnetStraegyType getSpotAssigmnetStraegyType() {
        return spotAssigmnetStraegyType;
    }

    public void setSpotAssigmnetStraegyType(SpotAssigmnetStraegyType spotAssigmnetStraegyType) {
        this.spotAssigmnetStraegyType = spotAssigmnetStraegyType;
    }

    private ParkingLotStatus parkingLotStatus;
    private List<Gate> gates;
    private List<VechileType> suppotedVechileTypes;
    private SpotAssigmnetStraegyType spotAssigmnetStraegyType;
    private FeesCalculationStrategyType feesCalculationStrategyType;
}
