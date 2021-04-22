package com.java.UTS_No4_1;

public class classBedaPackage {

    //class dan method ini akan dipanggil di package UTS_No4_2

    public void show() {
        System.out.println("Ini merupakan method yang berada di package yang berbeda");
        int a = 10;
        int b = 10;
        int hasil = a + b;
        System.out.println("Hasil: " + hasil );


    }
}
