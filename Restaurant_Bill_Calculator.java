/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurant_bill_calculator;

import java.util.Scanner;

/**
 * Restaurant Bill Calculator
 * Prompts the user for meal, drink, and dessert prices,
 * then calculates and displays the total bill.
 */

public class Restaurant_Bill_Calculator {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Enter the meal price: ");
    double mealPrice = scanner.nextDouble();
    
    System.out.print("Enter drink price: ");
    double drinkPrice = scanner.nextDouble();
    
    System.out.print("Enter dessert price: ");
    double dessertPrice = scanner.nextDouble();
    
    scanner.close();
    
    calculateTotal(mealPrice, drinkPrice, dessertPrice);
    
    }
    
/**
 * Calculates and displays the total cost of the meal.
 * Does not return a value — prints the result directly.
 */
    
public static void calculateTotal(double mealPrice, double drinkPrice, double dessertPrice) {
    double total = mealPrice + drinkPrice + dessertPrice;
    
    System.out.print("Total bill: R" + total);
}
        
        
}

