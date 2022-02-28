import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class changeCase {
    
    public static void main(String[] args) throws FileNotFoundException, IOException 
     {

        File file1 = new File("src/beforeChangeCase.txt");
        File file2 = new File("src/changeCase.txt");      
        BufferedReader in = (new BufferedReader(new FileReader(file1)));
        PrintWriter out = (new PrintWriter(new FileWriter(file2)));

        int ch;
        while ((ch = in.read()) != -1)
        {
        if (Character.isLowerCase(ch))
        {
        ch=Character.toUpperCase(ch);
        } else if (Character.isUpperCase(ch))
        {
        ch=Character.toLowerCase(ch);
        }
        out.write(ch);
        }
        in.close();
        out.close();

    }
}
