import java.util.Scanner;
import java.util.ArrayList;

public class numberList {
    
     public static void main(String[] args) {
         
         ArrayList<Double> numberList = new ArrayList<>(); //Holds inputs
         
         Double endValue;
         
                Scanner scan = new Scanner(System.in);
                
                while (true) {
                    
                        System.out.print("Please enter a number or (-1 to quit the input): "); // User input
                        
                        endValue = scan.nextDouble();
                        
                        if (endValue == -1)
                            
                                break;
                        
                        numberList.add(endValue);
                }
                
                scan.close();

                System.out.println("Largest is: " + maxElement(numberList, 1, numberList.get(0))); //Prints out largest number from list
        }
     
                //  method to find the largest number in the list
        public static double maxElement(ArrayList<Double> numberList, int indexValue, double maxValue) {
            
                if (indexValue >= numberList.size())
                    
                        return maxValue;
                
                else if (maxValue < numberList.get(indexValue))
                    
                        maxValue = numberList.get(indexValue);
                
                return maxElement(numberList, ++indexValue, maxValue);

        }
}
