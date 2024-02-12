import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String titre;
    String Auteur;
    String isbn;
    String publicationDate;


    void modifyrUnlivre() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nouveau Titre :");
        this.titre = input.next();
        System.out.println("Nouveau Nom d'Auteur :");
        this.Auteur = input.next();
        System.out.println("Nouveau ISBN :");
        this.isbn = input.next();
        System.out.println("Nouveau Date :");
        this.publicationDate = input.next();
        System.out.println("----> Les modifications sont bien enregistrées.");
        System.out.println("──────────────────────────────────────────────");
        System.out.println();


    }
}
