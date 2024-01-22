import java.util.Scanner;

public class emiCalculator {
    //Create a program of EMI calculator
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Amount of Loan
        System.out.println("Enter the Loan Amount");
        double a = scan.nextDouble();

        //Number of Months
        System.out.println("Enter number of Years");
        double n = scan.nextDouble() * 12;

        //interest rate is 6
        double r = 0.06 / 12;

        double f1 = Math.pow((1 + r), n);
        double month = a / ((f1-1) / (r*f1));

        System.out.printf("month amount is : %.2f", month);
        System.out.println();

        double totalInterest = Math.abs( a - (month * n));
        System.out.printf("Total interest : %.2f", totalInterest);
        
    }
    
}
