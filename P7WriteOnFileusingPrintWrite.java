import java.io.File;
import java.io.PrintWriter;

public class P7WriteOnFileusingPrintWrite {
    public static void main(String[] args) throws Exception {
        // Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Mohit Programmer");
        writer.flush();
        writer.close();
        //Data to write in File using PrintWriter
        PrintWriter writer2 = null;
        writer2 = new PrintWriter(new File("C:\\Mohit\\Full Stack Developer\\Course 6\\testout1.txt"));
        writer2.write("Hello Mohit Ji Full Stack Developer");
        writer2.flush();
        writer2.close();
    }
    
}
