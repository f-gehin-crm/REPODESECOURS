import java.util.Scanner;

public class fonctionshelloname {


    public static void main ( String[] args) throws Exception {


                /* Créer un projet HelloName.
Le programme demande à l’utilisateur de saisir son prénom.
Le programme affiche ensuite “Bienvenue “ suivi du prénom saisi.
1 fonction askFirstName servira à demander le prénom à l’utilisateur.
1 procédure showFirstName accceptant 1 argument de type String affichera le résultat. */



     //  Declaration des variables

        String Prenom;
        Scanner sc = new Scanner(System.in);




        // Traitement

        System.out.println( " Entrez votre prénom svp   :  ")

        sc.close();
    
    }

    // Première fonction 

        public static String entree()  {
            System.out.println( " Entrez votre prénom svp   :  ");
                String prenom = sc.nextLine();
            sc.close();
        }

        public static String Affichage( String prenom) {
            System.out .println( " \n" + prenom);
            return prenom;
        }

    
}
