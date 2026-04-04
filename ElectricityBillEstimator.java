/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electricitybillestimator;

import javax.swing.JOptionPane;

public class ElectricityBillEstimator {
    
    static final double BILL_LIMIT = 150.0 ;
    
    static void runApp() {
        
        String unitUsedInput = JOptionPane.showInputDialog("Enter units used: ");
        String pricePerUnitInput = JOptionPane.showInputDialog("Enter price per unit: ");
        
        double unit = Double.parseDouble(unitUsedInput);
        double price = Double.parseDouble(pricePerUnitInput);
        
        double bill = calculateBill(unit,price);
        
        boolean high = isHigh(bill);
        
        String reportMessage = "Units used: "        + String.format("%.2f",unit) + "\n"
                                + "Bill limit: "     + String.format("%.2f",BILL_LIMIT) + "\n"
                                + "Price of usage: " + String.format("%.2f", price) + "\n"
                                + "Total Bill: "     + String.format("%.2f", bill) + "\n"
                                + "Is Bill High? "   + (high ? "YES" : "NO") ;
        
        JOptionPane.showMessageDialog(null,reportMessage, "Electricty Bill Estimator", JOptionPane.INFORMATION_MESSAGE);
        
    }
    static double calculateBill(double unit, double price) {
            return unit * price;
        }
    
    static boolean isHigh(double bill) {
        return bill > BILL_LIMIT;
     }

    public static void main(String[] args) {
        runApp();
    }
}
