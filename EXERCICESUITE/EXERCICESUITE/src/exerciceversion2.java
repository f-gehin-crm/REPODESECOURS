import java.util.Scanner;

public class exerciceversion2 {
    

    public static void main ( String[] args) {


    String [] question = new String [3];
    boolean [] rep = new boolean[3];
    int [] transition = new int [3];
    int i;
    Scanner sc = new Scanner(System.in);

    for (i=0; i<= question.length; i++) {

                System.out.println( question[i]);
                rep[i] = sc.nextInt() > 0;



    }



    }
}
