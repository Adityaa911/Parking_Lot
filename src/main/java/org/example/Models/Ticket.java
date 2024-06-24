package org.example.Models;

import java.util.Date;

public class Ticket extends Base_Model {

    private String number;
    private ParkingSpot parkingSpot;
    private Date entryDate;
    private Vechile vechile;
    private Gate GeneratedAt;
    private Operator GeneratedBy;

    public Gate getGeneratedAt() {
        return GeneratedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        GeneratedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return GeneratedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        GeneratedBy = generatedBy;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vechile getVechile() {
        return vechile;
    }

    public void setVechile(Vechile vechile) {
        this.vechile = vechile;
    }


}
