/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monthlybudgetchecker;

import javax.swing.JOptionPane;

/**
 * Activity 4: Monthly budget checker 
 * This app helps a student determine if their spending is within monthly budget
 * Using jOptionPane
 */

public class MonthlyBudgetChecker {
    
    public static double calculateExpenses(double food, double transport, double entertainment) {
        return food + transport + entertainment;
    }

    public static void main(String[] args) {
        
        //Get user input
        
        String allowanceInput = JOptionPane.showInputDialog("Enter monthly allowance (R): ");
        double allowance = Double.parseDouble(allowanceInput);
        
        String foodInput = JOptionPane.showInputDialog("Enter monthly food expense (R): ");
        double food = Double.parseDouble(foodInput);
        
        String transportInput = JOptionPane.showInputDialog("Enter the monthly transport expense (R): ");
        double transport = Double.parseDouble(transportInput);
        
        String entertainmentInput = JOptionPane.showInputDialog("Enter the monthly entertainment expenses (R): ");
        double entertainment = Double.parseDouble(entertainmentInput);
        
        //Get total Expenses using method
        
        double totalExpenses = calculateExpenses(food, transport, entertainment);
        
        //Calculating the money remaining
        
        double moneyRemaining = allowance - totalExpenses;
        
        //Determining the budget status
        
        String budgetStatus;
        
        if (moneyRemaining >= 0) {
            budgetStatus = "You are within budget.";
            
        } else {
            budgetStatus = "You are overspending.";
        }
        
        String budgetResult = "Total Expenses: R" + (int)totalExpenses + "\n"
                                + "Remaining money: R" + (int)moneyRemaining + "\n"
                                + budgetStatus;
        
        JOptionPane.showMessageDialog(null, budgetResult); 
        
    }
}
