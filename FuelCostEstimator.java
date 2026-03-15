/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fuelcostestimator;

import java.util.Scanner;

public class FuelCostEstimator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Distance of the trip(km): ");
        double distance = scanner.nextDouble();
        
        System.out.print("Enter fuel consumption(km per litre): ");
        double consumption = scanner.nextDouble();
        
        System.out.print("Enter fuel price per litre: ");
        double fuelPrice = scanner.nextDouble(); 
        
        scanner.close();
        
        //Call the methods and store their return values
        
        double litresNeeded = calculateFuelNeeded(distance, consumption);
        double tripCost = calculateTripCost(litresNeeded, fuelPrice);
        
        System.out.println("Fuel needed: " + String.format("%.2f", litresNeeded) + " litres ");
        System.out.println("Trip cost: R" + String.format("%.2f", tripCost));
        
}
        
    public static double calculateFuelNeeded(double distance, double consumption) {
        double fuelNeeded = distance / consumption;
        return fuelNeeded;
    }
    
    public static double calculateTripCost(double fuelNeeded, double fuelPrice) {
        double tripCost = fuelNeeded * fuelPrice;
        return tripCost;
    }
}
   


