public class exercicemikaelmardi {
    

    public static void Main ( String [] args) throws Exception {
        


        // Déclaration des variables

        String email;
        String [] basededonéeesEmails ;
        int nombreDadresse;
        basededonéeesEmails = new String[nombreDadresse];
        int tailleEmail;
        int nombrePJ;
        String [] PJ;
        int tailletotalePJ;
        int taillepiècesjointe [] = new int[nombrePJ-1];
        int i;
        int espacedisponibleutilisateur;

        
        boolean condition1;
        boolean condition2;
        boolean condition3;
        boolean activation;
        boolean envoi;


        // Traitement 

        for (i=0; i<nombreDadresse +1; i++) {

                                if (email ==basededonéeesEmails[i])
                    { condition1=true;}
                                               }

        for (i=0; i<= nombrePJ; i++)    {
            tailletotalePJ = tailletotalePJ + taillepiècesjointe[i];

                if (taillepiècesjointe[i] <= 25) { System.out.println( " Je l'envoie à l'antivirus");}

                                        }

        if ( tailletotalePJ + tailleEmail<= 200) { condition2 = true;}   //  La taille maximale d'un email est 200 Mo , pièces jointes comprises


        if ( tailletotalePJ + tailleEmail <=  espacedisponibleutilisateur )  { condition3 = true;}

        if ( activation == true) { System.out.println( " Envoyer le message d'absence");}


        if (condition1 & condition2 & condition3 == true )  { System.out.println( " Envoi du mail");}


        


        System.exit(0);
    }
}
