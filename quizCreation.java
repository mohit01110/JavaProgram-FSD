import java.util.Scanner;

public class quizCreation {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int score = 0;
        System.out.println("Welcome " + name);
        System.out.println("Answer the Quiz ");
        System.out.println("1. Enter the Capital of India");
        String capital = s.nextLine();
        if (capital.equalsIgnoreCase("Delhi")){
            System.out.println("Correct");
            score++;

        }
        else 
        {
            System.out.println("Incorrect");
        }

        System.out.println("2. Enter the National Animal of India");
        String animal = s.nextLine();
        if (animal.equalsIgnoreCase("Tiger")){
            System.out.println("Correct");
            score++;

        }
        else 
        {
            System.out.println("Incorrect");
        }
        



        System.out.println("3. Enter the National Flower");
        String flower = s.nextLine();
        if (flower.equalsIgnoreCase("Lotus")){
            System.out.println("Correct");
            score++;
            
        }
        else 
        {
            System.out.println("Incorrect");
        }


        System.out.println("4. Which is the highest peak in India?");
        String mountain = s.nextLine();
        if (mountain.equalsIgnoreCase("Mount Everest")){
            System.out.println("Correct");
            score++;
            
        }
        else 
        {
            System.out.println("Incorrect");
        }


        System.out.println("5. Which is the fastest animal on land?");
        String fastanimal = s.nextLine();
        if (fastanimal.equalsIgnoreCase("Cheetah")){
            System.out.println("Correct");
            score++;
            
        }
        else 
        {
            System.out.println("Incorrect");
        }
        System.out.println("Total Score is " + score);
    }
    
    
}
