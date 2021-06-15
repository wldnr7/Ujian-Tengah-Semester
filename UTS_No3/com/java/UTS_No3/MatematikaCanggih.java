package com.java.UTS_No3;

public class MatematikaCanggih {

    //superclass
    int a;
    int b;
    int c;
    int d;

    MatematikaCanggih(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void pertambahan(){
        int hasil = this.a + this.b + this.c + this.d;
        System.out.println("=== Pertambahan ===");
        System.out.println("Hasil Pertambahan: " + hasil + "\n");
    }
    void perkalian(){
        int hasil = this.a * this.b * this.c * this.d;
        System.out.println("=== Perkalian ===");
        System.out.println("Hasil Perkalian: " + hasil + "\n");
    }
    void modulus(){
        int hasil = (this.a + this.b) % (this.c + this.d);
        System.out.println("=== Modulus ===");
        System.out.println("Hasil Modulus: " + hasil + "\n");
    }

}
