import java.util.Scanner;

public class lesoperations {

    public static void main(String[] args) {

        // declaration des variables
        int nb1;
        int nb2;
        int resultat;
        String operation;

        Scanner sc = new Scanner(System.in);

        // Traitement


        System.out.println(" \n  HELLO  WORLD  !!!");
        System.out.println(" Entrez un entier :  ");
        nb1=sc.nextInt();
        System.out.println(" Entrez un entier :  ");
        nb2=sc.nextInt();

        sc.nextLine();

        System.out.println(" Choisissez une operation : \n  somme  -  soustraction  - multiplication  - division  ");
        operation = sc.nextLine();

        switch (operation) {
            case "somme":
                
                    resultat= lesoperations.getsum(nb1, nb2);
                    lesoperations.getresult(resultat);

                break;

            case "soustraction":

                     resultat= lesoperations.getsous(nb1, nb2);
                     lesoperations.getresult(resultat);
                break;


            case "multiplication":

                     resultat= lesoperations.getmul(nb1, nb2);
                     lesoperations.getresult(resultat);

                break;

            case "division" :

                     resultat= lesoperations.getdiv(nb1, nb2);
                     lesoperations.getresult(resultat);

                break;
        
            default:

                System.out.println(" Vous avez fait une erreur, désolé");
                System.exit(0);
                break;
        }

    }

    public static int getsum(int nb1 , int nb2) {
            return nb1 + nb2;
                                            }

    public static int getsous(int nb1, int nb2) {
            return nb1 - nb2;               }
              
    public static int getmul(int nb1, int nb2) {
            return nb1*nb2;
                                            }
    public static int getdiv(int nb1, int nb2) {
            return nb1/nb2;
                                            }
    public static void getresult( int resultat){
            System.out.println( " Le résultat est  :  " + resultat);
                                            }

}
