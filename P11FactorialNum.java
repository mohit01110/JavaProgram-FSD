import java.util.Scanner;
//Print Factorial of Number take input from the user
public class P11FactorialNum {
    public static void main(String[] args) {

        int fact =1;
        int i = 1;

        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        while(i<=num){
            fact = fact *i;
            i++;
        }
        System.out.println("Factorial of " + num + "is " + fact );

    }
}