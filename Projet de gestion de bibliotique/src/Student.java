import java.util.Scanner;

public class Student {
    String nom;
    String Adresse;
    String id;
    String livre;
    void modifystudent(){
        Scanner input =new Scanner(System.in);
        System.out.print("Nouveau Nom :");
        this.nom=input.next();
        System.out.print("Nouveau Address :");
        this.Adresse=input.next();
        System.out.print("Nouveau ID :");
        this.id=input.next();
        System.out.print("Nouveau Livre :");
        this.livre=input.next();
        System.out.println("----> Les modifications sont bien enregistrées.");
        System.out.println("──────────────────────────────────────────────");
        System.out.println();

    }
}


