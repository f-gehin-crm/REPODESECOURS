import java.util.Scanner;




public class modifieruntableau {
    

                public static void main( String[] args) throws Exception {


                  /* déclaration des variables */

                        Scanner sc = new Scanner(System.in);
                        int N= 1;
                        int i;
                        String Prénom;
                        int Age;
                        int Tableau[] = new int [N];
                        int TableauRésult[] = new int [N];




                    /* Saisie des données */


                        System.out.println ("Combien d'entiers voulez saisir  :  ");
                        N= sc.nextInt();
                        sc.nextLine();
                        System.out.println ( " Quel est votre prénom ?  :  ");
                        Prénom = sc.nextLine();
                        System.out.println( " Quel est votre aga ?  :  ");
                        Age = sc.nextInt();
                        System.out.println( " Passons aux choses sérieures...");



                    /*  Traitement */    

                        for(i=0; i<N; i++)  {

                                System.out.println( " Entrez la " + (N+1) + "valeur  :  ");
                                Tableau[i] = sc.nextInt();
                                TableauRésult[i] = Tableau[i] + 1;

                                             }

                        System.out.println( " MERCI !!!!!!");


                    /* restitution */    

                        System.out.println( " Voici le résultat  :  " + "\n");

                        for (i=0; i<N; i++)  {

                            System.out.print("  " + Tableau[i]);

                                              }
                        System.out.println(" VOUS EN VOULEZ ENCORE " + Prénom + " " + Age + " ANS  ??.......");


























            sc.close();
            System.exit(0);


                }

}
