package org.example.Models;

import java.util.Date;

public class Payment {
    private int amount;
    private PaymentMode paymentMode;

    public PaymentSatus getPaymentSatus() {
        return paymentSatus;
    }

    public void setPaymentSatus(PaymentSatus paymentSatus) {
        this.paymentSatus = paymentSatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        PaymentTime = paymentTime;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    private PaymentSatus paymentSatus;
    private String ReferenceNumber;
    private Date PaymentTime;
}
