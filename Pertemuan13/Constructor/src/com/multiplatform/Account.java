package com.multiplatform;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;


    public Account(){
        this("99999999", 0.0, "Default Name", "Default email", "Default phone number");
    }
    public  Account(String number, double balance, String customerName, String emailAddress, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;

    }

    public Account(String customerName, String emailAddress, String phoneNumber) {
        this("99999999", 0.0, customerName, emailAddress, phoneNumber);
    }

    public String getNumber() {
        return number;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is" + this.balance);
    }
    public void withdrawal(double amount){
        if (this.balance - amount < 0){
            System.out.println("Insufficient funds. Withdrawal not processes");
        }else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + "processed, Remaining balance is" + this.balance);
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
