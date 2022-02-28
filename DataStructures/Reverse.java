import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {

     public static void main(String[] args) throws FileNotFoundException, IOException 
     {

        Stack stack = new Stack();

        Reverse obj = new Reverse();

        obj.readFile(stack);   
        obj.reverseFile(stack);
       
    }
     private void readFile(Stack stack) throws FileNotFoundException
    {

        String fileName = "src/reverse.txt";
        String line;
    
        File file;
        file = new File(fileName);
        Scanner fileScanner;
        fileScanner = new Scanner(file);
  
            while(fileScanner.hasNextLine())
            {
        
            line = fileScanner.nextLine();
    
            for(int i = 0;i<line.length();i++){
            stack.push(line.charAt(i));
            }
        
            }
    
    }
     
    private void reverseFile(Stack stack) throws IOException
    {
        
        String fileName = "src/outputreverse.txt";
        String line;
    
        File file;
        file = new File(fileName);
        BufferedWriter fileWriter;
        fileWriter = new BufferedWriter(new FileWriter(file));
  
        while(!stack.isEmpty()){
        fileWriter.write(stack.peek().toString());
        stack.pop();
        }
            fileWriter.flush();
            fileWriter.close();
        }
    }
 