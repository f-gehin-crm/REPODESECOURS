import java.util.Scanner;

public class lescourses {
    
        /*  Écrire un algorithme qui permet de connaître ses chances de gagner au tiercé, quarté, quinté et autres
         impôts volontaires.

On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux messages affichés 
devront être :

Dans l’ordre : une chance sur X de gagner 
Dans le désordre : une chance sur Y de gagner 
X et Y nous sont donnés par la formule suivante: si n est le nombre de chevaux partants et p le nombre de chevaux 
joués (le signe ! signifie « factorielle ») :

X = n! / (n - p)! 
Y = n! / (p! * (n – p)!)
Cet algorithme peut être écrit d’une manière simple, mais relativement peu performante. Ses performances peuvent 
être singulièrement augmentées par une petite astuce. Vous commencerez par écrire la manière la plus simple,
 puis vous identifierez le problème, et écrirez une deuxième version permettant de d’améliorer les performances de l’algorithme.

Validez votre travail avec votre formateur avant de passer à la suite.

Exercices ABC */



   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in); 

        int nbp = 0;
        int nbj = 0;
        int A = 0;
        int I = 0;
        double X = 0;
        double Y = 0;
        double [][] FACT =new double [3][2];

        double A0 = nbp;
        double A1 = nbj;
        double A2 = nbp-nbj;

        System.out.println("\n" + "Combien de chevaux au départ  ?  : "  + "\n");
        nbp = sc.nextInt();
        System.out.println("\n" + " Combien de chevaux jouer vous  ?  :"  + "\n");
        nbj = sc.nextInt();


        FACT[0][0] = nbp;
        FACT[1][0] = nbj;
        FACT[2][0] = nbp-nbj;

        FACT[0][1] = 0;
        FACT[1][1] = 0;
        FACT[2][1] = 0;
        /* procédure factorielle */
        while ( A != 3) {
        
     
        int N = 1;
        for ( A=0; A<3; A++)  
                 {
            for ( I = 1; I<=FACT[A][0]; I++)
                         { N=N*I;}
                        FACT[A][1] =N;
                        N=1;
                 }
            I=1;
        for (I=0; I<=2; I++) {
        System.out.println("\n" + FACT[I][1]  + "\n");
         }

         X = FACT[0][1] / FACT[2][1] ;
         Y = FACT[0][1] / ( FACT[1][1] * FACT[2][1] ) ;

         System.out.println("\n" + "Une chance sur " + X + " de gagner dans l'ordre"  + "\n");

         System.out.println("\n" + "Une chance sur " + Y + " de gagner dans le désordre"  + "\n");













        sc.close();
        System.exit(0);
    }
    
}
}