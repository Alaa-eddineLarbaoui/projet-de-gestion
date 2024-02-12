import java.util.ArrayList;
import java.util.Scanner;

class Library {
    ArrayList<Book> booksListe = new ArrayList<>();
    ArrayList<Student> studentsListe = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    void AjouterUnLivre() {
        Book NBook = new Book();
        System.out.println("Ajout d'un livre...");
        System.out.print("Entrer le titre : ");
        NBook.titre = scanner.nextLine();
        System.out.print("Entrer l'auteur : ");
        NBook.Auteur = scanner.nextLine();
        System.out.print("Entrer l'ISBN : ");
        NBook.isbn = scanner.nextLine();
        System.out.print("Entrer la date de publication : ");
        NBook.publicationDate = scanner.nextLine();
        booksListe.add(NBook);
        System.out.println();
        System.out.println("----> Livre ajouté avec succès.");
        System.out.println("──────────────────────────────────────────────");
        System.out.println();


    }

    void AfficherUnLivre() {
        System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│              LISTE DES LIVRES                │");
        System.out.println("├──────────────────────────────────────────────┤");
        for (Book Nbook : booksListe) {
            System.out.println("│ Titre : " + Nbook.titre);
            System.out.println("│ Auteur : " + Nbook.Auteur);
            System.out.println("│ ISBN : " + Nbook.isbn);
            System.out.println("│ Date de publication : " + Nbook.publicationDate);
            System.out.println("├──────────────────────────────────────────────┤");
        }
        System.out.println("└──────────────────────────────────────────────┘");
    }

    void SupprimerUnLivre() {
        System.out.println("Veuillez entrer le nom du livre à supprimer : ");
        String searchname = new Scanner(System.in).nextLine();
        boolean check = false;
        for (int i = 0; i < booksListe.size(); i++) {
            if (booksListe.get(i).titre.equalsIgnoreCase(searchname)) {
                booksListe.remove(i);
                check = true;
                System.out.println();
                System.out.println("----> Le livre est supprimé avec succès.");
                System.out.println("──────────────────────────────────────────────");
                System.out.println();
            }
        }
        if (!check) {
            System.out.println("----> Le livre n'a pas été trouvé.");
            System.out.println("──────────────────────────────────────────────");
            System.out.println();
        }
    }

    void RechercherUnLivre() {
        int rech = -1;
        System.out.print("Veuillez entrer le titre du livre que vous recherchez: ");
        String searchname = new Scanner(System.in).nextLine();

        for (int i = 0; i < booksListe.size(); i++) {
            if (booksListe.get(i).titre.equalsIgnoreCase(searchname)) {
                rech = i;
            }

        }
        if (rech != -1) {
            System.out.println();
            System.out.println("Voilà, le livre a été trouvé :");
            System.out.println("├──────────────────────────────────────────────┤");
            System.out.println("│ Titre :" + booksListe.get(rech).titre);
            System.out.println("│ Auteur :" + booksListe.get(rech).Auteur);
            System.out.println("│ Isbn :" + booksListe.get(rech).isbn);
            System.out.println("│ Date de publication :" + booksListe.get(rech).publicationDate);
            System.out.println("├──────────────────────────────────────────────┤");


        } else {
            System.out.println("----> Le livre que vous avez essayé de trouver n'a pas été trouvé.");
            System.out.println("──────────────────────────────────────────────");
            System.out.println();

        }

    }


    void ModifierUnlivre() {
        System.out.println("Veuillez entrer le titre du livre à modifier : ");
        Scanner input = new Scanner(System.in);
        String Rech = input.next();
        Book book = booksListe.stream().filter(studs -> studs.titre.equalsIgnoreCase(Rech)).findFirst().orElse(null);
        if (book != null)
            book.modifyrUnlivre();
        else {
            System.out.println("----> L'étudiant n'a pas été trouvé");
            System.out.println("──────────────────────────────────────────────");
            System.out.println();
        }


    }


// les metodhes de la classe student


