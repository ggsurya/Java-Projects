import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    String title, author;
    boolean isIssued;

    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return String.format("%-30s %-20s %s", title, author, isIssued ? "Issued" : "Available");
    }
}

public class LibraryManagementSystem
{
    static ArrayList<Book> library = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;
        do
        {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4. List Books\n5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.hasNextInt() ? sc.nextInt() : 0;
            sc.nextLine();

            switch (choice)
            {
                case 1 -> addBook();
                case 2 -> issueBook();
                case 3 -> returnBook();
                case 4 -> listBooks();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 5);
    }

    static void addBook()
    {
        System.out.print("Enter book title: ");
        String title = sc.nextLine().trim();
        System.out.print("Enter author name: ");
        String author = sc.nextLine().trim();

        if (title.isEmpty() || author.isEmpty())
        {
            System.out.println("Invalid input!");
            return;
        }

        library.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    static void issueBook()
    {
        System.out.print("Enter book title to issue: ");
        String title = sc.nextLine().trim();

        for (Book book : library)
        {
            if (book.title.equalsIgnoreCase(title) && !book.isIssued)
            {
                book.isIssued = true;
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    static void returnBook()
    {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine().trim();

        for (Book book : library)
        {
            if (book.title.equalsIgnoreCase(title) && book.isIssued)
            {
                book.isIssued = false;
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or wasn't issued.");
    }

    static void listBooks()
    {
        if (library.isEmpty())
        {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("\nTitle                          Author                Status");
        System.out.println("-------------------------------------------------------------");
        library.forEach(System.out::println);
    }
}