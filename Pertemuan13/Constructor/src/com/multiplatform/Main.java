package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account johnsAccount = new Account("111111", 200.00, "John", "john@mail.com","123456789");
//        bobsAccount.setCustomerName("Bob");
//        bobsAccount.setNumber("123456789");
//        bobsAccount.setBalance(100.00);
//        bobsAccount.setEmailAddress("bob@mail.com");
//        bobsAccount.setPhoneNumber("(62)0811324234");

        System.out.println("Customer name :" + johnsAccount.getCustomerName());
        System.out.println("Balance : " + johnsAccount.getBalance());
        johnsAccount.deposit(50.0);
        System.out.println("Balance : "+ johnsAccount.getBalance());
        johnsAccount.withdrawal(155.0);

        Account bobsAccount = new Account();
        System.out.println("Customer name: " + bobsAccount.getCustomerName());
        System.out.println("Balance : " + bobsAccount.getBalance());
    }
}
