
import java.util.Scanner;

public class Week12Assignment1 {
    
    public static void main(String[] args) {

    System.out.print("Enter the price of the items for the first set (0 to quit): ");
    
    Scanner in = new Scanner(System.in);
    
    int input = 0;
    
    int sum = 0;
    
    var i = 0;
    
    while(i < 100) {

    if ((input = in.nextInt()) == 0) {
            
           sum = input + sum;
           
           System.out.println("\nYour total of the fist set before tax is $"+sum);
           
           i = i + 100;
         
        } else  {
            
            if (input != 0) {
                
                sum = input + sum;
                
                System.out.println("\nYour current total of the first set is $"+sum); 
                
            i = i + 1;
            
            }
        }
    }
    
    
    
    System.out.print("\nEnter the price of the items for the second set (0 to quit): ");
    
    Scanner in2 = new Scanner(System.in);
    
    int input2 = 0;
    
    int sum2 = 0;
    
    var i2 = 0;
    
    while(i2 < 100) {

    if ((input2 = in2.nextInt()) == 0) {
            
           sum2 = input + sum2;
           
           System.out.println("\nYour total of the second set before tax is $"+sum2);
           
           i2 = i2 + 100;
           
        } else  {
            
            if (input2 != 0) {
                
                sum2 = input2 + sum2;
                
                System.out.println("\nYour current of the second set total is $"+sum2); 
                
            i2 = i2 + 1;
            
            }
        }
    }
    
    double[] combinedUser = {sum, sum2};
    
    taxMethod(combinedUser);
    
    taxMethod2(combinedUser);
    
    double totalOfStoredArray = combinedUser[0] + combinedUser[1];
    
    taxMethod3(totalOfStoredArray);
    
    taxMethod4(totalOfStoredArray);
    
    taxMethod5(totalOfStoredArray);
    
   }
    
   public static int taxMethod(double[] combinedUser) {
    
   double totalAfterTax = 1.091 * combinedUser[0];
   
   System.out.println("\nThe total of the first set of items after tax is $"+totalAfterTax);
   
   return 0;
   
   }
   
   public static int taxMethod2(double[] combinedUser) {
    
   double totalAfterTax = 1.091 * combinedUser[1];
   
   System.out.println("\nThe total of the second set of items after tax is $"+totalAfterTax);
   
   return 0;
   
   }
   
   public static int taxMethod3(double totalOfStoredArray) {
    
   double totalAfterTax = totalOfStoredArray;
   
   System.out.println("\nTotal Sales: $"+totalAfterTax);
   
   return 0;
   
   }
   
   public static int taxMethod4(double totalOfStoredArray) {
    
   double totalAfterTax = 1.091 * totalOfStoredArray;
   
   double totalTax = totalAfterTax - totalOfStoredArray;
   
   System.out.println("\nTotal Sales Tax: $"+totalTax);
   
   return 0;
  
   }
     
   public static int taxMethod5(double totalOfStoredArray) {
    
   double totalAfterTax = 1.091 * totalOfStoredArray;
   
   System.out.println("\nTotal: $"+totalAfterTax);
   
   return 0;
   
   }
}


           
      
        

