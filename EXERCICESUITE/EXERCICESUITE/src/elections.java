
import java.util.Scanner;

public class elections {
    

  

   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "Hello, World!"  + "\n");

        Scanner sc = new Scanner(System.in);

       int [] R = new int[3];
        int i = 0;

        for (i=0 ; i<5 ; i++) {  System.out.println("\n" + "Entrez le score du candidat " +i + " : "  + "\n"); 

            R[i] = sc.nextInt();

    }

    sc.close();
    System.exit(0);





    }
}