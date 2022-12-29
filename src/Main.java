import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initialise the hasshmap from the class Bibliothèque
        Bibliotheque biblio = new Bibliotheque();
        //
        //make an infinite loop
        while (true) {
            //add some books
            Book book1 = new Book();
            book1.setDocumentName("The Lord of the Rings");
            book1.setDocumentText("The Lord of the Rings is an epic high fantasy novel written by English author and scholar J. R. R. Tolkien. The story began as a sequel to Tolkien's 1937 fantasy novel The Hobbit, but eventually developed into a much larger work. Written in stages between 1937 and 1949, The Lord of the Rings is one of the best-selling novels ever written, with over 150 million copies sold.");
            book1.setDocumentSize(1000);
            book1.setAuthor("J. R. R. Tolkien");
            book1.setPublisher("Allen & Unwin");
            book1.setYear(1954);
            book1.setPages(1216);
            biblio.addDocument(book1);
            Book book2 = new Book();
            book2.setDocumentName("The Hobbit");
            book2.setDocumentText("The Hobbit, or There and Back Again is a children's fantasy novel by English author J. R. R. Tolkien. It was published on 21 September 1937 to wide critical acclaim, being nominated for the Carnegie Medal and awarded a prize from the New York Herald Tribune for best juvenile fiction. The book remains popular and is recognized as a classic in children's literature.");
            book2.setDocumentSize(1000);
            book2.setAuthor("J. R. R. Tolkien");
            book2.setPublisher("Allen & Unwin");
            book2.setYear(1937);
            book2.setPages(295);
            biblio.addDocument(book2);
            //add some novels
            novel revue1 = new novel("The New Yorker", 1925, 100, "laasaad", "laasaad", 1000);
            biblio.addDocument(revue1);
            novel revue2 = new novel("The New Yorker", 1925, 100, "laasaad", "laasaad", 100);
            biblio.addDocument(revue2);
            //print the menu
            System.out.println("1- Ajouter un document");
            System.out.println("2- Afficher les documents");
            System.out.println("3- Modifier un document");
            System.out.println("4- Supprimer un document");
            System.out.println("5- Quitter");
            //get the user choice
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            //check the user choice
            switch (choice) {
                case 1:
                    //add a document
                    System.out.println("1- Ajouter un livre");
                    System.out.println("2- Ajouter un roman");
                    int choice2 = sc.nextInt();
                    //check the user choice
                    switch (choice2) {
                        case 1:
                            //add a book
                            System.out.println("Entrer le nom du livre");
                            String name = sc.next();
                            System.out.println("Entrer le texte du livre");
                            String text = sc.next();
                            System.out.println("Entrer la taille du livre");
                            int size = sc.nextInt();
                            System.out.println("Entrer l'auteur du livre");
                            String auteur = sc.next();
                            System.out.println("Entrer l'editeur du livre");
                            String editeur = sc.next();
                            //create a new book
                            Book book = new Book();
                            book.setDocumentName(name);
                            book.setDocumentText(text);
                            book.setDocumentSize(size);
                            book.setAuthor(auteur);
                            book.setPublisher(editeur);
                            //add the book to the documents hashmap
                            biblio.addDocument(book);
                            break;

                        case 2:
                            //create a new novel
                            novel revue = novel.addRevue();
                            //add the novel to the documents hashmap
                            biblio.addDocument(revue);
                    }
                case 2:
                    //choix 2
                    System.out.println("1 - Afficher tous les documents");
                    System.out.println("2 - Afficher juste les livres");
                    System.out.println("3 - Afficher juste les revue");
                    int choice3 = sc.nextInt();
                    //check the user choice
                    switch (choice3) {
                        case 1:
                            //afficher tous les documents
                            biblio.printDocuments();
                            break;
                        case 2:
                            //afficher juste les livres
                            biblio.printBooks();
                            break;
                        case 3:
                            //afficher juste les revue
                            biblio.printNovels();
                    }
                case 3:
                    //choix 3 edit a document
                    System.out.println("Entrer l'id du document");
                    int id = sc.nextInt();
                    //check if the document exists
                    Document found = biblio.findDocument(id);
                    if (found != null) {
                        //edit the document
                        System.out.println("Entrer le nouveau nom du document");
                        String name = sc.next();
                        System.out.println("Entrer le nouveau texte du document");
                        String text = sc.next();
                        System.out.println("Entrer la nouvelle taille du document");
                        int size = sc.nextInt();
                        //update the document
                        biblio.updateDocument(id, name, text, size);
                    }
                    else {
                        System.out.println("Document introuvable");
                    }
                    case 4:
                    //choix 4 delete a document
                    System.out.println("Entrer l'id du document");
                    id = sc.nextInt();
                    //check if the document exists
                    found = biblio.findDocument(id);
                    if (found != null) {
                        //delete the document
                        biblio.deleteDocument(id);
                    }
                    System.out.println("Document introuvable");
                case 5:
                    //choix 5 exit
                    System.out.println("Au revoir");
                    break;
                    //exit the program
            }

        }
    }
}