import java.util.Scanner;

public class paiementetrendu {
    
   /* Écrire un algorithme qui demande à l’utilisateur de saisir des prix en € (nombre à 1 décimale) 
   correspondant aux achats d’un client. Lorsque l’utilisateur saisit le nombre 0, on estime que la saisie est terminée.
    Le programme calcule et affiche la somme totale à payer.

    On estime que le client paie uniquement avec des billets de 5€.
    
    Afficher ensuite :
    
    Le nombre de billets de 5€ qu’il doit donner pour payer la somme dûe.
    La somme à rendre par le magasin
    La répartition optimale des billets / pièces à rendre au client (pièces disponibles : 0.10€ 0.20€, 0.50€, 1€, 2€). 

Exemple :

Saisir un prix : 12.5
Saisir un prix : 9.3
Saisir un prix : 15.9
Saisir un prix : 0

Le client doit payer : 37.70 Euros.
Le client doit donner 8 billets de 5 Euros soit 40 Euros.
Rendu monnaie : 2.30 Euros
Répartition de la monnaie à restituer au client : 
- 1 pièce de 2 Euros
- 1 pièce de 0.20 Euros
- 1 pièce de 0.10 Euros

    */
  

   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in); 

        double PRIX = -1;
        double TOTAL = 0;
        double NOMBREDEBILLET = 0;
        double INFO = 0;
        double RENDUMONNAIE = 0;
        double RENDUMONNAIE2 = 0;
       /*  double A [] = new double [8]; */
        double [] A = {2,1,0.5,0.2,0.1,0.05,0.02,0.01};
        double NBTOKEN =0 ;
        int i = 0;



        /*Saisie des prix */

        while ( PRIX !=0) {
         System.out.println("\n" + "Veuillez entrer le prix : ");
        PRIX =sc.nextDouble();
        TOTAL = TOTAL + PRIX;
        }

        System.out.println("\n" + " Le client doit payer : "+ TOTAL + " Euros.");

        NOMBREDEBILLET = Math.ceil ( TOTAL/5);
        INFO = NOMBREDEBILLET*5;

        System.out.println("\n" + " Le client doit donner " + Math.floor(NOMBREDEBILLET) + " de 5 euros , soit "+ INFO + " Euros.");
        RENDUMONNAIE = INFO - TOTAL;
        RENDUMONNAIE2 = Math.ceil( RENDUMONNAIE*100000)/100000;

        System.out.println("\n" + " Rendu monnaie : " + RENDUMONNAIE2 + " Euros" + "\n");


        /* Calcul du rendu */
        System.out.println("\n" + " La répartition de la monnaie à restituer au client est : ");
        double RESTE = RENDUMONNAIE2;
      
        for (i=0; i<A.length; i ++) {

        NBTOKEN = Math.floor( RESTE / A[i]);
        System.out.println("\n" + NBTOKEN + " pièces de " + A[i] + " euros" );
        RESTE = RESTE - NBTOKEN*A[i];
        RESTE = Math.floor( RESTE*100000)/100000;






                                }       



        sc.close();
        System.exit(0);

    }
}