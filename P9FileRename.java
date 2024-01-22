import java.io.File;

public class P9FileRename {
                            //Rename a file
    public static void main(String[] args) {

        File f = new File("C:\\Mohit\\Full Stack Developer\\Course 6\\testout1.txt");
        File r = new File("C:\\Mohit\\Full Stack Developer\\Course 6\\mohitP.txt");
        
        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("File does not exist..!");
        }

        
    }
    
}
