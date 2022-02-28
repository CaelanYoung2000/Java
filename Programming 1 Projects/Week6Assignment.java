import javax.swing.JOptionPane; // Imported for use of JOptionPane

public class Week6Assignment {
   
    public static void main(String[] args) {
        
    String firstNumber; // String for firstNumber input 
        
    String secondNumber; // String for secondNumber input     
        
    String thirdNumber; // String for thirdNumber input  
    
    double swapNumber; // Double for swapNumber input 
    
    firstNumber = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String firstNumber
    
    secondNumber = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String secondNumber
    
    thirdNumber = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String thirdNumber
    
    double convertedFirstNumber = Double.parseDouble(firstNumber); // Converts String firstNumber to double
    
    double convertedSecondNumber = Double.parseDouble(secondNumber); // Converts String secondNumber to double
    
    double convertedThirdNumber = Double.parseDouble(thirdNumber); // Converts String thirdNumber to double
    
    System.out.println("\nThe numbers that you entered were "+convertedFirstNumber+", "+convertedSecondNumber+", and "+convertedThirdNumber); // Original print order
   
    swapNumber = convertedSecondNumber; // Reassign value
    
    convertedSecondNumber = convertedThirdNumber; // Reassign value
    
    System.out.println("\nThe numbers that you entered have been switched, the new order is "+convertedFirstNumber+", "+convertedSecondNumber+", and "+swapNumber); // Modified print order
    
    String firstWord; // String for firstWord input 
        
    String secondWord; // String for secondWord input     
        
    String thirdWord; // String for thirdWord input  
    
    String swapWordFirst; // String for swapWordFirst
    
    String swapWordSecond; // String for swapWordFirst
    
    String swapWordThird; // String for swapWordFirst
    
    firstWord = JOptionPane.showInputDialog("Insert any random word please"); // Asks user for input that will be assigned to String firstWord
    
    secondWord = JOptionPane.showInputDialog("Insert any random word please"); // Asks user for input that will be assigned to String secondWord
    
    thirdWord = JOptionPane.showInputDialog("Insert any random word please"); // Asks user for input that will be assigned to String thirdWord
    
    swapWordFirst = firstWord; //Reassign value
    
    swapWordSecond = secondWord; //Reassign value
    
    swapWordThird = thirdWord; //Reassign value
    
    System.out.println("\nThe three words that you gave are "+firstWord+", "+secondWord+", and "+thirdWord); // Original print order
    
    System.out.println("\nJack and "+swapWordSecond+" went up a "+swapWordThird+", to fetch a pail of "+swapWordFirst); // Modified print order
    
    double guessNumber = 3; // Assign value for guessing game
    
    String userGuessNumber; //String for user guess, later to be changed to double
    
    userGuessNumber = JOptionPane.showInputDialog("Guess my number between 1 and 10"); // Asks user for input that will be assigned to String thirdNumber
    
    double convertedUserGuessNumber; //Assignmnet creation for double conversion 
    
    convertedUserGuessNumber = Double.parseDouble(userGuessNumber); // Converts String userGuessNumber to double
    
    System.out.println("\nThe number you guessed was "+convertedUserGuessNumber); // Confirms user input
    
    if (guessNumber == convertedUserGuessNumber) { // Checks if numbers are equal     
        System.out.println("\nYou guessed "+convertedUserGuessNumber+" and I also chose "+guessNumber+", your number matched mine!");
    }
    
    else {
        
        if (guessNumber > convertedUserGuessNumber) { // Checks if my number is higher
            
            System.out.println("\nYou guessed "+convertedUserGuessNumber+" and I chose "+guessNumber+", my number is larger");
        }
        
        else {
            
            if(guessNumber < convertedUserGuessNumber) { // Checks if my number is less
            
            System.out.println("\nYou guessed "+convertedUserGuessNumber+" and I chose "+guessNumber+", your number is larger");
            
        }
            
      }
        
    }
    
    String myFirstName = "Caelan"; // Assigns name for check
    
    String userGuessFirstName; // User input String value
    
    userGuessFirstName = JOptionPane.showInputDialog("What's my first name?"); // Asks user for input that will be assigned to String userGuessFirstName
    
    System.out.println("\nYou inserted "+userGuessFirstName); // Confirms user input
    
    if (userGuessFirstName.equals(myFirstName)) { // Checks if Strings match
        
        System.out.println("\nThat's right, don't wear it out.");
    }
    
    else {
        
        System.out.println("\nAnd I thought we were friends...." );
    }
    
  }
    
}
       
       
