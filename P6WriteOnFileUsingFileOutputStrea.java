import java.io.FileOutputStream;
public class P6WriteOnFileUsingFileOutputStrea {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Mohit\\Full Stack Developer\\Course 6\\testout.txt");
            fout.write(100);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
