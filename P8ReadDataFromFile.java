import java.io.FileReader;
import java.io.*;

public class P8ReadDataFromFile {
                    //Read Data from a file
    public static void main(String[] args) {
        
        try
        {
            FileReader r = new FileReader("C:\\Mohit\\Full Stack Developer\\Course 6\\testout1.txt");
            try
            {
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.print((char)i);
                }
            }
            finally
            {
                r.close();
            }

        }
        catch(IOException e)
        {
            System.out.println("Exception Handled");
        }

    }
    
}
