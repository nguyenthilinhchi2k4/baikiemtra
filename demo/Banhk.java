package com.example.demo;

public class Banhk {
    private double balace;
    private double rate;

    public Banhk(double balace, double rate) {
        this.balace = balace;
        this.rate = rate;
    }

    public double calculateInterest() {
        return balace * (rate / 1200);
    }
}



