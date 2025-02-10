import java.util.Scanner;




public class sommedetableaux {

            public static void main( String[] args) throws Exception {

                Scanner sc = new Scanner (System.in);

                int A [] = new int[10];
                int B [] = new int[10]; 
                int C [] = new int[10];

                int N=10;
                int i = 0;
                sc.close();
                for( i=0; i<=(N-1); i++) 

                {   System.out.println( " Entrez la " + (i+1) + "ème valeur du tablaeu A  :  ");
                    A[i] = sc.nextInt();

                    System.out.println( "Entrz la " + (i+1) + " ème valeur du tableau B  :  ");
                    B[i] = sc.nextInt();

                    C[i] = A[i] + B[i];

                }

                System.out.println(  "Voici le résultat" + "\n" );
                System.out.println( "TABLEAU A  :") ;
                  for ( i=0; i<=(N-1); i++) {System.out.print ( A[i]+ " ");}
                System.out.println( "\n" + "TABLEAU B  :") ;
                  for ( i=0; i<=(N-1); i++) {System.out.print ( B[i]+ " ");}
                System.out.println( " \n" + "Résultat  :  ") ;
                  for ( i=0; i<=(N-1); i++) {System.out.print ( C[i]+ " ");}






                
                System.exit(0);
            }


            
}
