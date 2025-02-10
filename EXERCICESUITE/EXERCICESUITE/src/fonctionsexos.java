
    import java.util.Scanner;



    public class fonctionsexos { 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello, Moon");
        System.out.println("Hello, Frédéric");
        System.out.println("\n");


        // Déclaration des variables 

        int A;
        int B;
        int result;

       Scanner sc = new Scanner(System.in);

       System.out.println( " Entrer entier 1 svp  :   ");
       A = sc.nextInt();

       System.out.println( " Entrer entier 2 svp  :   ");
       B = sc.nextInt();


       result = fonctionsexos.addition(A, B);
       System.out.println( " Le resultat est   :  " + result);


    sc.close();
    System.exit(0);
    
    
}
    

    public static int addition(  int entier1,  int entier2) {
            int somme;
            somme = entier1 + entier2;
            return somme;
        }


    
}



