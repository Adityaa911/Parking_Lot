package org.example.Models;

import java.util.List;

public class ParkingSpot extends Base_Model{

    private List<VechileType> SupportedVechileTypes;

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public int getSpotNumber() {
        return SpotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        SpotNumber = spotNumber;
    }

    public List<VechileType> getSupportedVechileTypes() {
        return SupportedVechileTypes;
    }

    public void setSupportedVechileTypes(List<VechileType> supportedVechileTypes) {
        SupportedVechileTypes = supportedVechileTypes;
    }

    private ParkingSpotStatus parkingSpotStatus;
    private int SpotNumber;
    private ParkingFloor parkingFloor;
}
