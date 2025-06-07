package com;

public class Mainjava {
    public static void main(String[] args) {
        Simcards sim1 = new Simcards("Airtel", "9010101001", true, "Prepaid", 1.5, 28, "4G", "Madhu", "Kakinada");
        Simcards sim2 = new Simcards("Jio", "9000000000", true, "Postpaid", 50, 56, "5G", "Vijaya", "Kakinada");

        sim1.displayInfo();
        sim2.displayInfo();
    }
}