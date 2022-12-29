import java.util.ArrayList;
import java.util.HashMap;

public class Bibliotheque {
    //declare a hshmap to store the documents
    private HashMap<Integer, Document> documents = new HashMap<Integer, Document>();
    //auto generate id
    private static int id = 0;


    //list of ids
    private static ArrayList<Integer> ids = new ArrayList<Integer>();

    public Bibliotheque(Document[] documents) {
        for (Document document : documents) {
            //generate id
            id++;
            this.documents.put(id, document);
        }
    }

    //initialise the array of documents
    public Bibliotheque() {
        this.documents = new HashMap<Integer, Document>();
    }

    //add a document to the array
    public void addDocument(Document document) {
        this.documents.put(document.getDocumentId(), document);
    }

    //print all documents
    public void printDocuments() {
        for (Document document : this.documents.values()) {
            if (document instanceof Book) {
                ((Book) document).printBook();
            } else if (document instanceof novel) {
                System.out.println("Novel");
                ((novel) document).affiche();
            }
        }
    }

    //update a document by id
    public void updateDocument(int id, String name, String text, int size) {
        Document document = this.documents.get(id);
        document.setDocumentName(name);
        document.setDocumentText(text);
        document.setDocumentSize(size);
    }

    //delete a document by key
    public void deleteDocument(int id) {
        this.documents.remove(id);
    }

    //print all books
    public void printBooks() {
        for (Document document : this.documents.values()) {
            if (document instanceof Book) {
                ((Book) document).printBook();
            }
        }
        //print the keys
        System.out.println("keys: " + this.documents.keySet());
    }

    //print all novels
    public void printNovels() {
        for (Document document : this.documents.values()) {
            if (document instanceof novel) {
                ((novel) document).affiche();
            }
        }
    }

    //find a document by id
    public Document findDocument(int id) {
        if (this.documents.containsKey(id)) {
            return this.documents.get(id);
        }
        else {
            return null;
        }
    }
    //main method
    public static void main(String[] args) {
        //create a new book
        Book book = new Book();
        book.setDocumentName("The Lord of the Rings");
        book.setDocumentText("The Lord of the Rings is an epic high fantasy novel written by English author and scholar J. R. R. Tolkien. The story began as a sequel to Tolkien's 1937 fantasy novel The Hobbit, but eventually developed into a much larger work. Written in stages between 1937 and 1949, The Lord of the Rings is one of the best-selling novels ever written, with over 150 million copies sold.");
        book.setDocumentSize(1000);
        book.setAuthor("J. R. R. Tolkien");
        book.setPublisher("Allen & Unwin");
        book.setYear(1954);
        book.setPages(1216);
        //create a new novel
        novel revue = new novel("The New Yorker", 1925, 100, "laasaad", "laasaad", 1000);
        //create a new bibliotheque
        Bibliotheque bibliotheque = new Bibliotheque();
        //add the book to the bibliotheque
        bibliotheque.addDocument(book);
        //add the novel to the bibliotheque
        bibliotheque.addDocument(revue);
        //print all documents
        bibliotheque.printDocuments();
        //print all books
        bibliotheque.printBooks();
        //print all novels
        bibliotheque.printNovels();
    }
}
