package com.company;

public class VipCustomer {
    private String vipName;
    private String vipEmail;
    private double creditLimit;

    // Challenge
    public VipCustomer() {
        this("John Doe", 5000.00, "mail@mail.com");
    }


    public VipCustomer(String vipName, Double creditLimit, String vipEmail) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;
    }

    public VipCustomer(String vipName, String vipEmail) {
        this(vipName, 5000.00, vipEmail);
    }

    public String getVipName() {
        return vipName;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
