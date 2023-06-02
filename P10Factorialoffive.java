public class P10Factorialoffive {
    //Print a factorial of a number 5

    public static void main(String[] args) {
        int fact = 1;
        int n = 5;

        while(n>=1){
            fact = fact*n;
            n--;
        }
        System.out.println("Factorial = " + fact);

    }
    
}
