import java.util.Scanner;

public class tableaudentiers {
    
        /*  Écrire un algorithme qui déclare un tableau d’entiers et le remplit avec 8 valeurs numériques en les mettant toutes à zéro. */



   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in); 

        int [] tableau = new int[8];
        int i = 0;

        System.out.println("\n" + " Entrez 8 entiers : "  + "\n");

            for ( i=0; i<8;i++) {
                tableau[i] = sc.nextInt();
            }

            for ( i=0; i<8;i++) {
                System.out.print( tableau[i]);

            }




        sc.close();
        System.exit(0);

    }
}