import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password Generator");

        System.out.print("Enter the number of passwords you want to generate: ");
        int numPasswords = scanner.nextInt();

        System.out.print("Enter the length of each password: ");
        int passwordLength = scanner.nextInt();

        System.out.println("Include the following options in your passwords:");
        System.out.print("Uppercase letters (A-Z) [Y/N]: ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Lowercase letters (a-z) [Y/N]: ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Digits (0-9) [Y/N]: ");
        boolean includeDigits = scanner.next().equalsIgnoreCase("Y");

        System.out.print("Special characters (!@#$%^&*()) [Y/N]: ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("Y");

        System.out.println();

        String[] generatedPasswords = generatePasswords(numPasswords, passwordLength, includeUppercase, includeLowercase, includeDigits, includeSpecialChars);

        if (savePasswordsToFile(generatedPasswords, "passwords.txt")) {
            System.out.println("Passwords have been generated and saved to passwords.txt.");
        } else {
            System.out.println("Failed to save passwords to a file.");
        }

        scanner.close();
    }

    public static String[] generatePasswords(int numPasswords, int passwordLength, boolean includeUppercase, boolean includeLowercase, boolean includeDigits, boolean includeSpecialChars) {
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()";
        StringBuilder allChars = new StringBuilder();

        if (includeUppercase) allChars.append(uppercaseChars);
        if (includeLowercase) allChars.append(lowercaseChars);
        if (includeDigits) allChars.append(digitChars);
        if (includeSpecialChars) allChars.append(specialChars);

        String[] passwords = new String[numPasswords];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < numPasswords; i++) {
            StringBuilder password = new StringBuilder();
            for (int j = 0; j < passwordLength; j++) {
                int index = random.nextInt(allChars.length());
                password.append(allChars.charAt(index));
            }
            passwords[i] = password.toString();
        }

        return passwords;
    }

    public static boolean savePasswordsToFile(String[] passwords, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String password : passwords) {
                writer.write(password + "\n");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
