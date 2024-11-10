
/*Écrivez un algorithme qui demande à l’utilisateur de saisir 3 nombres entiers

Un numéro de jour
Un numéro de mois
Un numéro d’année
L’algorithme indique ensuite s’il s’agit ou non d’une date valide.

Il n’est sans doute pas inutile de rappeler que le mois de février compte 28 jours,
 sauf si l’année est bissextile, auquel cas il en compte 29.

L’année est bissextile si elle est divisible par quatre. 
Toutefois, les années divisibles par 100 ne sont pas bissextiles,
 mais les années divisibles par 400 le sont. Ouf !*/







import java.util.Scanner;

public class validitédunedate {
    

  

   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + "Hello, World!"  + "\n");
        int JOURS = 0;
        int MOIS = 0;
        int ANNEE = 0;
        boolean A = false;
        Scanner sc = new Scanner(System.in);

        
        System.out.println(" Entrez les jours  ( 0-31) : ");
        JOURS = sc.nextInt();
        while ( JOURS <1 || JOURS > 31)  { System.out.println("ENTREZ UN JOUR VALIDE SVP");
                                             System.out.println(" Entrez le jours  ( 0-31) : ");
                                            JOURS = sc.nextInt(); }

        System.out.println(" Entrez le mos  ( 1 - 12) : ");
        MOIS =  sc.nextInt();
        while ( MOIS <1 || MOIS > 12)  { System.out.println("ENTREZ UN MOIS VALIDE SVP");
                                             System.out.println("  Entrez le mos  ( 1 - 12) : ");
                                            MOIS = sc.nextInt(); }

        System.out.println(" Entrez une année ( -10000  -  10000) : ");
        ANNEE = sc.nextInt();
        while ( ANNEE < -10000 || ANNEE > 10000)  { System.out.println("ENTREZ UNE ANNEE VALIDE SVP");
                                             System.out.println(" Entrez l' année ( -10000  -  10000) : ");
                                            ANNEE = sc.nextInt(); }


                /* test bisextile */
                if ( ANNEE%4==0 && ANNEE%400 !=0  || ANNEE%100 == 0) { A = true;}  else {A = false;}


                if ( JOURS>28 && MOIS == 2 && A == false) { System.out.println("ENTREZ UNE DATE VALIDE SVP - L' ANNEE N'EST PAS BISEXTILE");}

                 { System.out.println(" LA DATE EST VALIDE ");}
                
        sc.close();
        System.exit(0);
}
}