import java.io.File;
import java.io.IOException;

public class P2HandleExceptionusingThrows {
    public static void main(String[] args) throws IOException
     {
        File f = new File("C:\\Mohit\\Full Stack Developer\\Course 6\\LC1.txt");
        
            if(f.createNewFile()) //this method create new file in java
            {
            System.out.println("File Successfully Create...!");
            }
        else 
            {
            System.out.println("File already Exist..!");
            }
    }
}
