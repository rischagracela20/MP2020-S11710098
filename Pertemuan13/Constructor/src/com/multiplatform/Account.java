package com.multiplatform;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account(){
        System.out.println("Constructor without parameters is running");
    }

    public String getNumber() {
        return number;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + "made. New balance is" + this.balance);
    }
    public void withdrawal(double amount){
        if (this.balance - amount < 0){
            System.out.println("Insufficient funds. Withdrawal not processes");
        }else {
            this.balance -=amount;
            System.out.println("");
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
