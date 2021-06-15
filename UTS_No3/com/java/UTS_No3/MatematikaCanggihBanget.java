package com.java.UTS_No3;

public class MatematikaCanggihBanget extends MatematikaCanggih{


    MatematikaCanggihBanget(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public void pertambahanEmpat(int a, int b, int c, int d) {

        int hasil = (super.a + super.b + super.c + super.d) + (a + b + c + d);
        System.out.println("=== Pertambahan Empat ===");
        System.out.println("Hasil dari Pertambahan Empat: " + hasil + "\n");

    }
}
