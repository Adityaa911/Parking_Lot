package org.example.Dtos;

import org.example.Models.Gate;
import org.example.Models.VechileType;

public class IssueTicketRequestDto {

    private Long gateId;
    private String VechileNumber;
    private String VechileOwner;
    private VechileType vechileType;

    public String getVechileNumber() {
        return VechileNumber;
    }

    public void setVechileNumber(String vechileNumber) {
        VechileNumber = vechileNumber;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getVechileOwner() {
        return VechileOwner;
    }

    public void setVechileOwner(String vechileOwner) {
        VechileOwner = vechileOwner;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }


}
