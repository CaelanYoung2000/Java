import javax.swing.JOptionPane; // Imported for use of JOptionPane

import java.lang.Math; //Imported for math usage

public class Week5Assignment2 {
    
    public static void main(String[] args) {
        
        String firstNumber; // String for firstNumber input    
            
        firstNumber = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String firstNumber
        
        double convertedFirstNumber = Double.parseDouble(firstNumber); // Converts String firstNumber to double
            
        String secondNumber; // String for secondNumber input      
            
        secondNumber = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String secondNumber
        
        double convertedSecondNumber = Double.parseDouble(secondNumber); // Converts String secondNumber to double
            
        String thirdNumber; // String for thirdNumber input 
            
        thirdNumber = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String thirdNumber
        
        double convertedThirdNumber = Double.parseDouble(thirdNumber); // Converts String thirdNumber to double
        
        System.out.println("\nThank you, you inserted "+firstNumber+", "+secondNumber+", and "+thirdNumber); // Confirms user input numbers
        
        double SumOfTwo = convertedFirstNumber + convertedSecondNumber; // Assigns sum of firstNumber and secondNumber to SumOfTwo
        
        System.out.println("\nThe sum of "+convertedFirstNumber+" and "+convertedSecondNumber+" is "+SumOfTwo); // Prints out the math function for user
        
        double ProductOfTwo = SumOfTwo * convertedThirdNumber; // Assigns product of SumOfTwo and thirdNumber to ProductOfTwo
        
        System.out.println("\nThis sum multiplied by "+thirdNumber+" is "+ProductOfTwo);  // Prints out the math function for user
        
        String prePower; // String for prePower input
        
        prePower = JOptionPane.showInputDialog("Insert any random number please"); // Asks user for input that will be assigned to String prePower
        
        double convertedPrePower = Double.parseDouble(prePower); // Converts string prePower to double
        
        double thirdPower = 3; // Assigns three to thirdPower 
        
        System.out.println("\nYou inserted "+prePower); // Confirms user input
        
        double demonstrationValue = convertedPrePower * convertedPrePower; //Assigns value of first step in the cube process
        
        double demonstrationFinalValue = convertedPrePower * demonstrationValue; //Assigns value of second step in the cube process
        
        System.out.println("\n"+prePower+" to the third power is "+Math.pow(convertedPrePower,thirdPower)+" or "+convertedPrePower+" * "+convertedPrePower+" = "+demonstrationValue+" * "+convertedPrePower+" = "+demonstrationFinalValue); // Prints out the math function for the user
        
        String preTemperature; //String for temperature
                
        preTemperature = JOptionPane.showInputDialog("Insert any random Fahrenheit temperature please"); //Ask user for input that will be assigned to String preTempature
        
        double convertedTemperature = Double.parseDouble(preTemperature);//Convert string into a double value
        
        double finalTemperature = (convertedTemperature-32)*5/9;//Math function for Celsius conversion
        
        System.out.println("\nYou inserted "+convertedTemperature+"F");//Confirms user input
          
        System.out.println("\n"+convertedTemperature+"F is "+finalTemperature+"C");//Print math function
        
        String wordOne; // String for wordOne input
        
        wordOne = JOptionPane.showInputDialog("Insert any random word please"); //Ask user for input that will be assigned to String wordOne
        
        String wordTwo; // String for wordTwo input
        
        wordTwo = JOptionPane.showInputDialog("Insert any random word please"); //Ask user for input that will be assigned to String wordTwo
        
        System.out.println("\nThe two words you entered are "+wordOne+" and "+wordTwo);
        
        System.out.println("\n"+wordOne+" "+wordOne+" "+wordOne+" your "+wordTwo+" gently down the stream.");
        
        String employeeSales; // String for employeeSales input
        
        employeeSales = JOptionPane.showInputDialog("How many sales did Employee 1 made?"); //Ask user for input that will be assigned to String employeeSales
        
        double convertedEmployeeSales = Double.parseDouble(employeeSales);
        
        String employeeBonus; // String for employee input
        
        employeeBonus = JOptionPane.showInputDialog("What bonus percentage has Employee 1 made?"); //Ask user for input that will be assigned to String employeeBonus
        
        double convertedEmployeeBonus = Double.parseDouble(employeeBonus); //Convert string into double value
        
        double totalSalesAmount = convertedEmployeeSales * 15;  //Assigns math function
        
        double totalBonus = totalSalesAmount * convertedEmployeeBonus/100;  //Assigns math function
        
        double grandTotal = totalSalesAmount + totalBonus; //Assigns math function
        
        System.out.println("\nEmployee 1 had "+convertedEmployeeSales+" sales and "+convertedEmployeeBonus+"% bonus"); //Confirms user input
        
        System.out.println("\nEmployee 1 sold "+convertedEmployeeSales+" sales for a total of "+totalSalesAmount+": with a bonus of "+convertedEmployeeBonus+"% for a grand total of "+grandTotal); //Print statement that explains user input
        
        String userWord; // String for userWord input
        
        userWord = JOptionPane.showInputDialog("Insert any random word please"); //Ask user for input that will be assigned to String userWord
      
        String first = userWord.substring(0,1); //Collect the first letter of word
        
        String remove = userWord.substring(1,userWord.length()); //Set the outlines of piglatin aswell as finding length of word
        
        String pigLatin = remove+first+"ay"; //Structure that creates the format of pig latin
        
        System.out.println("\nThe word you gave was "+userWord+" this word in pig latin is "+pigLatin); //Print out the result of pig latin    
    }
}
