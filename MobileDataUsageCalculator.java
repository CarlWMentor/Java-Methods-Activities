
/*
 * MobileDataUsageCalculator.java
 * 
 * A simple Java application that allows a mobile user to track
 * their monthly data usage against a fixed data limit.
 * 
 * Demonstrates: constants, static methods, return values,
 * relational operators, and JOptionPane GUI dialogs.
 * 
 * Author: decentechguy
 * Course: BSc Computer Science, Year 1 — Java Programming
 */
package com.mycompany.mobiledatausagecalculator;

import javax.swing.JOptionPane; //imports the JOptionPane for the GUI dialog box

public class MobileDataUsageCalculator {
    
    /**
     * The monthly data allowance in gigabytes.
     * Declared as a constant (static final) so the value cannot be changed
     * at run-time and is shared across all methods without needing to be passed.
     */
    static final double DATA_LIMIT_GB = 10.0;
    
    /**
     * Launches the application.
     * Collects user input, delegates calculation to helper methods,
     * and displays the result using a JOptionPane dialog.
     */
    static void startApp() {
       String input = JOptionPane.showInputDialog("Enter the data used, in GB");
       double used = Double.parseDouble(input);
       
       double remaining = calculateRemaining(used);
       
       boolean exceeded = isExceeded(used);
       
       String resultMessage = " Data Used: "          +  String.format("%.2f",used ) + "GB\n"
                             + " Data Limit: "         +  String.format("%.2f", DATA_LIMIT_GB) + "GB\n"
                             + " Data Remaining: "     +  String.format("%.2f", remaining) + "GB\n"
                             + " Data Exceeded: "      +  (exceeded? "YES" : "NO" );
                              
       JOptionPane.showMessageDialog(null,resultMessage,"Data Usage Report", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Calculates the remaining data allowance.
     * If the user has exceeded their limit, returns 0.0 rather than a negative value.
     *
     * @param used  The amount of data consumed this month, in GB.
     * @return      The remaining data in GB, or 0.0 if the limit is exceeded.
     */
    static double calculateRemaining(double used) {
           double remaining = DATA_LIMIT_GB - used;
           return remaining > 0 ? remaining: 0.0 ;
       }
    
 /**
 * Checks whether the user has exceeded the monthly data limit.
 *
 * @param used  The amount of data consumed this month, in GB.
 * @return      true if usage exceeds DATA_LIMIT_GB, false otherwise.
 */      
    static boolean isExceeded(double used) {
           return used > DATA_LIMIT_GB;
       }
    
 /**
 * Application entry point. Starts the data usage checker.
 *
 * @param args  Command-line arguments (not used in this application).
 */
    public static void main(String[] args) {
        startApp();
         }
}
    


