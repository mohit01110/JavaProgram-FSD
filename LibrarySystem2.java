import java.io.*;
import java.util.*;

public class LibrarySystem2 {
    private static final String CSV_FILE_PATH = "catalog.csv";
    private static List<Book> catalog = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadCatalogFromCSV();

        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to the Unique Library");
        System.out.println("--------------------------------------------------------");

        String choice;
        do {
            System.out.println("\n1. View the complete list of Books");
            System.out.println("2. Add a Book");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit\n");
            System.out.print("Please choose an option from the above menu: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("List of all Books");
                    System.out.println("--------------------------------------------------------");
                    displayCatalog();
                    break;
                case "2":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Add a Book");
                    System.out.println("--------------------------------------------------------");
                    addBook(scanner);
                    break;
                case "3":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Issue a Book");
                    System.out.println("--------------------------------------------------------");
                    System.out.print("Enter the Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("\nEnter Student ID: ");
                    String studentId = scanner.nextLine();
                    issueBook(bookId, studentId);
                    break;
                case "4":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Return a Book");
                    System.out.println("--------------------------------------------------------");
                    System.out.print("Enter the Book ID: ");
                    bookId = scanner.nextLine();
                    returnBook(bookId);
                    break;
                case "5":
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
            choice = scanner.nextLine();
        } while (!choice.equalsIgnoreCase("N"));

        saveCatalogToCSV();
        scanner.close();
    }

    private static void loadCatalogFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                catalog.add(new Book(data[0], data[1], data[2], data[3], data[4]));
            }
            System.out.println("Catalog data loaded from catalog.csv.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing catalog data found.");
        } catch (IOException e) {
            System.out.println("Error occurred while loading catalog data from catalog.csv.");
        }
    }

    private static void saveCatalogToCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE_PATH))) {
            writer.println("Book ID,Book Title,Author,Availability,Issue Date");
            for (Book book : catalog) {
                writer.println(book.toCSVString());
            }
            System.out.println("Catalog data saved to catalog.csv.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving catalog data to catalog.csv.");
        }
    }

    private static void displayCatalog() {
        System.out.println("Book ID\tBook Title\tAuthor\t\tAvailability\tIssue Date");
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Availability: ");
        String availability = scanner.nextLine();
        System.out.print("Enter Issue Date: ");
        String issueDate = scanner.nextLine();

        catalog.add(new Book(bookId, bookTitle, author, availability, issueDate));
        System.out.println("Book added successfully.");
    }

    private static void issueBook(String bookId, String studentId) {
        for (Book book : catalog) {
            if (book.getBookId().equals(bookId)) {
                if (book.getAvailability().equalsIgnoreCase("Available")) {
                    book.setAvailability("Issued");
                    book.setIssueDate(studentId);
                    System.out.println("BookID: " + bookId + " is issued to " + studentId);
                } else {
                    System.out.println("BookID: " + bookId + " is not available for issue.");
                }
                return;
            }
        }
        System.out.println("BookID: " + bookId + " not found.");
    }

    private static void returnBook(String bookId) {
        for (Book book : catalog) {
            if (book.getBookId().equals(bookId)) {
                if (book.getAvailability().equalsIgnoreCase("Issued")) {
                    book.setAvailability("Available");
                    book.setIssueDate("Null");
                    System.out.println("BookID: " + bookId + " is returned.");
                } else {
                    System.out.println("BookID: " + bookId + " is not issued.");
                }
                return;
            }
        }
        System.out.println("BookID: " + bookId + " not found.");
    }
}

class Book {
    private String bookId;
    private String bookTitle;
    private String author;
    private String availability;
    private String issueDate;

    public Book(String bookId, String bookTitle, String author, String availability, String issueDate) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.availability = availability;
        this.issueDate = issueDate;
    }

    public String getBookId() {
        return bookId;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String toCSVString() {
        return bookId + "," + bookTitle + "," + author + "," + availability + "," + issueDate;
    }

    @Override
    public String toString() {
        return bookId + "\t" + bookTitle + "\t" + author + "\t" + availability + "\t" + issueDate;
    }
}
