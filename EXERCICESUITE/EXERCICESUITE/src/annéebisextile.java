import java.util.Scanner;


/*Ecrire un algorithme qui détermine si une année est bissextile.

Les années bissextiles sont :

les années divisibles par 4 mais non divisibles par 100
les années divisibles par 400. */

public class annéebisextile {


   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "Hello, World!" + "\n" + " Hello, Moon" + "\n" + "Hello Frédéric" + "\n");
        System.out.println("\n" + " Entrez une année : " + "\n");

        Scanner sc = new Scanner(System.in);
        int ANNEE = 0;
        ANNEE = sc.nextInt();

        if ( ANNEE%4==0 && ANNEE%400 !=0  || ANNEE%100 == 0) { System.out.println("\n" + ANNEE + " est bisextile");}

      
            else {System.out.println("\n" + ANNEE + " n'est pas bisextile");}


            sc.close();
            System.exit(0);

    }
}