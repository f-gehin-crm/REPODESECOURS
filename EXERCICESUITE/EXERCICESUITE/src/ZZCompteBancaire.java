public class ZZCompteBancaire {

// Attributs

    private int numeroCompte;
    private String nomClient;
    private double solde;
    private double decouvertAutorise;

// Constructeur par defaut 

    public ZZCompteBancaire () {

    }

//  Constructeur Classique 

    public ZZCompteBancaire ( int numeroCompte, String nomClient, double solde, double decouvertAutorise) {

        this.numeroCompte=numeroCompte;
        this.nomClient = nomClient;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

// Constructeur par clonage

    public ZZCompteBancaire ( ZZCompteBancaire compteC1) {
        this.numeroCompte = compteC1.numeroCompte;
        this.nomClient = compteC1.nomClient;
        this.solde = compteC1.solde;
        this.decouvertAutorise = compteC1.decouvertAutorise;
    }

// Methode to String

    public String toString() {
        String result;
        result = "\n####################################";
        result += "\n# numero = " + numeroCompte;
        result += "\n# client = " + nomClient;
        result += "\n# solde = " + solde;
        result += "\n# montant du découvert autorisé = " + decouvertAutorise;
        result += "\n####################################";
        return result;
    }
    
}