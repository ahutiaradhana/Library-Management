import java.util.Scanner;

public class Main { // Changed the class name to 'Main' to work in online compilers
    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add a Book");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Print Issue Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            Library library = new Library();

            switch (option) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.issueBook();
                    break;
                case 3:
                    library.returnBook();
                    break;
                case 4:
                    library.printIssueDetails();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    library.exitSystem();
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

            System.out.print("\nDo you want to perform another operation? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the Library Management System.");
    }
}

class Library {
    private static String bookName;
    private static String issueDate;
    private static String returnDate;
    private static int bookId;
    private static int totalIssuedBooks;

    Scanner scanner = new Scanner(System.in);

    void addBook() {
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        float price = scanner.nextFloat();
        System.out.print("Enter Book ID: ");
        bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Book added successfully: " + bookName + ", Price: " + price + ", ID: " + bookId);
    }

    void issueBook() {
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Enter Book ID: ");
        bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Issue Date (DD/MM/YYYY): ");
        issueDate = scanner.nextLine();
        System.out.print("Enter Total Number of Books Issued: ");
        totalIssuedBooks = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Return Date (DD/MM/YYYY): ");
        returnDate = scanner.nextLine();
        System.out.println("Book issued successfully.");
    }

    void returnBook() {
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Book ID: ");
        int enteredBookId = scanner.nextInt();

        if (enteredBookId == bookId) {
            System.out.println("\n--- Book Return Details ---");
            System.out.println("Student Name: " + studentName);
            System.out.println("Book Name: " + bookName);
            System.out.println("Book ID: " + bookId);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Return Date: " + returnDate);
            System.out.println("Total Books Issued: " + totalIssuedBooks);
        } else {
            System.out.println("Incorrect Book ID. Please try again.");
        }
    }

    void printIssueDetails() {
        System.out.println("\n--- Book Issue Details ---");
        System.out.println("Book Name: " + bookName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Total Books Issued: " + totalIssuedBooks);
    }

    void exitSystem() {
        System.exit(0);
    }
}
