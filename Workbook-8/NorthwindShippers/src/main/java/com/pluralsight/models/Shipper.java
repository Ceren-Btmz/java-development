package com.pluralsight.models;

public class Shipper {
    private int shipperID;
    private String companyName;
    private double phone;

    public Shipper(int shipperID, String companyName, double phone) {
        this.shipperID = shipperID;
        this.companyName = companyName;
        this.phone = phone;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "shipperID=" + shipperID +
                ", companyName='" + companyName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
