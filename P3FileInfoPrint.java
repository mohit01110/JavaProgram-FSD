import java.io.File;
                            //File Information
public class P3FileInfoPrint {
    public static void main(String[] args) {
        File f = new File("C:\\Mohit\\Full Stack Developer\\Course 6\\LC.txt");

        if(f.exists())
        {   
            System.out.println("File Name: " + f.getName()); //file name
            System.out.println("File Location: " +f.getAbsolutePath()); //file path
            System.out.println("File Writable: " + f.canWrite());
            System.out.println("File Readable: " + f.canRead());
            System.out.println("File Size: " +f.length());
        }
        else
        {
            System.out.println("File Does not exist");
        }
    }
    
}
