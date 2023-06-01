import java.util.Scanner;

public class P6EmiCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //use for taking input 

        //amount loan
        System.out.println("Enter the Amount");
        double a = scan.nextDouble();

        //number of Months
        System.out.println("Enter Number of Years");
        double n = scan.nextDouble() * 12;

        //interest rate is 6.
        double r = 0.06 / 12;

        double f1 = Math.pow((1 + r), n);
        System.out.println(f1);


        //formula
        double month = a/((f1 - 1) / (r*f1));
        System.out.printf("Month amount is : %.2f", month);
        System.out.println();  

        double totalInterest = Math.abs(a - (month * n));
        System.out.printf("Total interest: %.2f", totalInterest);
        
    }
    
}
