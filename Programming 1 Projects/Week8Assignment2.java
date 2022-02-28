import javax.swing.JOptionPane; // Imported for use of JOptionPane

import java.util.Random; // Imported for use of random number

public class Week8Assignment2 {
    
    public static void pigLatin() {
        
        String userName; // String for userWord input
        
        userName = JOptionPane.showInputDialog("Please insert your first name"); //Ask user for input that will be assigned to String userWord
      
        String first = userName.substring(0,1); //Collect the first letter of word
        
        String remove = userName.substring(1,userName.length()); //Set the outlines of piglatin aswell as finding length of word
        
        String pigLatin = remove+first+"ay"; //Structure that creates the format of pig latin
        
        System.out.println("\nThe name you gave was "+userName+" this name in pig latin is "+pigLatin); //Print out the result of pig latin
        
    }
    
    public static void username(){
    
       String lastName; //Assignment user input
       
       lastName = JOptionPane.showInputDialog("What is your last name?"); //Input window
       
       String firstFourOfLast; //Assigns first four letters
       
       firstFourOfLast = lastName.substring(0,4); //Gets first four letters
       
       String sixDigits; //Assigns user six digit input
       
       sixDigits = JOptionPane.showInputDialog("Please give me any six digit number"); //Input window
       
       int convertedSixDigits = Integer.parseInt(sixDigits.substring(0,4)); //Parses string into integer
       
       System.out.println("\nYour last name is "+lastName+" and the number you gave me is "+sixDigits);
       
       System.out.println("\nYour username is "+firstFourOfLast+convertedSixDigits);
         
    }
    
    public static void rockPaperScissors() {
        
       String userPick; //Assignment user input
       
       userPick = JOptionPane.showInputDialog("Rock - 1, Paper - 2, or Scissors - 3?"); //Input window
       
       Random randomNumber = new Random(); // Assigns random number value
        
       int randomValue = randomNumber.nextInt(3)+1; // Adds one to the highest possible value of (3) which is actually 2, prevents a 0 value for guess
       
       if (userPick.equals("1") && randomValue == 1) { 
           
           System.out.println("\nYou have both chosen "+userPick+", this game is a Tie!");
           
       } else if (userPick.equals("1") && randomValue == 2) {
           
           System.out.println("\nYou have chosen "+userPick+" and the computer has chosen "+randomValue+", Paper beats rock, Computer wins!");
          
       } else if (userPick.equals("1") && randomValue == 3) {
           
           System.out.println("\nYou have chosen "+userPick+" and the computer has chosen "+randomValue+", Rock beats Scissors, User wins!");
          
       } else if (userPick.equals("2") && randomValue == 1) { 
           
           System.out.println("\nYou have chosen "+userPick+" and the computer has chosen "+randomValue+", Paper beats Rock, User wins!");
           
       } else if (userPick.equals("2") && randomValue == 2) {
           
           System.out.println("\nYou have both chosen "+userPick+", this game is a Tie!");
          
       } else if (userPick.equals("2") && randomValue == 3) {
           
           System.out.println("\nYou have chosen "+userPick+" and the computer has chosen "+randomValue+", Scissors beats Paper, Computer wins!");
          
       } else if (userPick.equals("3") && randomValue == 1) { 
           
           System.out.println("\nYou have chosen "+userPick+" and the computer has chosen "+randomValue+", Rock beats Scissors, Computer wins!");
           
       } else if (userPick.equals("3") && randomValue == 2) {
           
           System.out.println("\nYou have chosen "+userPick+" and the computer has chosen "+randomValue+", Scissors beats Paper, User wins!");
          
       } else if (userPick.equals("3") && randomValue == 3) {
           
           System.out.println("\nYou have both chosen "+userPick+", this game is a Tie!");
          
       }
        
        
    }
    
    public static void main(String[] args) {
    
        Week8Assignment2.pigLatin();
        
        Week8Assignment2.username();
        
        Week8Assignment2.rockPaperScissors();
        
}
        
}
