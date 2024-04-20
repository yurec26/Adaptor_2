package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int sumInt = aInt + bInt;
        return Integer.toBinaryString(sumInt);
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int multInt = aInt * bInt;
        return Integer.toBinaryString(multInt);
    }
}