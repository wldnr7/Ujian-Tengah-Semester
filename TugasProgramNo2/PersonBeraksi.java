package com.java.TugasProgramNo2;

public class PersonBeraksi {

    public static void main(String[] args) {

        //object with values

        //object 1
        Person person1 = new Person();
        person1.name = "Wildan Nur Rahman";
        person1.age = 19;
        person1.country = "Indonesia";
        person1.phoneNumber = "813-8143-6734";
        person1.email = "wildannurrahman30@gmail.com";
        person1.address = "Pamulang, jalan benda barat 13";

        person1.showPerson();


        //object 2
        Person person2 = new Person();
        person2.name = "Mary Smith";
        person2.age = 17;
        person2.country = "United States";
        person2.phoneNumber = "704-673-0728";
        person2.email = "iammarrysmith22@gmail.com";
        person2.address = "Gastonia, 3837 Snyder Avenue";

        person2.showPerson();


    }
}
