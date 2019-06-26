package com.pinkal;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String cust_name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor");
    }

    public BankAccount(String accountNumber, double balance, String cust_name ,String email, String phoneNumber){
       this.accountNumber = accountNumber;
       this.balance = balance;
       this.cust_name = cust_name;
       this.email = email;
       this.phoneNumber = phoneNumber;

        System.out.println("Account Constructor with parameters called");
    }

    public void deposite(double balance){
        this.balance += balance;
    }

    public void withdrawal(double withdrawlAmount){
        if (balance - withdrawlAmount < 0){
            System.out.println("Only" + balance + "availbale. Withdrawal not processed");
        }else {
            balance -= withdrawlAmount;
            System.out.println("withdrawal of" + withdrawlAmount + "processed. Remaining balance = " +this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
