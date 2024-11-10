import java.util.Scanner;

public class tarifassurance {
    
        /*  Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, 
        du moins au plus onéreux :

        Tarifs bleu, vert, orange et rouge.
        Le tarif dépend de la situation du conducteur :
        
        Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge,
         si toutefois il n’a jamais été responsable d’accident. Sinon, la compagnie refuse de l’assurer.
        
        Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis
         depuis moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable 
         d’un accident, sinon il est refusé.
        
        Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert 
        s’il n’est à l’origine d’aucun accident et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà
        
        De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la couleur immédiatement la plus avantageuse
         s’il est assuré depuis plus de cinq ans. Ainsi, s’il satisfait à cette exigence, un client normalement “vert” devient “bleu”, 
         un client normalement “orange” devient “vert”, et le “rouge” devient orange.
        
        Ecrire l’algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce problème.
         Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s’apercevoir qu’il est plus simple
          qu’il n’en a l’air (cela s’appelle faire une analyse !)…
        
        Exercices ABC */
  

   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in); 

        int AGE = 0;
        int DUREE =0;
        int ACCIDENT = 0;
        int TARIFACTUEL = 0;
        int COMPTEUR = 0;

       /* String [] CODETARIF = new String[5];*/
        String [] CODETARIF = {"Rouge","Orange","Vert","Bleu"};


       /*  String [] CODECOULEUR = new String[5];
        int [] DONNEES;
        String [] ATTRIBUTSDONNEES; */

        System.out.println("\n" + " Quel est votre age ? : "  + "\n");
        AGE = sc.nextInt();
        if ( AGE > 25) {COMPTEUR = COMPTEUR +1;}

        System.out.println("\n" + " Vous avez le permis depuis combien d'années ? :"  + "\n");
        DUREE = sc.nextInt();
        if ( DUREE > 2) { COMPTEUR = COMPTEUR + 1;}

        System.out.println("\n" + " Combien avez vous eu d'accident(s) ? : "  + "\n");
        ACCIDENT = sc.nextInt();
        COMPTEUR = COMPTEUR - ACCIDENT;

        System.out.println("\n" + " Etiez vous assuré l'année dernière ? ( 1=oui ; 0 = non ) ? : "  + "\n");
        TARIFACTUEL = sc.nextInt();

        COMPTEUR = COMPTEUR + TARIFACTUEL;

            if ( COMPTEUR < 0) {
                System.out.println("\n" + " NOUS NE POUVONS PAS VOUS ASSURER ,  DESOLE ");
                sc.close();
                System.exit(0);
            }

        System.out.println("\n" + " Vous êtes au tarif : "+ CODETARIF[COMPTEUR]  + "\n");

        sc.close();
        System.exit(0);
    }
}
