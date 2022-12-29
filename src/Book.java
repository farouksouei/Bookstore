import java.util.Scanner;

public class Book implements Document {
    private String name;
    private String text;
    private int size;
    //auto increment id static
    private static int id = 0;
    private String author;
    private String publisher;
    private int year;
    private int pages;

    @Override
    public String getDocumentName() {
        return name;
    }

    @Override
    public String getDocumentText() {
        return text;
    }

    @Override
    public int getDocumentSize() {
        return size;
    }

    @Override
    public int getDocumentId() {
        return id;
    }

    @Override
    public void setDocumentName(String name) {
        this.name = name;
    }

    @Override
    public void setDocumentText(String text) {
        this.text = text;
    }

    @Override
    public void setDocumentSize(int size) {
        this.size = size;
    }

    @Override
    public void setDocumentId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String name, String text, int size, int id, String author, String publisher, int year, int pages) {
        this.name = name;
        this.text = text;
        this.size = size;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        //auto increment id
        Book.id = id + 1;
    }

    public Book() {
        this.name = "No name";
        this.text = "No text";
        this.size = 0;
        this.id = 0;
        this.author = "No author";
        this.publisher = "No publisher";
        this.year = 0;
        this.pages = 0;
    }

    public void printBook() {
        System.out.println("Book name: " + name);
        System.out.println("Book text: " + text);
        System.out.println("Book size: " + size);
        System.out.println("Book id: " + id);
        System.out.println("Book author: " + author);
        System.out.println("Book publisher: " + publisher);
        System.out.println("Book year: " + year);
        System.out.println("Book pages: " + pages);
    }

    //update book by id
    public void updateBook(int id, String name, String text, int size, String author, String publisher, int year, int pages) {
        if (this.id == id) {
            this.name = name;
            this.text = text;
            this.size = size;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
            this.pages = pages;
        }
    }

    //delete book by id
    public void deleteBook(int id) {
        if (this.id == id) {
            this.name = "No name";
            this.text = "No text";
            this.size = 0;
            this.id = 0;
            this.author = "No author";
            this.publisher = "No publisher";
            this.year = 0;
            this.pages = 0;
        }
    }

    //search book by name
    public void searchBook(String name) {
        if (this.name == name) {
            System.out.println("Book name: " + name);
            System.out.println("Book text: " + text);
            System.out.println("Book size: " + size);
            System.out.println("Book id: " + id);
            System.out.println("Book author: " + author);
            System.out.println("Book publisher: " + publisher);
            System.out.println("Book year: " + year);
            System.out.println("Book pages: " + pages);
        }
    }

    //add book with input from user
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter book text: ");
        this.text = scanner.nextLine();
        System.out.println("Enter book size: ");
        this.size = scanner.nextInt();
        System.out.println("Enter book id: ");
        this.id = scanner.nextInt();
        System.out.println("Enter book author: ");
        this.author = scanner.nextLine();
        System.out.println("Enter book publisher: ");
        this.publisher = scanner.nextLine();
        System.out.println("Enter book year: ");
        this.year = scanner.nextInt();
        System.out.println("Enter book pages: ");
        this.pages = scanner.nextInt();
    }
}
