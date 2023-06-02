import java.util.Scanner;

public class P12patternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("Select Pattern to Print");
        System.out.println("1. Pyramid");
        System.out.println("2. Diamond");
        System.out.println("3. Number Pattern");
        System.out.println("4. Floyd's Triangle");

        System.out.println("Enter Your Choice (1 - 4)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Pyramid Pattern");
                printPyramid();
                break;
            }
            case 2: {
                System.out.println("Diamond Pattern");
                printDiamond();
                break;
            }
            case 3: {
                System.out.println("Number Pattern");
                printNumberPat();
                break;
            }
            case 4: {
                System.out.println("Floyd's Triangle");
                printFloyd();
                break;
            }
            default: {
                System.out.println("Invalid Choice");
                break;
            }
        }
    }

    // Pyramid Pattern Function
    public static void printPyramid() {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Diamond Pattern Function
    public static void printDiamond() {
        int rows = 7;
        for (int i = 1; i <= rows; i++) { // upper triangle
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = rows - 1; i >= 1; i--) { // inverse triangle
            for (int j = rows; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    // Number Pattern function
    public static void printNumberPat() {
        int row = 7;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Floyd's Triangle
    public static void printFloyd() {
        int row = 7;
        int k = 1; // display value
        // Outer Loop
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");

                // Incrementing value
                k++;
            }
            System.out.println();
        }
    }
}