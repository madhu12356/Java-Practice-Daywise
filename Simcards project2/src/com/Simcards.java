package com;

public class Simcards {
    private String provider;
    private String phoneNumber;
    private boolean isActive;
    private String planType;
    private double dataBalance;
    private int validityDays;
    private String simType;
    private String customerName;
    private String customerAddress;

    public Simcards(String provider, String phoneNumber, boolean isActive,
                    String planType, double dataBalance, int validityDays, String simType,
                    String customerName, String customerAddress) {
        this.provider = provider;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.planType = planType;
        this.dataBalance = dataBalance;
        this.validityDays = validityDays;
        this.simType = simType;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void displayInfo() {
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Address        : " + customerAddress);
        System.out.println("Provider       : " + provider);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("Active         : " + isActive);
        System.out.println("Plan Type      : " + planType);
        System.out.println("Data Balance   : " + dataBalance + " GB");
        System.out.println("Validity Days  : " + validityDays);
        System.out.println("SIM Type       : " + simType);
        System.out.println("");
    }
}