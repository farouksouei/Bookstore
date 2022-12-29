import java.util.ArrayList;
import java.util.Scanner;

public class novel implements Document {
    private String name;
    private int mois;
    private int annee;
    private String auteur;
    private String editeur;
    //make id static for auto increment
    private static int count = 0;
    private int id;
    //make a list of ids
    private static ArrayList<Integer> ids = new ArrayList<Integer>();

    @Override
    public String getDocumentName() {
        return name;
    }

    @Override
    public String getDocumentText() {
        return null;
    }

    @Override
    public int getDocumentSize() {
        return mois;
    }

    @Override
    public int getDocumentId() {
        return count;
    }

    @Override
    public void setDocumentName(String name) {
        this.name = name;
    }

    @Override
    public void setDocumentText(String text) {
        this.mois = mois;
    }

    @Override
    public void setDocumentSize(int size) {
        this.annee = annee;
    }

    @Override
    public void setDocumentId(int id) {
        this.count = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void affiche() {
        System.out.println("Nom du revue: " + name);
        System.out.println("Auteur: " + auteur);
        System.out.println("Editeur: " + editeur);
        System.out.println("Mois: " + mois);
        System.out.println("Annee: " + annee);
    }

    //make constructor
    public novel(String name, int mois, int annee, String auteur, String editeur, int id) {
        this.name = name;
        this.mois = mois;
        this.annee = annee;
        this.auteur = auteur;
        this.editeur = editeur;
        this.count = count + 1;
        this.id = id;
    }
    //make a method to check if the id is already used
    public static boolean checkId(int id) {
        if (ids.contains(id)) {
            return true;
        } else {
            return false;
        }
    }

    //make a method to add id to the list
    public static void addId(int id) {
        ids.add(id);
    }

    //make a method to add revue
    public static novel addRevue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du revue: ");
        String name = sc.nextLine();
        System.out.println("Auteur: ");
        String auteur = sc.nextLine();
        System.out.println("Editeur: ");
        String editeur = sc.nextLine();
        System.out.println("Mois: ");
        int mois = sc.nextInt();
        System.out.println("Annee: ");
        int annee = sc.nextInt();
        System.out.println("Id: ");
        int id = sc.nextInt();
        //check if the id is already used
        if (checkId(id)) {
            System.out.println("Id deja utilise");
        } else {
            //add id to the list
            addId(id);
            //create a new revue
            novel revue = new novel(name, mois, annee, auteur, editeur, id);
            //add revue to the list
            return revue;
        }
        return null;
    }

    //make a method to search for a revue
    public static void searchRevue(ArrayList<novel> revues) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id du revue: ");
        int id = sc.nextInt();
        for (int i = 0; i < revues.size(); i++) {
            if (revues.get(i).id == id) {
                revues.get(i).affiche();
            }
        }
    }

    //make a method to delete a revue
    public static void deleteRevue(ArrayList<novel> revues) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id du revue: ");
        int id = sc.nextInt();
        for (int i = 0; i < revues.size(); i++) {
            if (revues.get(i).id == id) {
                revues.remove(i);
            }
        }
    }

    //make a method to edit a revue
    public static void editRevue(ArrayList<novel> revues) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id du revue: ");
        int id = sc.nextInt();
        for (int i = 0; i < revues.size(); i++) {
            if (revues.get(i).id == id) {
                System.out.println("Nom du revue: ");
                String name = sc.nextLine();
                System.out.println("Auteur: ");
                String auteur = sc.nextLine();
                System.out.println("Editeur: ");
                String editeur = sc.nextLine();
                System.out.println("Mois: ");
                int mois = sc.nextInt();
                System.out.println("Annee: ");
                int annee = sc.nextInt();
                revues.get(i).setAuteur(auteur);
                revues.get(i).setEditeur(editeur);
                revues.get(i).setMois(mois);
                revues.get(i).setAnnee(annee);
                revues.get(i).setDocumentName(name);
            }
        }
    }
}
