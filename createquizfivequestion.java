import java.util.Scanner;

public class createquizfivequestion {
    public static void main(String[] args) {
        System.out.println( " Enter Your name: ");
        Scanner s = new Scanner (System.in);
        String name = s.nextLine();
        System.out.println("Enter the capital of India: ");
        String option = s.nextLine();
        int score= 0;
        if (option.equalsIgnoreCase("Delhi")){
            System.out.println("You are correct! ");
            score ++;
               } else {
            System.out.println("Try next question. ");
        }
        System.out.println("Enter the Nation Animal of India: ");
        String option1 = s.nextLine();
        if (option1.equalsIgnoreCase("Tiger")){
            System.out.println("You are correct! ");
            score ++;
               } else {
            System.out.println("Try next question. ");
               }
        System.out.println("Enter the Nation Flower of India: ");
        String option2= s.nextLine();
        if (option2.equalsIgnoreCase("Lotus")){
        System.out.println("You are correct! ");
          score ++;
            }
        System.out.println("National Bird of India ");
        String option3= s.nextLine();
        if (option3.equalsIgnoreCase("Peacock")){
        System.out.println("Your are Correct! ");
            score ++;
        }
        System.out.println("Which is the national sport of india");
        String option4= s.nextLine();
        if (option4.equalsIgnoreCase("Hockey")){
        System.out.println("You are correct");
            score++;
        } 
        //     else {
        //         System.out.println("Try next question. ");
        // }
System.out.println(" Your score is : " + score);
    }
}