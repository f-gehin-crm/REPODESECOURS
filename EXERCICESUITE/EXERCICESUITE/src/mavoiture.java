public class mavoiture {
        public static void main(String[] args) {

            // Declaration des variables 

            int[] A = new int[2];
            String[] B = new String[2];


            // Création d'un objet Voiture avec le constructeur classique
            umlvoiture maVoiture = new umlvoiture("Peugeot", 2024, 4, "Essence", true, false, false, true , 230);
     
            // Affichage des informations de la voiture
            System.out.println(maVoiture.toString());
     
            // Démarrage de la voiture
            maVoiture.demarrer();
     
            // Faire avancer la voiture
            maVoiture.avancer();
     
            // Faire ralentir la voiture
            maVoiture.ralentir();
     
            // Arrêter la voiture
            maVoiture.stopper();
     
            // Clonage de la voiture
            umlvoiture mavoitureClonee = (umlvoiture) maVoiture.clone();
     
            // Affichage des informations de la voiture clonée
            System.out.println(mavoitureClonee.toString());

            // Création d'un objet Voiture avec le constructeur classique
            umlvoiture maVoiture2 = new umlvoiture("Fiat", 2023, 5, "Essence", true, false, false, true, 250);
     
            // Affichage des informations de la voiture
            System.out.println(maVoiture2.toString());
     
            // Démarrage de la voiture
            maVoiture2.demarrer();
     
            // Faire avancer la voiture
            maVoiture2.avancer();
     
            // Faire ralentir la voiture
            maVoiture2.ralentir();
     
            // Arrêter la voiture
            maVoiture2.stopper();
     
            // Clonage de la voiture
            umlvoiture mavoiture2Clonee = (umlvoiture) maVoiture.clone();
     
            // Affichage des informations de la voiture clonée
            System.out.println(mavoitureClonee.toString());

            // Recuperation des vitesses
                A[0] = maVoiture.getVitesse();
                A[1] = maVoiture2.getVitesse();

            // Recuperation des marques
                B[0] = maVoiture.getMarque();
                B[1] = maVoiture2.getMarque();  


             // Resultat de la course 
             
             if ( A[0] > A[1])  { System.out.println( " C'est la " + B[0] + " qui gagne la course, victoire !!");}
                                else { System.out.println( " C'est la" + B[1] + " qui gagne la course, victoire !!");}


            System.exit(0);


        }


    }

