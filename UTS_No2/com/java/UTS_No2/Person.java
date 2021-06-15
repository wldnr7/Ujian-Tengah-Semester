package com.java.UTS_No2;

public class Person {

    String name;
    String email;
    String country;
    String phoneNumber;
    int age;
    String address;

    void showPerson(){

        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age + " years old");
        System.out.println("Country      : " + country);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email        : " + email);
        System.out.println("Address      : " + address);
        System.out.println("\n");
    }

}
