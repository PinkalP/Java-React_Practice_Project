package com.pinkal;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car Honda = new Car();

        BankAccount BobAccount = new BankAccount("12345",100.00,"Bob Brown", "Bobbrown@gmail.com","5706854495");
        System.out.println(BobAccount.getAccountNumber());
        System.out.println(BobAccount.getBalance());
        System.out.println(BobAccount.getCust_name());
        System.out.println(BobAccount.getEmail());
        System.out.println(BobAccount.getPhoneNumber());

        BankAccount Bob_Account = new BankAccount();
        Bob_Account.withdrawal(100);
        Bob_Account.setBalance(500.00);
        Bob_Account.setCust_name("Bob Brown");
        Bob_Account.setEmail("Bobbrown@gmail.com");
        Bob_Account.setPhoneNumber("(570)- 688 - 4485");


        Bob_Account.deposite(500);
        Bob_Account.withdrawal(50.00);

        VipCustomer Happy = new VipCustomer("happy",100, "happy@gmail.com");
        System.out.println(Happy.getName());

        VipCustomer Tim = new VipCustomer("Tim",1500);
        System.out.println(Tim.getName());

        VipCustomer Keval = new VipCustomer("happy",100, "happy@gmail.com");
        System.out.println(Keval.getName());
        System.out.println(Keval.getEmail());
        System.out.println(Keval.getCreditLimit());

        porsche.setModel ("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
