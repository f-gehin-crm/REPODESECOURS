import java.util.Scanner;

import javax.sound.midi.SysexMessage;

    /*  Créer un projet “IntroFonctionsChaines”.
Implémenter les 4 fonctions demandées ci-dessous.
Appeler ces 4 fonctions depuis le main.
Afficher les différents résultats à l’aide d’une procédure.
Créer une fonction « getMC2 ».

Cette fonction doit retourner Le nom de l’inventeur de la formule « E = MC² ».
Créer une fonction « getUserName » qui accepte deux arguments (prénom et nom) de type string.

Cette fonction doit retourner la concaténation des deux valeurs.
Exemple : IntroFonctionsChaines.getUserName ('mickaël', 'devoldère'); // retourne « mickaëldevoldère »
Créer une fonction « getFullName » acceptant deux arguments (nom et prénom) de type string.

Cette fonction doit retourner la concaténation des deux valeurs avec un espace entre les 2.
Assurez vous que :
Le prénom doit être en minuscule (sauf la 1ère lettre qui doit être en MAJUSCULE).
Le nom doit être en MAJUSCULE.
Exemple : getFullName ('devoldère', 'mickaël'); // retourne « Mickaël DEVOLDÈRE »
Créer une fonction « askUser » acceptant deux arguments (nom et prénom) de type string.

Cette fonction doit retourner une chaîne de caractères sous la forme :
« Bonjour Prénom NOM. Connaissez-vous Einstein ? »
Cette fonction doit obligatoirement appeler et utiliser les résulats des fonctions précédentes :
« getFullName() » pour obtenir la concaténation du prénom et du nom.
« getMC2() » pour obtenir le nom de l’inventeur de la formule E = MC².
Exemple : askUser ('devoldère', 'mickaël'); // retourne « Bonjour Mickaël DEVOLDÈRE, connaissez-vous Einstein ? »
Validez votre travail avec votre formateur avant de passer à la suite. */



public class leschainesdecaractères {
   
    public static void main(String[] args) throws Exception {
        System.out.println("\n" + " Hello, World !!!!"  + "\n");

        Scanner sc = new Scanner(System.in); 

    
        // declaration des variables 

        String affichage;
        String prenom = "";
        String nom = "";



        // main

        affichage = "Albert Einstein";

        leschainesdecaractères.getMC2( affichage);

        leschainesdecaractères.getUsername(  prenom , nom );
                affichage = " Enchanté " + prenom +" "+nom;
                leschainesdecaractères.getMC2( affichage);

}

public static void getMC2( String affichage){
   
    System.out.println( " \n   " + affichage);
}

public static String getUsername( String prenom , String nom ){
    Scanner sc = new Scanner(System.in);
    System.out.println( " \n  Veuillez entrer votre prenom svp   :  ");
    prenom = sc.nextLine() ;
    System.out.println(  " \n  veuillez entrer votre nom svp  :  ");
    nom = sc.nextLine();

}




}