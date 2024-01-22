import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class P10CopydatatoanotherFile {
                            //Copy One file data to Another
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Mohit\\Full Stack Developer\\Course 6\\mohitP.txt");
        FileOutputStream w = new FileOutputStream("C:\\Mohit\\Full Stack Developer\\Course 6\\shaktiG.txt");

        int i;
        while((i= r.read())!=-1)
        {
            w.write((char)i);
        }
        System.out.println("Data Copied Successfully..!");

    }
    
}
