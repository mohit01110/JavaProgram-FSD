//Question 2: The Assignment Operators (+=, -=, *=, /=, %=)
import java.io.*;


public class assignementoperator {
    public static void main(String[] args) {
        int num1,num2;
        
        num1 = 10;
        num2 = 10;
      
        

        num1 += 2; //+= Operator
        System.out.println("After addition num = " + num1 );
        num1 -=4; //-= Operator
        System.out.println("After substraction num = " + num1 );
        double num11 = 10;
        double num22 = 5.6;
        num11 *=num22;
        System.out.println("After multiplication= " + num11);

        int num5 = 140, num6 = 10;
        num5 /= num6;
        System.out.println("After division= " + num5);
        int num7 = 5, num3 = 3;
        num7 %=num3;
        System.out.println("After modulus= " + num7);



        
    }

    
}