package com.company;

public class Main {

    public static void main(String[] args) {
        // This is just the default constructor called
        //Account myAcct = new Account();

//        Account myAcct = new Account("12345", 2000, "Tim Tool", "tt@gmail.com",
//                "202-555-1234");
//
//        myAcct.withdrawFunds(100);
//        myAcct.depositFunds(1250);
//        myAcct.withdrawFunds(5000);
//        System.out.println(myAcct.getName());
//        System.out.println(myAcct.getEmail());
//
//        Account timsAcct = new Account("Tim", "tim@mail.com", "1320-30093");
//        System.out.println("Tims number: " + timsAcct.getNumber() + " Tims Name: " + timsAcct.getName());

        // Challenge
        VipCustomer bigDeal = new VipCustomer();
        System.out.println("default name: " + bigDeal.getVipName() + " default limit " + bigDeal.getCreditLimit() +
        " default email " + bigDeal.getVipEmail());

        VipCustomer mJordan = new VipCustomer("Michael Jordan", 10000.00, "mj@gmail.com");
        System.out.println(mJordan.getVipName() + " " + mJordan.getVipEmail() + " has a limit of "
                + mJordan.getCreditLimit());

        VipCustomer defaultLimit = new VipCustomer("Thomas Thompson", "timmyt@tmail.com");
        System.out.println(defaultLimit.getVipName() + " Has a default limit of " + defaultLimit.getCreditLimit());
    }
}
