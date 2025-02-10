import java.util.Scanner;




public class alimenteruntableu {

   

    public static void main(String[] args) throws Exception {
   
        /* déclaration des variables */


        int N = 0;
        int pos = 0;
        int neg = 0;
        int zer = 0;
        int i = 0;
      
        Scanner  sc = new Scanner( System.in);

        System.out.println("Combien de valeurs voulez vous saisir ?  :  ");

        N = sc.nextInt();

        int TAB []= new int[N];


        /*  Saisie des valeurs */

        for( i=0; i<=(N-1); i++) 
            {   System.out.println( " Entrez la " + (i+1)+ "ème valeur  :  ");

                TAB[i] = sc.nextInt();

                if ( TAB[i]>0) 
                        { pos = pos +1; }
                if (TAB[i]==0 ) 
                         {zer = zer +1;}
                if (TAB[i]<0) 
                          {neg = neg +1;}


            }

        /* Affichage des résultats */

                System.out.println(" il y a "+ pos + " valeurs positives.");
                System.out.println( " il y a " + neg + " valeurs négatives");
                System.out.println( " Et "+ zer + " valeurs nulles" + "\n");
                System.out.println( " Voici le tableau  : " + "\n");

                for (i=0; i<N ; i++)
                {
                    System.out.print( TAB[i]+ "  ");
                }

                System.out.println("\n"+"\n");

                



sc.close();
System.exit(0);

    

}
}