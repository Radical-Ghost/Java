import java.util.Scanner;
import java.util.Vector;

class LibraryItem {
    String title;
    String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }
}

class Book extends LibraryItem {
    int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    int getPageCount() {
        return pageCount;
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<LibraryItem> libraryItems = new Vector<>();
        Book b;
        do {
            System.out.println("\nLibrary System\n1. Add Book\n2. List Library Items\n3. Exit\nEnter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = s.next();
                    System.out.print("Enter author: ");
                    String bookAuthor = s.next();
                    System.out.print("Enter page count: ");
                    int pageCount = s.nextInt();

                    b = new Book(bookTitle, bookAuthor, pageCount);
                    libraryItems.add(b);
                    break;
                case 2:
                    System.out.println("\nLibrary Items:");
                    for (int i = 0; i < libraryItems.size(); i++) {
                        try{
                            b = (Book) libraryItems.get(i);
                            System.out.println("Title: " + b.getTitle());
                            System.out.println("Author: " + b.getAuthor());
                            System.out.println("Page Count: " + b.getPageCount());
                            System.out.println();
                        } catch (ClassCastException e){
                            System.out.println("Library is empty.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Library System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }while(true);
    }
}
