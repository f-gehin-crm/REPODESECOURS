import java.util.Scanner;

public class lesoperations {

    public static void main(String[] args) {

        // declaration des variables
        float nb1;
        float nb2;
        float resultat;
        String operation;

        Scanner sc = new Scanner(System.in);

        // Traitement

        resultat = 0f;
        System.out.println(" \n  HELLO  WORLD  !!!");
        System.out.println(" Entrez un nombre :  ");
        nb1=sc.nextInt();
        System.out.println(" Entrez un nombre :  ");
        nb2=sc.nextInt();

        sc.nextLine();

        System.out.println(" Choisissez une operation : \n  somme  -  soustraction  - multiplication  - division  ");
        operation = sc.nextLine();

        // Affichage des resultat




        switch (operation) {
            case "somme":
                
                    resultat= lesoperations.getsum(nb1, nb2);
                    
                break;

            case "soustraction":

                     resultat= lesoperations.getsous(nb1, nb2);
                    
                break;


            case "multiplication":

                     resultat= lesoperations.getmul(nb1, nb2);
                     
                break;

            case "division" :

                     resultat= lesoperations.getdiv(nb1, nb2);
                     
                break;
        
            default:

                System.out.println(" Vous avez fait une erreur, désolé");
                System.exit(0);
                break;
        }

        lesoperations.getresult(resultat);
    }

    public static float getsum(float nb1 , float nb2) {
            return nb1 + nb2;
                                            }

    public static float getsous(float nb1, float nb2) {
            return nb1 - nb2;               }
              
    public static float getmul(float nb1, float nb2) {
            return nb1*nb2;
                                            }
    public static float getdiv(float nb1, float nb2) {
            return nb1/nb2;
                                            }
    public static void getresult( float resultat){
            System.out.println( " Le résultat est  :  " + resultat);
                                            }


}
