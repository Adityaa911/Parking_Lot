package org.example.Models;

public class Vechile extends Base_Model{

    private String OwnerName;

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getVechileNumber() {
        return VechileNumber;
    }

    public void setVechileNumber(String vechileNumber) {
        VechileNumber = vechileNumber;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    private VechileType vechileType;
    private String VechileNumber;
}
