
import java.util.Scanner;

public class elections {
    
        /*Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.
Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage
 favorable (il participe au 
second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en
 tête au premier tour). */
  

   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in);

        /* Declaration des variables */

       int [] R = new int[4];
       String [] N = new String[4];
       int j = 0;
        int i = 0;
        int T = 0;
        String TEST ="";
        boolean B = false;

        /* Saisie des données */

        for (i=0 ; i<4 ; i++) { 
            j=j+1;
            System.out.println("\n" + "Entrez le nom du candidat " +j + " : "  + "\n"); 
              N [i] = sc.nextLine();
            System.out.println("\n" + "Entrez le score (en pourcentage) de monsieur " + N[i] + " : "  + "\n"); 
              R[i] = sc.nextInt();
              TEST = sc.nextLine();

                             }

        for (i=0 ; i<4 ; i++) { T = T+ R[i];}
        if ( T>100)      {  System.out.println("\n" + " IL Y A UN PROBLEME - ENTREES NON VALIDES - RELANCEZ LE PROGRAMME"  + "\n");
                          sc.close();
                          System.exit(0);
                              }

            /* Traitement du premier candidat */

                              /* Elu au premier tour */

        if ( R[0] > 50)  { System.out.println("\n" + " Monsieur " + N[0] + " est élu avec un score de " + R[0] + " % "+ "\n");
                            sc.close();
                            System.exit(0);
                         }


        if ( R[0] < 12.5)  { System.out.println("\n" + " Monsieur " + N[0] + " est battu , il ne va pas au second tour"+ "\n" + "BONNE CHANCE POUR LES PROCHAINES ELECTIONS" + "\n");
                            sc.close();
                            System.exit(0);
                            }


             /* Test pour le ballotage */

        if ( R[0]>= 12.5 & R[0]>=R[1] & R[0]>=R[2] & R[0]>=R[3]) { System.out.println("\n" + " Monsieur " + N[0] + " est en ballotage favorable pour le 2eme tour" + "\n");
                            sc.close();
                             System.exit(0);
                             }

                             else {System.out.println("\n" + " Monsieur " + N[0] + " est en ballotage défavorable"+ "\n");
                             sc.close();
                             System.exit(0);
                             }






    sc.close();
    System.exit(0);





    }
}