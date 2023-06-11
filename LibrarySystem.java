import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to the Unique Library");
        System.out.println("--------------------------------------------------------");
        
        String choice;
        do {
            System.out.println("\nView the complete list of Books");
            System.out.println("Issue a Book");
            System.out.println("Return a Book");
            System.out.println("Exit\n");
            System.out.print("Please choose an option from the above menu: ");
            choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("List of all Books");
                    System.out.println("--------------------------------------------------------");
                    library.displayBooks();
                    break;
                case "2":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Issue the Book");
                    System.out.println("--------------------------------------------------------");
                    System.out.print("Enter the Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("\nEnter StudentID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("\nEnter 'C' to confirm: ");
                    String confirmation = scanner.nextLine();
                    if (confirmation.equalsIgnoreCase("C")) {
                        library.issueBook(bookId, studentId);
                    } else {
                        System.out.println("Confirmation canceled.");
                    }
                    break;
                case "3":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Return the Book");
                    System.out.println("--------------------------------------------------------");
                    System.out.print("Enter the Book ID: ");
                    bookId = scanner.nextLine();
                    System.out.print("\n\n--------------------------------------------------------");
                    library.returnBook(bookId);
                    System.out.println("--------------------------------------------------------");
                    break;
                case "4":
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            
            System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
            choice = scanner.nextLine();
        } while (!choice.equalsIgnoreCase("N"));
        
        scanner.close();
    }
}

class Library {
    private Book[] books;

    public Library() {
        // Initialize the library with some sample books
        books = new Book[4];
        books[0] = new Book("101", "HTML and CSS", "Jon Duckett", "Available", "Null");
        books[1] = new Book("102", "JavaScript: The Good Parts", "Douglas C", "Available", "Null");
        books[2] = new Book("103", "Learning Web Design", "Jennifer N", "CP2014", "23-May-2023");
        books[3] = new Book("104", "Responsive Web Design", "Ben Frain", "EC3142", "17-May-2023");
    }

    public void displayBooks() {
        System.out.println("Book ID\tBook Title\tAuthor\t\tAvailability\tIssue Date");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String bookId, String studentId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                if (book.getAvailability().equalsIgnoreCase("Available")) {
                    book.setAvailability("Issued");
                    book.setIssueDate(studentId);
                    System.out.println("BookID: " + bookId + " is Issued to " + studentId);
                } else {
                    System.out.println("BookID: " + bookId + " is not available for issue.");
                }
                return;
            }
        }
        System.out.println("BookID: " + bookId + " not found.");
    }

    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                if (book.getAvailability().equalsIgnoreCase("Issued")) {
                    book.setAvailability("Available");
                    book.setIssueDate("Null");
                    System.out.println("BookID: " + bookId + " is returned back");
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

    @Override
    public String toString() {
        return bookId + "\t" + bookTitle + "\t" + author + "\t" + availability + "\t" + issueDate;
    }
}