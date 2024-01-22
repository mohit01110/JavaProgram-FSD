import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P4WriteOnFileProg {
                        //Write on File
    public static void main(String[] args) {

        try
        {
            FileWriter f = new FileWriter("C:\\Mohit\\Full Stack Developer\\Course 6\\LC1.txt");
            try
            {
                f.write("Java Programming is the best language");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully data wrote in File");

        }
        catch(IOException i)
        {
            System.out.println(i);
        }

        
    }
    
}
