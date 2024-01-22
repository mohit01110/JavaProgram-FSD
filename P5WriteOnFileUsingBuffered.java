import java.io.BufferedWriter;
import java.io.FileWriter;

public class P5WriteOnFileUsingBuffered {
                            //Buffered Writer Class Example to write into file
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("C:\\Mohit\\Full Stack Developer\\Course 6\\LC.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Hello Mohit");
        buffer.close();
        System.out.println("Success");

        
    }
    
}