    void AjouterUnApprenant() {
        Student NStudent = new Student();
        //Book NBook = new Book();
        System.out.println("Ajout d'un Apprenant...");
        System.out.print("Entrer le Nom : ");
        NStudent.nom = scanner.nextLine();
        System.out.print("Entrer l'address : ");
        NStudent.Adresse = scanner.nextLine();
        System.out.print("Entrer l'id : ");
        NStudent.id = scanner.nextLine();
        System.out.print("Le nom de livre emprunter :");
        String bookReserve = new Scanner(System.in).nextLine();

        for (int i = 0; i < booksListe.size(); i++) {
            if (booksListe.get(i).titre.equalsIgnoreCase(bookReserve)) {
                NStudent.livre=booksListe.get(i).titre;
                studentsListe.add(NStudent);
                System.out.println("book has been successfully reserved!");
            } else {
                System.out.println("The book you want do not exist");
            }

        }
        System.out.println("──────────────────────────────────────────────");
        System.out.println();
    }

    void SupprimerUnApprenant() {
        System.out.print("Veuillez entrer le nom de l'apprenant à supprimer :");
        String searchname = new Scanner(System.in).nextLine();
        boolean check = false;
        for (int i = 0; i < studentsListe.size(); i++) {
            if (studentsListe.get(i).nom.equalsIgnoreCase(searchname)) {
                studentsListe.remove(i);
                check = true;
                System.out.println("----> L'apprenant  est supprimé avec succès.");
                System.out.println("──────────────────────────────────────────────");
                System.out.println();
            }
        }
        if (!check) {
            System.out.println("----> Le nom de l'apprenant n'a pas été trouvé");
            System.out.println("──────────────────────────────────────────────");
            System.out.println();

        }
    }

    void RechercherUnApprenant() {
        int rech = -1;
        System.out.print("Veuillez entrer le nom de l'apprenant que vous recherchez : ");
        String searchname = new Scanner(System.in).nextLine();

        for (int i = 0; i < studentsListe.size(); i++) {
            if (studentsListe.get(i).nom.equalsIgnoreCase(searchname)) {
                rech = i;
            }

        }
        if (rech != -1) {
            System.out.println();
            System.out.println("Voilà, le nom de l'apprenant a été trouvé :");
            System.out.println("├──────────────────────────────────────────────┤");
            System.out.print("│ Le Nom du Livre :" + studentsListe.get(rech).livre);
            System.out.print("│ Le Nom :" + studentsListe.get(rech).nom);
            System.out.print("│ L'Address :" + studentsListe.get(rech).Adresse);
            System.out.print("│ L'Id :" + studentsListe.get(rech).id);
            System.out.println("├──────────────────────────────────────────────┤");
            System.out.println();

        } else {
            System.out.println("----> Le nom de l'apprenant que vous avez essayé de trouver n'a pas été trouvé.");
            System.out.println("──────────────────────────────────────────────");
            System.out.println();
        }

    }

    void AfficherUnApprenant() {
        if (studentsListe.isEmpty()) {
            System.out.println("--->La liste des apprenants est vide. ");
            System.out.println("------------------------------");
        } else {
            System.out.println("Voici la liste des Livres emprunter :");
            for (int i = 0; i < studentsListe.size(); i++) {
                System.out.println();
                System.out.println("├──────────────────────────────────────────────┤");
                System.out.println("│ Le nom du Livre:" + studentsListe.get(i).livre);
                System.out.println("│ Le nom :" + studentsListe.get(i).nom);
                System.out.println("│ L'addresse :" + studentsListe.get(i).Adresse);
                System.out.println("│ L'id:" + studentsListe.get(i).id);
                System.out.println("├──────────────────────────────────────────────┤");

            }
        }

    }


    void ModifierUnApprenant() {
        System.out.print("Veuillez entrer le nom de l'apprenant à modifier :");
        Scanner input = new Scanner(System.in);
        String Rech = input.next();
        Student student = studentsListe.stream().filter(studs -> studs.nom.equalsIgnoreCase(Rech)).findFirst().orElse(null);
        if (student != null)
            student.modifystudent();
        else {
            System.out.println("----> Étudiant non trouvé.");
            System.out.println("──────────────────────────────────────────────");
            System.out.println();


        }



    }
}