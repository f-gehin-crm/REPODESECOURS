import java.util.Scanner;




public class recherchedansuntableau {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

            System.out.println( "   HELLO WORLD    !!!!!");
            int Nbentrées;

            System.out.println( "Combien d'entrées allez vous effectuer  ?  : " );
            Nbentrées= sc.nextInt();



            /* Déclaration des variables */

            int [] Tableau = new int [Nbentrées+1];
            int i;
            int Position;
            int Valeursup;

            /* Saisies des données */


            for (i=0; i < Nbentrées; i++) 
            {
            System.out.println ("Entrez la " + (i+1) + "ème valeur  :  ");
            Tableau[i]= sc.nextInt();
            }

            /* Traitement */
            Position = 0;
            Valeursup = 0;
            Tableau[Nbentrées] = 0;
            for ( i=0 ; i < Nbentrées; i ++ )
            {
                if ( Tableau[i] > Valeursup)
                    {
                        Valeursup = Tableau[i];
                        Position = i;
                    }
            }

            /* rendu des resultats */

            System.out.println(" La plus haute valeur est " + Valeursup);
            System.out.println( "Elle est en position  :  " +(Position + 1));


        sc.close();
        System.exit(0);

    }
    
}
