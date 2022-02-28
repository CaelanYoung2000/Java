import javax.swing.JOptionPane; // Imported for use of JOptionPane

import java.util.Random; // Imported for use of random number

public class Week8Assignment1 {
    
    public static void compareMethod() {
        
        String userNumber1; // User guess number 
    
        userNumber1 = JOptionPane.showInputDialog("Guess a number"); // Input window
        
        int convertedUserNumber1 = Integer.parseInt(userNumber1); // String to integer parse
        
        String userNumber2; // User guess number 
    
        userNumber2 = JOptionPane.showInputDialog("Guess a number"); // Input window
        
        int convertedUserNumber2 = Integer.parseInt(userNumber2); // String to integer parse
        
         System.out.println("\nYou guessed "+convertedUserNumber1+" and "+convertedUserNumber2+", the lower number is "+Math.min(convertedUserNumber1, convertedUserNumber2));
        
    }
    
    public static void main(String[] args) {
        
        String userNumber; // User guess number 
    
        userNumber = JOptionPane.showInputDialog("Guess a number between 1 - 3"); // Input window
        
        int convertedUserNumber = Integer.parseInt(userNumber); // String to integer parse
        
        Random randomNumber = new Random(); // Assigns random number value
        
        int randomValue = randomNumber.nextInt(3)+1; // Adds one to the highest possible value of (3) which is actually 2, prevents a 0 value for guess
        
            if (randomValue == convertedUserNumber) {
            
                    System.out.println("Wow! Dagnabbit, you guess correctly since we both chose "+randomValue);
            
            } else {
            
                    System.out.println("Good try! You guess wrong since I chose "+convertedUserNumber+" and you chose "+randomValue);
                              
            }   
            
        String dayOfWeek; // User day of week
   
        dayOfWeek = JOptionPane.showInputDialog("Please enter a number to represent the day of the week (e.g., 1 for Sunday, through 7 for Saturday)"); // Input window
       
        int convertedDayOfWeek = Integer.parseInt(dayOfWeek); // String to integer parse
        
        var set = 1;
       
        while(set < 100) {
           
            switch(convertedDayOfWeek) {
           
            case 1:
               
                System.out.println("\nToday is Sunday");
               
                set = set + 100;

                break;
               
            case 2:
               
                System.out.println("\nToday is Monday");
               
                set = set + 100;

                break;
               
            case 3:
               
                System.out.println("\nToday is Tuesday");
               
                set = set + 100;

                break;
               
            case 4:
               
                System.out.println("\nToday is Wednesday");
               
                set = set + 100;

                break;
               
            case 5:
               
                System.out.println("\nToday is Thursday");
               
                set = set + 100;

                break;
               
            case 6:
               
                System.out.println("\nToday is Friday");
               
                set = set + 100;

                break;
               
            case 7:
               
                System.out.println("\nToday is Saturday");
               
                set = set + 100;

                break;
               
            default:
                
                if (set < 69) {
                    
                    dayOfWeek = JOptionPane.showInputDialog("Please enter a number to represent the day of the week (e.g., 1 for Sunday, through 7 for Saturday)"); // Input window
       
                    convertedDayOfWeek = Integer.parseInt(dayOfWeek); // String to integer parse
            
                    set = set + 34;
                
            } else { 
                    
                    System.out.println("\nYou have used all three of your attempts");
                    
                    set = set + 100;
                    
                }
                
            }
        
        }
        
        String userFeeling; // User guess number 
    
        userFeeling = JOptionPane.showInputDialog("Are you feeling Great, Fine, or Meh?"); // Input window
        
        if (userFeeling.equals("Great")) {
            
            Week8Assignment1.compareMethod();
            
        } else { 
            
            System.out.println("\nYou are feeling "+userFeeling);
            
        }
        
        
            
                
               
           
              
                        
                    
     
           
 

  }
    
}
        



    


    
    

   
    
        
    
   
    
    
    
    
    
    
    
 

