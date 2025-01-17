import java.util.Scanner;


import java.util.Scanner;


public class CompteBancaire {
  
    
    
    // Atributs
      private int numero;
      private String nom;
      private float solde;
      private float decouvertAutorise;
      private float montant;
     


      //Constructeur par defaut
      public  CompteBancaire() {
      }
      //Constructeur classique
      //This. sert à indiquer un objet particulier
  public CompteBancaire ( int numero , String nom, float solde, int decouvertAutorise ) {
  
      this.numero = numero;
      this.nom = nom;
      this.solde = solde;
      this.decouvertAutorise = decouvertAutorise;
    
  }


 /*  public Object clone(){
      Object o = null;
      try {
          /* On récupère l'instance à renvoyer par l'appel de la
          méthode super.clone()
          o = super.clone();
      } catch (CloneNotSupportedException cnse) {
          /*Ne devrait jamais arriver, car nous implémentons
          l'interface Cloneable
          cnse.printStackTrace(System.err);
      }
      // on renvoie le clone
      return o;
  } */



      // Méthode toString pour afficher tous les attributs de l'objet
  public String toString() {
      return "Compte courant " + "\n" + "nom :" + nom + "\n" + "numero : " + numero + "\n"+ "solde = " + solde + "\n" + "découvert autorisé = " 
                + decouvertAutorise + "\n";
  }
              
      // Crediter le compte :
  public void crediter(float montant) {


    /*          Scanner sc = new Scanner(System.in);   à mettre dans le main, puis récupérer la valeur de votre scanner insérer dans la variable montant */


      /* System.out.println("De combien voulez vous créditer ?  :  ");
       montant = sc.nextFloat; */
       solde = solde + montant;
       System.out.println( " le solde est maintenant de  :  " +solde);
  }

public boolean debiter ( float montant) { 
     if ( solde - montant >= decouvertAutorise) {  solde = solde- montant ; return true;}
        else { System.out.println("Solde insuffisant"); return false;}
}

public boolean transferer ( CompteBancaire c1 , CompteBancaire c2 , float montant ) {
    boolean flag;
    flag = c1.debiter(montant);
     if ( flag = true) {c2.crediter(montant); return true;}
        else { return false;}
}

public boolean comparer ( CompteBancaire c1 , CompteBancaire c2) {
     if ( c2.solde > c1.solde) { return true;}
        else { return false;}
}

}










      // Vérifie que la voiture est stoppee
  public void stopper() {
      if (contact == true) {
          this.contact = false;
          System.out.println("La voiture est maintenant à l'arrêt");
      } else {
          System.out.println("La voiture est déjà à l'arrêt");
      }
  }
      // Vérifie que la voiture avance
  public void avancer() {
      if (contact == true) {
          this.frein = false;
          this.accelerateur = true;
          System.out.println("La voiture avance");
      } else {
          System.out.println("La voiture n'est pas démarrée");
      }
  }
      // Vérifie que la voiture freine
  public void ralentir() {
      if (contact == false) {
          this.accelerateur = false;
          this.frein = true;
          System.out.println("La voiture freine");
      } else {
          System.out.println("La voiture n'est pas démarrée");
      }
  }

      // Affiche la vitesse max
  public void vit() {
      System.out.println( " La vitesse maximum est :" + vitesse);
  }

      // creation des getters

      public int getVitesse() {
          return this.vitesse;
      }

      public String getMarque() {
          return this.marque;
      }







}

