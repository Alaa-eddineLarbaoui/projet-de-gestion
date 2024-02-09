import java.util.Scanner;

class Menu {


    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    void menu() {
        System.out.println("voici les options disponibles:");
        System.out.println("1. Ajouter un livre");
        System.out.println("2. Supprimer un livre");
        System.out.println("3. Rechercher un livre");
        System.out.println("4. Afficher un livre");
        System.out.println("5. Sortie");
        System.out.println("_____________________________");
    }

    void handleUserInput() {
        int Choix;
        do {
            menu();
            System.out.print("Entrer votre choix : ");
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1:
                    library.AjouterUnLivre();
                    break;
                case 2:
                    library.SupprimerUnLivre();
                    break;
                case 3:
                    break;
                case 4:
                    library.AfficherUnLivre();
                case 5:
                    System.out.println("Sortie...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (Choix != 5);
    }
}