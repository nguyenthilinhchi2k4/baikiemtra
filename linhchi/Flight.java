package com.example.linhchi;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination) {
        if (number > 0) {
            this.number = number;
            this.destination = destination;
        } else {
            this.number = 0;
            this.destination = "";
        }
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.printf("%d, %s\n", number, destination);
    }

    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");
        g1.display();
    }
}
