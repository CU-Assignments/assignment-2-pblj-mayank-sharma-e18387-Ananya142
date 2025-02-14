import java.util.Scanner;

class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Fiction");
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Non-Fiction");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        
        System.out.print("Enter book type (Fiction/Non-Fiction): ");
        String type = scanner.nextLine();
        
        Book book;
        if (type.equalsIgnoreCase("Fiction")) {
            book = new Fiction(title, author);
        } else if (type.equalsIgnoreCase("Non-Fiction")) {
            book = new NonFiction(title, author);
        } else {
            System.out.println("Invalid book type. Defaulting to Fiction.");
            book = new Fiction(title, author);
        }
        
        book.displayDetails();
        scanner.close();
    }
}
