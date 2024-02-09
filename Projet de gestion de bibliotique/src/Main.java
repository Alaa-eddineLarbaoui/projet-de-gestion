class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Accueil();
        menu.handleUserInput();


    }

    public static void Accueil() {
        System.out.println("Bienvenue dans le programme de gestion de bibliotheque !");
        System.out.println("======================================================");
        System.out.println("Cette application vous permet de gerer la collection de livres de la bibliotheque.");
        System.out.println("Vous pouvez ajouter, supprimer et rechercher des livres.");
        System.out.println("Profitez de votre experience à la bibliotheque !");
        System.out.println();
        System.out.println();
    }
}
