import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<Book> booksListe = new ArrayList<>();
    ArrayList<Student> studentsListe = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    void AjouterUnLivre() {
        Book NBook = new Book();
        System.out.println("Ajout d'un livre...");
        System.out.print("Entrez le titre : ");
        NBook.titre = scanner.nextLine();
        System.out.print("Entrez l'auteur : ");
        NBook.Auteur = scanner.nextLine();
        System.out.print("Entrez l'ISBN : ");
        NBook.isbn = scanner.nextLine();
        System.out.print("Entrez la date de publication : ");
        NBook.publicationDate = scanner.nextLine();
        booksListe.add(NBook);
        System.out.println("----> Livre ajouté avec succès.");
        System.out.println();
    }
    void AfficherUnLivre() {
        System.out.println("Voici la liste des livres existants: ");
        for (int i = 0; i < booksListe.size(); i++) {
            System.out.println();
            System.out.println("Le titre :"+booksListe.get(i).titre);
            System.out.println("L'auteur :"+booksListe.get(i).Auteur);
            System.out.println("L'isbn:"+booksListe.get(i).isbn);
            System.out.println("La datae de publication :"+booksListe.get(i).publicationDate);

        }
    }

    void SupprimerUnLivre() {
        System.out.println("Veuillez entrer le livre à supprimer : ");
        String searchname = new Scanner(System.in).nextLine();
        boolean check = false;
        for (int i = 0; i < booksListe.size(); i++) {
            if (booksListe.get(i).titre.equalsIgnoreCase(searchname)) {
                booksListe.remove(i);
                check = true;
                System.out.println("le livre a ete supprimer");
                System.out.println();
                System.out.println("_______________________");
            }
        }
        if (!check) {
            System.out.println("le livre n'est pas trouve");
            System.out.println("_________________________ ");
            System.out.println();
        }
    }
}



/* System.out.println("Veuillez rentrer le livre à supprimer : ");
Scanner input = new Scanner(System.in);
String Rech = input.nextLine();
Recherche de toutes les occurrences du livre dans la liste et suppression
boolean removed = false;
for (int i = 0; i < Listelivres.size(); i++) {
        if (Listelivres.get(i).equals(Rech)) {  Listelivres.remove(i);
removed = true; //   */

