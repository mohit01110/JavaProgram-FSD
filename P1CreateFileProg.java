import java.io.File;
import java.io.IOException;
import java.lang.*;

class P1CreateFileProg{
    public static void main(String[] args) {
        File f = new File("C:\\Mohit\\Full Stack Developer\\Course 6\\LC.txt");
        try
        {
            if(f.createNewFile()) //this method create new file in java
            {
            System.out.println("File Successfully Create...!");
            }
        else 
            {
            System.out.println("File already Exist..!");
            }
        }
        catch(IOException i)
        {   
            System.out.println("Exception Handled..!");
        }

        

    }
}