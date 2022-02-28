import javax.swing.JOptionPane; // Imported for use of JOptionPane

public class Week12Assignment2 {
    
    public static void main(String[] args) {
        
       String userName; //Assignment user input
       
       userName = JOptionPane.showInputDialog("What is your name?"); //Input window
       
       myMethod(userName);
       
       int x = 5;
       
       x = myMethod(x);
        
    }
    
    public static int myMethod(String userName) {
       
       int x = 5;
       
       System.out.println("\nHello "+userName);
       
       System.out.println("\nReturning x...");
       
       return x;  
    }
   
    public static int myMethod(int x) {
        
       System.out.println("\nPassing x...");
        
       int multipliedBy100 = 100 * x; 
       
       System.out.println("\n5 times 100 is "+multipliedBy100);
       
       return multipliedBy100;  
    }
    
}
