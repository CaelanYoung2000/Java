import java.util.Arrays; 

import javax.swing.JOptionPane;

public class Week10Assignment1 {
    
   public static void main(String[] args) {
       
       String[] stringArray = {"\nWordOne", "\nWordTwo", "\nWordThree"};
       
       System.out.println( stringArray[0] );
       System.out.println( stringArray[1] );
       System.out.println( stringArray[2] );
       
       String userNumOne; // String for userNumber input
        
       userNumOne = JOptionPane.showInputDialog("Please insert three numbers"); //Ask user for input that will be assigned to String userNumOne
       
       int convertedUserNumOne = Integer.parseInt(userNumOne); //Parses string into integer
       
       String userNumTwo; // String for userNumber input
        
       userNumTwo = JOptionPane.showInputDialog("Please insert three numbers"); //Ask user for input that will be assigned to String userNumOne
       
       int convertedUserNumTwo = Integer.parseInt(userNumTwo); //Parses string into integer
   
       String userNumThree; // String for userNumber input
        
       userNumThree = JOptionPane.showInputDialog("Please insert three numbers"); //Ask user for input that will be assigned to String userNumThree
       
       int convertedUserNumThree = Integer.parseInt(userNumThree); //Parses string into integer
       
       int[] intArray = {convertedUserNumOne, convertedUserNumTwo, convertedUserNumThree};
       
       System.out.println("\n"+intArray[0] );
       System.out.println("\n"+intArray[1] );
       System.out.println("\n"+intArray[2] );
       
       String userNumRand; // String for userNumRand input
        
       userNumRand = JOptionPane.showInputDialog("Please chose a number between 1 and 3"); //Ask user for input that will be assigned to String userNumRand
       
       int convertedUserNumRand = Integer.parseInt(userNumRand); //Parses string into integer
       
       if (convertedUserNumRand == 3){
           
            System.out.println("\nYou chose "+convertedUserNumRand+" the corresponding data location in the integer array is "+intArray[2] );
           
       }  else {
           
           if(convertedUserNumRand == 2) {
               
                System.out.println("\nYou chose "+convertedUserNumRand+" the corresponding data location in the integer array is "+intArray[1] );
               
       } else {
               
           if(convertedUserNumRand == 1) {
               
                System.out.println("\nYou chose "+convertedUserNumRand+" the corresponding data location in the integer array is "+intArray[0] );

       }
           
       }
       
       }
       
       String userWordOne;
       
       userWordOne = JOptionPane.showInputDialog("Please insert three words"); //Ask user for input that will be assigned to String userWordOne

       String userWordTwo;
       
       userWordTwo = JOptionPane.showInputDialog("Please insert three words"); //Ask user for input that will be assigned to String userWordTwo

       String userWordThree;
       
       userWordThree = JOptionPane.showInputDialog("Please insert three words"); //Ask user for input that will be assigned to String userWordThree
       
       String[] stringArrayTwo = {userWordOne, userWordTwo, userWordThree};
       
       System.out.println("\nThe words that you gave are "+stringArrayTwo[0]+", "+stringArrayTwo[1]+", and "+stringArrayTwo[2]);
       
       String userWordRand; // String for userWordRand input
        
       userWordRand = JOptionPane.showInputDialog("Please chose a number between 1 and 3"); //Ask user for input that will be assigned to String userWordRand
       
       int convertedUserWordRand = Integer.parseInt(userWordRand); //Parses string into integer
       
       if (convertedUserWordRand == 3){
           
            System.out.println("\nYou chose "+convertedUserNumRand+" the corresponding data location in the integer array is "+stringArrayTwo[2] );
           
       }  else {
           
           if(convertedUserWordRand == 2) {
               
                System.out.println("\nYou chose "+convertedUserNumRand+" the corresponding data location in the integer array is "+stringArrayTwo[1] );
               
       } else {
               
           if(convertedUserWordRand == 1) {
              
                System.out.println("\nYou chose "+convertedUserNumRand+" the corresponding data location in the String array is "+stringArrayTwo[0] );

       }
           
       }
       
       }

       System.out.println("\nI will change one of the three numbers"); 
       
       String userNumMultiply; // String for userNumRand input
        
       userNumMultiply = JOptionPane.showInputDialog("Please chose a number between 1 and 3"); //Ask user for input that will be assigned to String userNumRand
       
       int convertedUserNumMultiply = Integer.parseInt(userNumMultiply); //Parses string into integer
       
       if (convertedUserNumMultiply == 3){
           
           intArray[2] = intArray[2] * 50;
           
            System.out.println("\nYou chose "+convertedUserNumMultiply+" the corresponding data location in the integer array is "+intArray[2]);
           
       }  else {
           
           if(convertedUserNumMultiply == 2) {
               
               intArray[1] = intArray[1] * 50;
               
                System.out.println("\nYou chose "+convertedUserNumMultiply+" the corresponding data location in the integer array is "+intArray[1] );
               
       } else {
               
           if(convertedUserNumMultiply == 1) {
               
               intArray[0] = intArray[0] * 50;
               
                System.out.println("\nYou chose "+convertedUserNumMultiply+" the corresponding data location in the String array is "+intArray[0] );

       }
           
       }
       
       }

       
       
       
       }

       
   }
    

