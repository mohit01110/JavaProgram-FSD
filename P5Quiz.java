import java.util.Scanner;

public class P5Quiz {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = input1.nextLine();
        int score = 0;

        System.out.println("What is the Capital of India?");
        String capital = input1.nextLine();
        if (capital.equalsIgnoreCase("Delhi")){
            System.out.println("You are correct");
            score++;
        }
        else {
            System.out.println("Wrong Answer");
        }

        System.out.println("Where is the Taj Mahal located? ");
        String place = input1.nextLine();
        if (place.equalsIgnoreCase("Agra")){
            System.out.println("You are Correct ");
            score++;
        } 
        else 
        {
            System.out.println("Wrong answer");
        }
        System.out.println("What is the national heritage animal of India? ");
        String animalH = input1.nextLine();
        if (animalH.equalsIgnoreCase("Elephant")){
            System.out.println("You are Correct ");
            score++;
        } 
        else 
        {
            System.out.println("Wrong answer");
        }

        System.out.println("Which state in India has the highest population? ");
        String Popcity = input1.nextLine();
        if (Popcity.equalsIgnoreCase("Uttar Pradesh")){
            System.out.println("You are Correct ");
            score++;
        } 
        else 
        {
            System.out.println("Wrong answer");
        }

        System.out.println("National Bird of India ");
        String bird = input1.nextLine();
        if (bird.equalsIgnoreCase("Peacock")){
            System.out.println("You are Correct ");
            score++;
        } 
        else 
        {
            System.out.println("Wrong answer");
        }
        
        System.out.println("Your Total Score is :" + score);

    }
    
}
