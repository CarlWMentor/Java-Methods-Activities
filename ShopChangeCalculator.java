/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shopchangecalculator;

import javax.swing.JOptionPane;

public class ShopChangeCalculator {
    
    public static double getItemPrice(){
        String itemPriceInput = JOptionPane.showInputDialog("Enter Item price: R");
        double price = Double.parseDouble(itemPriceInput);
        return price;
    }
        
    public static double getAmountPaid() {
        String amountPaidInput = JOptionPane.showInputDialog("Enter amount paid: R");
        double paid = Double.parseDouble(amountPaidInput);
        return paid;
    } 
    
    public static String calculateChange(double price,double paid) {
        double change = paid - price;
        String changeStatus;
                
        if (change > 0) {
            changeStatus = "The customer is owed: R" + String.format("%.2f", change);
        } else if (change == 0) {
            changeStatus = "The customer is owed no change";
        } else { //change < 0
            changeStatus = "The customer owes: R" + String.format("%.2f" , Math.abs(change));
        }
        
        return changeStatus;
     
    }
    
    public static void displayChange(double price, double paid, String changeStatus) {
        JOptionPane.showMessageDialog(null,
                " Item Price: R" + String.format("%.2f",price) +
                "\n Amount paid: R" + String.format("%.2f",paid) +
                "\n" + changeStatus );
    }
    

    public static void main(String[] args) {
        
        double price = getItemPrice();
        double paid = getAmountPaid();
        String changeStatus = calculateChange(price, paid);
        displayChange(price, paid, changeStatus);
        
    }
}

