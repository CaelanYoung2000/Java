//

// Start of program //

//

// Start of imports //

//

import java.util.Arrays; // Imported for use of String to Array //

import javax.swing.JOptionPane; // Imported for use of JOptionPane //

import java.util.Random; // Imported for use of Math.random //

import java.text.DecimalFormat; // Imported for use of decimal veiw //

//

// End of imports //

//

// Start of main class //

//

public class Main {
    
     public static void main(String[] args) {
 
//
         
// Start of declaring number of customers //
         
//
         
       System.out.println("\nAcquiring customer information for atleast 3 customers."); 
       
       int totalCustomers;
       
       totalCustomers = Integer.parseInt(JOptionPane.showInputDialog("How many customers would you like to enter? (Minimum of 3)")); //Input window
       
       int setValue = 0;
       
        while (setValue < 100) {
            
             if(totalCustomers >= 3) {
           
                System.out.println("\nPlease enter information for the "+totalCustomers+" customers that you declared."); //Confirms user input
                
                setValue = setValue + 101; //Breaks loop
           
       } else {
           
            System.out.println("\nYou entered a value that is invalid and/or less than the required amouunt of 3, Please enter an acceptable value."); //Error Prompt
           
            totalCustomers = Integer.parseInt(JOptionPane.showInputDialog("How many customers would you like to enter? (Minimum of 3)")); //Input window
            
            setValue = setValue + 0; //Continue the loop
         
       }          
    }   
        
//
         
// End of declaring number of customers //
         
//
         
// Start of declaring customer last names // 
         
//
         
        String[] customerLastName = new String[totalCustomers];
            
            for(int i = 0; i < totalCustomers; i++ ) {
                
                customerLastName[i] = JOptionPane.showInputDialog("Please enter the last name of all "+totalCustomers+" customers.");
                        
            }
            
            System.out.println("\nAll of the customers last names are "+Arrays.toString(customerLastName)+".");
            
//
         
// End of declaring customer last names // 
         
//
         
// Start of declaring customer state information // 
         
//

            System.out.println("\nAcquiring customer state information for atleast 3 customers."); 
      
            String[] customerState = new String[totalCustomers];
            
            for(int i = 0; i < totalCustomers; i++ ) {
                
                customerState[i] = JOptionPane.showInputDialog("Please enter the state of residency for all "+totalCustomers+" customers. (The inputs correlated with the order of customers last name Ex. First state will be connected to the first input and the second will be connected to the second...)");
                        
            }
            
            System.out.println("\nAll of the customers states of residency are "+Arrays.toString(customerState)+".");
            
//
         
// End of declaring customer state information // 
         
//
         
// Start of declaring customer phone numbers //

//
            
            System.out.println("\nAcquiring customer phone number for atleast 3 customers."); 
       
            String[] customerPhone = new String[totalCustomers];
            
                for(int i = 0; i < totalCustomers; i++ ) {
                
                    customerPhone[i] = JOptionPane.showInputDialog("Please enter the phone numbers of all "+totalCustomers+" customers.");
                        
            }
           
            System.out.println("\nAll of the customers phone numbers are "+Arrays.toString(customerPhone)+"."); 
            
//
            
// End of declaring customer phone numbers //
            
//
            
// Start of declaring customer id //
            
//
        
            Random rd = new Random(); // creating Random object
            
            int[] customerId = new int[totalCustomers];
            
            for (int i = 0; i < customerId.length; i++) {
                
                customerId[i] = rd.nextInt(); // storing random integers in an array
                
        }
            
//
            
// End of declaring customer id //
            
//
            
// Start of calling methods //
            
//
            System.out.println("\nAcquiring customer purchase information for customer."+customerLastName[0]); 
            
            System.out.println("\nCreating a sales report for all customers.");

            checkOut(totalCustomers,customerLastName);
            
            // double[] finalPriceAfterTax = new double[totalCustomers]; //
            
            Arrays.sort(customerLastName);
             
            for(int i = 0; i < customerLastName.length; i++) {
                 
            System.out.print("\n\nCustomer "+customerLastName[i]+" made their purchase with Id #"+customerId[i]+".");
            
             }
            
              
//
            
// End of calling methods //
            
//

    }
     
//  
    
// End of main class //

//
     
//
     
// Starting customer one checkOut method //
     
//
     
     public static void checkOut(int totalCustomers, String[] customerLastName) {
         
       for(int i = 0; i < totalCustomers; i++ ) {
         
       int totalItemsPurchased;
       
       totalItemsPurchased= Integer.parseInt(JOptionPane.showInputDialog("How many items would you like to purchase with customer "+customerLastName[i]+"? (Minimum of 3)")); //Input window
       
       int setValueThree = 1;
       
        while (setValueThree < 100 * totalCustomers) {
            
             if(totalItemsPurchased >= 3) {
           
                System.out.println("\nPlease enter the price for all "+totalItemsPurchased+" items that are being purchased."); //Confirms user input
                
                setValueThree = totalCustomers * 101; //Breaks loop
           
       } else {
           
            System.out.println("\nYou entered a value that is invalid and/or less than the required amouunt of 3, Please enter an acceptable value."); //Error Prompt
           
            totalItemsPurchased = Integer.parseInt(JOptionPane.showInputDialog("How many items would you like to purchase? (Minimum of 3")); //Input window
            
            setValueThree = totalCustomers + 0; //Continue the loop
         
       }          
    }   
        Double [] customerBeforeTax = new Double[totalItemsPurchased];
        
            for(int a = 0; a < totalItemsPurchased; a++ ) {
                
                customerBeforeTax[a] = Double.parseDouble(JOptionPane.showInputDialog("\nPlease enter the price for all "+totalItemsPurchased+" items that are being purchased (Ex. 10.99, 23.21...)"));
                        
            }
            
            System.out.println("\nThe total of all "+totalItemsPurchased+" items after tax for customer "+customerLastName[i]+" is "+new DecimalFormat("0.00").format(sumOfElements(customerBeforeTax))+".");
  
    }
}
 
//
     
// Ending customer one checkOut method //
     
//

//
     
// Starting sumOfElements method //

//
    
        public static double sumOfElements(Double customerBeforeTax[]) {
            
        Double sumOfTotalAfterTax = 0.00;
        
        Double taxRate = 1.09125;
  
        for (Double i : customerBeforeTax) {
  
        sumOfTotalAfterTax = sumOfTotalAfterTax + i;
        
        }
        
        return sumOfTotalAfterTax * taxRate; 
        
        }
    }
       
//
     
// Ending sumOfElements method //

//      

// End Of Program //

//