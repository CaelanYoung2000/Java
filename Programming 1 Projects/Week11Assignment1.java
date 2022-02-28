import javax.swing.JOptionPane;

public class Week11Assignment1 {
    
   public static void conversionFToC() {
       
      String userTemp; //Assignment user input
       
      userTemp = JOptionPane.showInputDialog("Please enter a temperature in Fahrenheit"); //Input window 
      
      double convertedTemperatureF = Double.parseDouble(userTemp); //Parses string into integer
      
      double finalTemp = (convertedTemperatureF - 32) * .5556;
      
      System.out.println("\nThe temperature you gave was "+convertedTemperatureF+"F, this converted to C is "+finalTemp+"C");
      
   }
   
   public static void passedValue(String wordToBePassed) {
       
      System.out.println("\nHey, hey, Captain "+wordToBePassed+" take me down to the railroad tracks.");
       
   }
  
   public static int multiplyValue(int convertedNumOneToBePassed,int convertedNumTwoToBePassed) {
       
     int x = convertedNumOneToBePassed * convertedNumTwoToBePassed;
     
     System.out.println("\nReturning "+x+" back to main method...." );
     
     return x;
     
   }
    
   public static void main(String[] args) {  
       
       System.out.println("\nStarting the main method");
       
       String userName; //Assignment user input
       
       userName = JOptionPane.showInputDialog("Please enter a username"); //Input window
       
       String firstFourOfUser; //Assigns first four letters
       
       firstFourOfUser = userName.substring(0,4); //Gets first four letters
       
       String sixDigits; //Assigns user six digit input
       
       sixDigits = JOptionPane.showInputDialog("Please give me any six digit number"); //Input window
       
       int convertedSixDigits = Integer.parseInt(sixDigits.substring(2,6)); //Parses string into integer
       
       System.out.println("\nYour last name is "+userName+" and the number you gave me is "+sixDigits);
       
       System.out.println("\nYour username is "+firstFourOfUser+convertedSixDigits+"ay");
       
       System.out.println("\nCalling a void method....");
       
       conversionFToC();
       
       System.out.println("\nPassing a parameter to a method....");
       
       String wordToBePassed;
       
       wordToBePassed = JOptionPane.showInputDialog("Please enter any random word");
        
       passedValue(wordToBePassed);
       
       System.out.println("\nPassing a parameter to a method, and getting one back....");
       
       String numOneToBePassed;
       
       numOneToBePassed = JOptionPane.showInputDialog("Please enter any random number");
       
       int convertedNumOneToBePassed = Integer.parseInt(numOneToBePassed);
        
       String numTwoToBePassed;
       
       numTwoToBePassed = JOptionPane.showInputDialog("Please enter any random number");
       
       int convertedNumTwoToBePassed = Integer.parseInt(numTwoToBePassed);
      
       System.out.println("\nIf "+convertedNumOneToBePassed+" is length, and "+convertedNumTwoToBePassed+" is width, then the area is "+multiplyValue(convertedNumOneToBePassed,convertedNumTwoToBePassed));
           
   }

}