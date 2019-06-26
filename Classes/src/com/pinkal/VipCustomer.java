package com.pinkal;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("VIP cUSTOMER");
    }

    public VipCustomer(String name, int creditLimit) {
        this.name = name;
    }

    public VipCustomer() {
        this("Default Name" , 50000, "default@gmail.com");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
