import java.util.Scanner;

public class P4SimpleBot {
    public static void main(String[] args) {
        
        //take input from user using scanner class
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input1.nextLine(); //nextLine use for taking string data type
        //System.out.println(name);
        System.out.println("Enter Your Age : ");
        int age = input1.nextInt(); //nextInt use for taking integer input 
        if (age >= 18) {
            System.out.println("You Can Vote");
        }
        else 
        {
            System.out.println("You Cannot Vote");
        }
        input1.nextLine();
        System.out.println("Enter Your Hobbies");
        String hobby = input1.nextLine();

        System.out.println("Enter Your Contact Number : ");
        long phone = input1.nextLong();
        
    }
}
