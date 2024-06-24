package org.example.Models;

public class Gate extends Base_Model{
    private Operator operator;
    private GateType gateType;
    private GateStatus gateStatus;
    private int GateNumber;

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getGateNumber() {
        return GateNumber;
    }

    public void setGateNumber(int gateNumber) {
        GateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }


}
