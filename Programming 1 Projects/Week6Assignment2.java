import javax.swing.JOptionPane; // Imported for use of JOptionPane

public class Week6Assignment2 {
    
    public static void main(String[] args) {
    
    int matchNumber = 3; //Assigns number for guess game
    
    String guessNumber1; //User guess number 1
    
    String guessNumber2; //User guess number 2
    
    guessNumber1 = JOptionPane.showInputDialog("Guess my number between 1 - 10"); //Input window
    
    guessNumber2 = JOptionPane.showInputDialog("Guess my number between 1 - 10 again"); //Input window
    
    int convertedGuessNumber1 = Integer.parseInt(guessNumber1); //String to integer parse
    
    int convertedGuessNumber2 = Integer.parseInt(guessNumber2); //String to integer parse
    
    if (convertedGuessNumber1 == matchNumber) { 
        
        System.out.println("You guessed "+convertedGuessNumber1+" and "+convertedGuessNumber2+", my number was "+matchNumber+" so we have a match");
        
    } else if (convertedGuessNumber2 == matchNumber) {
        
        System.out.println("You guessed "+convertedGuessNumber1+" and "+convertedGuessNumber2+", my number was "+matchNumber+" so we have a match");
        
    } else {
        
        System.out.println("You guessed "+convertedGuessNumber1+" and "+convertedGuessNumber2+", my number was "+matchNumber+" so we do not have a match");
    }
    
    String firstNumberInAge; //Assignment user input
  
    firstNumberInAge = JOptionPane.showInputDialog("What is the first number of your age?"); //Input window
    
    System.out.println("\nThe first digit of your age is "+firstNumberInAge);
    
    String firstNumberOfAge = firstNumberInAge.substring(0,1); //Gets first number of age if user types more than one digit
    
    int convertedFirstNumberInAge = Integer.parseInt(firstNumberOfAge); //String to integer parse
   
    String yearTheyWereBorn; //Assignment user input
  
    yearTheyWereBorn = JOptionPane.showInputDialog("What year were you born?"); //Input window
    
    int convertedYearTheyWereBorn = Integer.parseInt(yearTheyWereBorn); //String to integer parse
    
    System.out.println("\nYou were born in "+convertedYearTheyWereBorn);
    
    int firstNumberMultiplied = (convertedFirstNumberInAge * 2); //Fuction for first digit times 2
    
    System.out.println("\nThe first number of your age is "+firstNumberOfAge+", this number multiplied by 2 is "+firstNumberMultiplied);
    
    int addToFirstNumber = (firstNumberMultiplied + 5); //Function for first digit add 5
    
    System.out.println("\n"+firstNumberMultiplied+" plus 5 is "+addToFirstNumber);
    
    int multipliedByFifty = (addToFirstNumber * 50); //Function for sum times 50
    
    System.out.println("\n"+addToFirstNumber+" multiplied by 50 is "+multipliedByFifty);
   
    String celebrationCheck; //Assignment user input
    
    celebrationCheck = JOptionPane.showInputDialog("If you have celebrated your birthday already enter 1, if not please enter 2"); //Input window
    
    int oneAdd = multipliedByFifty + 1769; //Add 1769 if inputs 1
    
    int twoAdd = multipliedByFifty + 1768; //Add 1768 if inputs 2
    
    int subtractBirthOne = oneAdd - convertedYearTheyWereBorn; //Subtraction if inputs 1
    
    int subtractBirthTwo= twoAdd - convertedYearTheyWereBorn; //Subtraction if inputs 2
       
    for(var one = 1; one < 100; one++) { //Can be relooped 100 times without issues
        
        if (celebrationCheck.equals("1")) { //Had to use strings beacause has issue using || with int
            
            int convertedCelebrationCheck = Integer.parseInt(celebrationCheck); //Parse if passes expression
            
                System.out.println("\nHappy late birthday, "+multipliedByFifty+" plus 1769 is "+oneAdd);
                
                    System.out.println("\n"+oneAdd+" minus "+convertedYearTheyWereBorn+" is "+subtractBirthOne);
       
                        one = one + 100; //Makes loop fail
                    
    } else {
            
            if (celebrationCheck.equals("2")) { //Had to use strings beacause has issue using || with int
                
                int convertedCelebrationCheck = Integer.parseInt(celebrationCheck); //Parse if passes expression
                
                    System.out.println("\nHappy early birthday, "+multipliedByFifty+" plus 1768 is "+twoAdd);
                    
                        System.out.println("\n"+twoAdd+" minus "+convertedYearTheyWereBorn+" is "+subtractBirthTwo);

                            one = one + 100; //Makes loop fail
                
   } else { 
                
            System.out.println("\nYou entered a value other than 1 or 2"); //Pritns reason for failure
            
                celebrationCheck = JOptionPane.showInputDialog("If you have celebrated your birthday already enter 1, if not please enter 2"); //Re prompts user input window
                
        }
    }
}
    
    System.out.println("\nThe first digit is your first number of your original input. The next digit(s) are your age.");

       var a = "*"; //Assigns * to a for loop purpose
       
       for(var s = 1; s < 5; s++) {
           
           System.out.println("\n"+a);
           
           a = a + "*"; //Adds * each time until greater than 5
       }
       
       for(var s = 1; s < 5; s++) {
           
           System.out.println("\n"+a);
           
           a = a.substring(0, a.length() - 1); //Removes * each time
       }
       
       System.out.println("\n"+a);
       
       String lastName; //Assignment user input
       
       lastName = JOptionPane.showInputDialog("What is your last name?"); //Input window
       
       String firstThreeOfLast; //Assigns first three letters
       
       firstThreeOfLast = lastName.substring(0,3); //Gets first three letters
       
       String fiveDigits; //Assigns user five digit input
       
       fiveDigits = JOptionPane.showInputDialog("Please give me any five digit number"); //Input window
       
       int convertedFiveDigits = Integer.parseInt(fiveDigits); //Parses string into integer
       
       System.out.println("\nYour last name is "+lastName+" and the number you gave me is "+convertedFiveDigits);
       
       System.out.println("\nYour username is "+firstThreeOfLast+convertedFiveDigits);
       
    }
    
}

    
    

   
    
        
    
   
    
    
    
    
    
    
    
 

