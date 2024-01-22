public class dowhileloop {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        do{
            fact = fact *num;
            num--;
        }
        while (num>=10);
        System.out.println("Factorial = " + fact);
            
        }
    }

