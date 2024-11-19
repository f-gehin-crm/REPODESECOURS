import java.util.Scanner;

public class tableaulettre{
    


/*  Écrire un algorithme qui déclare et remplit un tableau contenant les six voyelles de l’alphabet latin. */



    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in); 

        String [] tableau = new String[6];
        int i = 0;


for(i=0; i<=5; i ++) {

        System.out.println("Entrez la voyelle " + (i+1) + "  :");
            tableau [i]= sc.nextLine();

                    }

 for( i=0; i<=5; i++) {
 System.out.print( tableau[i] +"  ");     
 }
 

 sc.close();
 System.exit(0);

    }

}
