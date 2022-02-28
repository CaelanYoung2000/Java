package pkg5.pkg1.young;

import javax.swing.JOptionPane; // Imported for use of JOptionPane

public class Young {
    
    public static void main(String[] args) {
        
         System.out.println("\n" +"Hello, World"); //Prints out "Hello, World"
         
            String firstName; // String for first name value
            
            firstName = JOptionPane.showInputDialog("May I please know your first name?"); // Asks user for input that will be assigned to String firstName
            
            System.out.println("\n"+"Your first name is "+firstName); //Prints conformation of user input
                      
            String userNumber; // Creates inital string for number that is compatible with JOptionPane, will be converted into double
           
            userNumber  = JOptionPane.showInputDialog("Please insert any random number"); // Asks user for input that will be assigned to String userNumber and converted
             
            System.out.println("\n"+"You inserted "+userNumber); //Prints conformation of user input
            
            double convertedNumber = Double.parseDouble(userNumber); // Converts String userNumber to double
            
            double inputProduct; // Creates datatype
            
            inputProduct = convertedNumber * 5; // Finds profcut of now converted string by 5 and assigns it to double
            
            System.out.println("\n"+"The product of "+userNumber+" and 5 is "+inputProduct); // Prints final product
            
            String lastName; // String for last name value
            
            lastName = JOptionPane.showInputDialog("May I please know your last name?");  // Asks user for input that will be assigned to String lastName
            
            System.out.println("\n"+"Your last name is "+lastName); // Prints conformation of use input
            
            System.out.println("\nHello, "+firstName+" "+lastName); // Prints users full name
            
    }
    
}
