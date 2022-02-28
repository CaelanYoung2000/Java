import java.util.Arrays;

import java.util.Scanner;

public class Week13Assignment2 {
    
     public static void main(String[] args) {
         
      Scanner s = new Scanner(System.in);
      
      System.out.println("How many words would you like to enter?:");
      
      int length = s.nextInt();
      
      int [] myArray = new int[length];
      
      System.out.println("Please enter the words you would like to store to an array: ");

      for(int i=0; i<length; i++ ) {
          
         myArray[i] = s.nextInt();
         
         System.out.println(Arrays.toString(myArray));
         
      }

      
   }
}
  
