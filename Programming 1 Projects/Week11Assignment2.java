import javax.swing.JOptionPane; // Imported for use of JOptionPane

import java.util.Random; // Imported for use of random number

public class Week11Assignment2 {
    
     public static void main(String[] args) { 
         
       String[] rockPaperScissors = {"Rock","Paper","Scissors"};
       
       String userPick; //Assignment user input
       
       userPick = JOptionPane.showInputDialog("Rock (1), Paper (2), or Scissors (3)?"); //Input window
       
       Random randomNumber = new Random(); // Assigns random number value
        
       int randomValue = randomNumber.nextInt(3)+1; // Adds one to the highest possible value of (3) which is actually 2, prevents a 0 value for guess
       
       if (userPick.equals("1") && randomValue == 1) { 
           
           System.out.println("\nYou have both chosen "+rockPaperScissors[0]+", this game is a Tie!");
           
       } else if (userPick.equals("1") && randomValue == 2) {
           
           System.out.println("\nYou have chosen "+rockPaperScissors[0]+" and the computer has chosen "+rockPaperScissors[1]+", Paper beats rock, Computer wins!");
          
       } else if (userPick.equals("1") && randomValue == 3) {
           
           System.out.println("\nYou have chosen "+rockPaperScissors[0]+" and the computer has chosen "+rockPaperScissors[2]+", Rock beats Scissors, User wins!");
          
       } else if (userPick.equals("2") && randomValue == 1) { 
           
           System.out.println("\nYou have chosen "+rockPaperScissors[1]+" and the computer has chosen "+rockPaperScissors[0]+", Paper beats Rock, User wins!");
           
       } else if (userPick.equals("2") && randomValue == 2) {
           
           System.out.println("\nYou have both chosen "+rockPaperScissors[1]+", this game is a Tie!");
          
       } else if (userPick.equals("2") && randomValue == 3) {
           
           System.out.println("\nYou have chosen "+rockPaperScissors[1]+" and the computer has chosen "+rockPaperScissors[2]+", Scissors beats Paper, Computer wins!");
          
       } else if (userPick.equals("3") && randomValue == 1) { 
           
           System.out.println("\nYou have chosen "+rockPaperScissors[2]+" and the computer has chosen "+rockPaperScissors[0]+", Rock beats Scissors, Computer wins!");
           
       } else if (userPick.equals("3") && randomValue == 2) {
           
           System.out.println("\nYou have chosen "+rockPaperScissors[2]+" and the computer has chosen "+rockPaperScissors[1]+", Scissors beats Paper, User wins!");
          
       } else if (userPick.equals("3") && randomValue == 3) {
           
           System.out.println("\nYou have both chosen "+rockPaperScissors[2]+", this game is a Tie!");
          
       }
         
       method1();
       
     }
     
     public static void method1() {
         
         String lastName;
         
         String sixDigit;
         
         String name1;
         
         String name2;
         
         String name3;
         
         String num1;
         
         String num2;
         
         String num3;
        
         lastName = JOptionPane.showInputDialog("Please enter your last name"); //Input window
         
         sixDigit = JOptionPane.showInputDialog("Please enter any six digit number"); //Input window
         
         name1 = JOptionPane.showInputDialog("Please enter a name"); //Input window
         
         name2 = JOptionPane.showInputDialog("Please enter a name"); //Input window
         
         num1 = JOptionPane.showInputDialog("Please enter a six digit number"); //Input window
         
         num2 = JOptionPane.showInputDialog("Please enter a six digit number"); //Input window
         
         String convertedSixDigits = sixDigit.substring(sixDigit.length() - 3);
         
         String convertedLastName = lastName.substring(0,3);
         
         String userRealLogin = convertedLastName+convertedSixDigits;
         
         String convertedNum1 = num1.substring(num1.length() - 3);
         
         String convertedNum2 = num2.substring(num2.length() - 3);
         
         String convertedName1 = name1.substring(0,3);
         
         String convertedName2 = name2.substring(0,3);
         
         String convertedName3 = userRealLogin.substring(0,3);
         
         String userOne = convertedName1+convertedNum1;
         
         String userTwo = convertedName2+convertedNum2;
         
         String[] combinedUser = {userRealLogin, userOne,userTwo,};
         
         System.out.println("\nThe three usernames that were created from your inputs are "+combinedUser[0]+", "+combinedUser[1]+", and "+combinedUser[2]);
         
     }
    
}
