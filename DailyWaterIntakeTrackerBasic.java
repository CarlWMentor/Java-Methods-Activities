/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dailywaterintaketrackerbasic;

import java.util.Scanner;

public class DailyWaterIntakeTrackerBasic {
    
    static Scanner scanner = new Scanner (System.in);
    static int morning, afternoon, evening, total ;
    
    //Method 1: Ask for your user input for number of glasses of water taken during day
    static void getInput() {
        System.out.print("Enter glasses of water in the morning: ");
        morning = scanner.nextInt();
        
        System.out.print("Enter glasses of water in the afternoon: ");
        afternoon = scanner.nextInt();
        
        System.out.print("Enter glasses of water in the evening: ");
        evening = scanner.nextInt();
        
    }
    
    //Method2 : Calculate the total number of glasses
    static void calculateTotal() {
        total = morning + afternoon + evening;
        
    }
    
    //Method3: Display the total amount
    static void displayResult() {
        System.out.println("Total glasses consumed today: " + total);
    }
     

    public static void main(String[] args) {
        getInput();
        calculateTotal();
        displayResult();
        
    }
}

