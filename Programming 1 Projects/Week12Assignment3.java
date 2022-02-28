import javax.swing.JOptionPane; // Imported for use of JOptionPane

import java.util.Arrays; 

import java.util.Collections;

public class Week12Assignment3 {
    
    public static void main(String[] args) {
         
    String userValue; //Assignment user input
       
    userValue = JOptionPane.showInputDialog("Enter any value?"); //Input window
    
    int convertedUserValue = Integer.parseInt(userValue);
    
    System.out.println("\nYou entered "+userValue);
         
    method1(convertedUserValue);
    
    String userWord1; //Assignment user input
       
    userWord1 = JOptionPane.showInputDialog("Enter any word?"); //Input window
    
    String userWord2; //Assignment user input
       
    userWord2 = JOptionPane.showInputDialog("Enter any word?"); //Input window
    
    String userWord3; //Assignment user input
       
    userWord3 = JOptionPane.showInputDialog("Enter any word?"); //Input window
    
    String userWord4; //Assignment user input
       
    userWord4 = JOptionPane.showInputDialog("Enter any word?"); //Input window
    
    String userWord5; //Assignment user input
       
    userWord5 = JOptionPane.showInputDialog("Enter any word?"); //Input window
    
    String[] UserWordArray = new String[9];
    
    UserWordArray[0] = userWord1;
        
    UserWordArray[1] = userWord2;
        
    UserWordArray[2] = userWord3;
    
    UserWordArray[3] = userWord4;
        
    UserWordArray[4] = userWord5;
    
    method2(UserWordArray);
    
    System.out.println("\n\nThe words you gave were "+UserWordArray[0]+", "+UserWordArray[1]+", "+UserWordArray[2]+", "+UserWordArray[3]+", "+UserWordArray[4]+", "+UserWordArray[5]+", "+UserWordArray[6]+", and "+UserWordArray[7]);
    
    String userNum1; //Assignment user input
       
    userNum1 = JOptionPane.showInputDialog("Enter any value for the number array?"); //Input window
    
    int convertedUserNum1 = Integer.parseInt(userNum1);
    
    String userNum2; //Assignment user input
       
    userNum2 = JOptionPane.showInputDialog("Enter any value for the number array?"); //Input window
    
    int convertedUserNum2 = Integer.parseInt(userNum2);
    
    String userNum3; //Assignment user input
       
    userNum3 = JOptionPane.showInputDialog("Enter any value for the number array?"); //Input window
    
    int convertedUserNum3 = Integer.parseInt(userNum3);
    
    String userNum4; //Assignment user input
       
    userNum4 = JOptionPane.showInputDialog("Enter any value for the number array?"); //Input window
    
    int convertedUserNum4 = Integer.parseInt(userNum4);
    
    String userNum5; //Assignment user input
       
    userNum5 = JOptionPane.showInputDialog("Enter any value for the number array?"); //Input window
    
    int convertedUserNum5 = Integer.parseInt(userNum5);
    
    int[] userNumArray = {convertedUserNum1,convertedUserNum2,convertedUserNum3,convertedUserNum4,convertedUserNum5};
    
    // Arrays.sort(userNumArray, Collections.reverseOrder()); This was throwing a weird error that I can not figure out //
    
    System.out.println("\nThe numbers that you gave were "+userNumArray[0]+", "+userNumArray[1]+", "+userNumArray[2]+", "+userNumArray[3]+", and "+userNumArray[4]);
    
    String userNum2_1; //Assignment user input
       
    userNum2_1 = JOptionPane.showInputDialog("Enter any value for the second number array?"); //Input window
    
    String userNum2_2; //Assignment user input
       
    userNum2_2 = JOptionPane.showInputDialog("Enter any value for the second number array?"); //Input window
        
    String userNum2_3; //Assignment user input
       
    userNum2_3 = JOptionPane.showInputDialog("Enter any value for the second number array?"); //Input window
    
    String[] userNumArray2 = new String[6];
    
    userNumArray2[0] = userNum2_1;
    
    userNumArray2[1] = userNum2_2;
    
    userNumArray2[2] = userNum2_3;
    
    method3(userNumArray2);

    System.out.println("\nThe numbers you gave were "+userNumArray2[0]+", "+userNumArray2[1]+", "+userNumArray2[2]+", "+userNumArray2[3]+", "+userNumArray2[4]+", and "+userNumArray2[5]);
    
    }
    
    public static void method1(int convertedUserValue) {
        
        int multipliedBy5 = convertedUserValue * 5;

        System.out.print("\n"+convertedUserValue+" times 5 is "+multipliedBy5);
       
    }    
    
     public static String[] method2(String[] UserWordArray) {
         
        String userWord6; //Assignment user input
       
        userWord6 = JOptionPane.showInputDialog("Enter any word?"); //Input window
        
        String userWord7; //Assignment user input
       
        userWord7 = JOptionPane.showInputDialog("Enter any word?"); //Input window
        
        String userWord8; //Assignment user input
       
        userWord8 = JOptionPane.showInputDialog("Enter any word?"); //Input window
        
        UserWordArray[5] = userWord6;
        
        UserWordArray[6] = userWord7;
        
        UserWordArray[7] = userWord8;
         
        return UserWordArray;
                
     }
     
     public static String[] method3(String[] userNumArray2) {
         
        String userNum2_4; //Assignment user input
       
        userNum2_4 = JOptionPane.showInputDialog("Enter any value for the second number array?"); //Input window
   
        String userNum2_5; //Assignment user input
       
        userNum2_5 = JOptionPane.showInputDialog("Enter any value for the second number array?"); //Input window
  
        String userNum2_6; //Assignment user input
       
        userNum2_6 = JOptionPane.showInputDialog("Enter any value for the second number array?"); //Input window
    
        userNumArray2[3] = userNum2_4;
        
        userNumArray2[4] = userNum2_5;
        
        userNumArray2[5] = userNum2_6;
         
        return userNumArray2;
                
  }
     
}
