package com.bridgelabz;

import com.bridgelabz.InvoiceSummary.InvoiceSummary;


public class CaluculateFare {
    private static final int TimePerCost = 1;
    private static final double CostPerKilometer = 10;

    private static final int MINIMUMFARE = 5;
    private double distance;
    private int time;


    public double calculateFare(double distance, int time) {
        double totalFare = distance * CostPerKilometer + time * TimePerCost;
        return Math.max(totalFare, MINIMUMFARE);
    }


    public InvoiceSummary calculateFare(CaluculateFare[] rides) {
        double totalFare = 0;
        for	(CaluculateFare ride:rides)	{
            totalFare += this.calculateFare(ride.distance,ride.time);
            System.out.println("distance "+ride.distance+"time"+ride.time);

        }
        return new InvoiceSummary(rides.length,totalFare);
    }
}
