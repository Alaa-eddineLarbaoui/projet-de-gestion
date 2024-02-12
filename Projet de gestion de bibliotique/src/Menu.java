import java.util.Scanner;

class Menu {


    Scanner scanner = new Scanner(System.in);
    Library library = new Library();
    Book Nbook = new Book();

    void Accueil() {
        System.out.println();
        System.out.println("              Bienvenue dans le programme de gestion de bibliotheque !");
        System.out.println("             ======================================================");
        System.out.println(" Cette application vous permet de gerer la collection de livres de la bibliotheque.");
        System.out.println("               Vous pouvez ajouter, supprimer et rechercher des livres.");
        System.out.println("                     Profitez de votre experience à la bibliotheque !");
        System.out.println();
        System.out.println();
    }
    void Main_Menu() {
        int Choix;
        do {
            System.out.println();
            System.out.println("voici les options disponibles:");
            System.out.println("1. Pour accéder aux options du livre");
            System.out.println("2. Pour accéder aux options des apprenants ");
            System.out.println("3. Sortie");
            System.out.println("_____________________________");
            System.out.print("Entrer votre choix : ");
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1:
                    livreOption();
                    break;
                case 2:
                    studentOption();
                    break;
                case 3:
                    System.out.println("Sortie...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (Choix != 3);

    }

    void livreOption() {
        int Choix;
        do {
            System.out.println("voici les options disponibles:");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Rechercher un livre");
            System.out.println("4. Afficher la liste des livres");
            System.out.println("5. Modifier les infos d'un livre");
            System.out.println("6. Retour ");
            System.out.println("_____________________________");
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
                    library.RechercherUnLivre();
                    break;
                case 4:
                    library.AfficherUnLivre();
                    break;
                case 5:
                    library.ModifierUnlivre();
                    break;
                case 6:
                    Main_Menu();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (Choix != 6);

    }



    void studentOption () {
        int Choix;
        do {
            System.out.println("voici les options disponibles:");
            System.out.println("1. Ajouter un apprenant");
            System.out.println("2. Supprimer un apprenant");
            System.out.println("3. Rechercher un apprenant");
            System.out.println("4. Afficher la liste des apprenants");
            System.out.println("5. Modifier les informations d'un apprenant");
            System.out.println("6. Retour ");
            System.out.println("_____________________________");
            System.out.print("Entrer votre choix : ");
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1:
                    library.AjouterUnApprenant();
                    break;
                case 2:
                    library.SupprimerUnApprenant();
                    break;
                case 3:
                    library.RechercherUnApprenant();
                    break;
                case 4:
                    library.AfficherUnApprenant();
                    break;
                case 5:
                    library.ModifierUnApprenant();
                    break;
                case 6:
                    Main_Menu();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (Choix != 6);
    }
}


