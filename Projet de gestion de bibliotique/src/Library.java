import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
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
    books.add(NBook);
    System.out.println("Livre ajouté avec succès.");
    System.out.println();
}
void AfficherUnLivre(){
    for(int i =0 ; i<books.size() ; i++){
        System.out.println(books.get(i).titre);
        System.out.println(books.get(i).Auteur);
        System.out.println(books.get(i).isbn);
        System.out.println(books.get(i).publicationDate);

    }
}
void SupprimerUnLivre(){
    System.out.println("Veuillez entrer le livre à supprimer : ");
    Scanner input =new
    for (int i=0 ; i<books.size() ; i++);

}
}

