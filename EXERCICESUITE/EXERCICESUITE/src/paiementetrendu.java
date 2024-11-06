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


        /*Saisie des prix */

        while ( PRIX !=0) {
         System.out.println("\n" + "Veuillez entrer le prix : ");
        PRIX =sc.nextInt();
        TOTAL = TOTAL + PRIX;
        }










        sc.close();
        System.exit(0);

    }
}