
    
    public class umlvoiture implements Cloneable{
 
        // Atributs
        private String marque;
        private int annee;
        private int nbRoues;
        private String typeCarburant;
        private boolean moteur;
        private boolean contact;
        private boolean accelerateur;
        private boolean frein;
        private int vitesse;
 
        //Constructeur par defaut
        public umlvoiture() {
    }
        //Constructeur classique
        //This. sert à indiquer un objet particulier
    public umlvoiture(String marque, int annee, int nbRoues, String typeCarburant, boolean moteur, boolean contact, boolean accelerateur,
     boolean frein, int vitesse) {
        this.marque = marque;
        this.annee = annee;
        this.nbRoues = nbRoues;
        this.typeCarburant = typeCarburant;
        this.moteur = moteur;
        this.contact = contact;
        this.accelerateur = accelerateur;
        this.frein = frein;
        this.vitesse = vitesse;
    }
    public Object clone(){
        Object o = null;
        try {
            /* On récupère l'instance à renvoyer par l'appel de la
            méthode super.clone()*/
            o = super.clone();
        } catch (CloneNotSupportedException cnse) {
            /*Ne devrait jamais arriver, car nous implémentons
            l'interface Cloneable*/
            cnse.printStackTrace(System.err);
        }
        // on renvoie le clone
        return o;
    }
        // Méthode toString pour afficher tous les attributs de l'objet
    public String toString() {
        return "Voiture [marque=" + marque + ", annee=" + annee + ", nbRoues=" + nbRoues + ", typeCarburant="
                + typeCarburant + ", moteur=" + moteur + ", contact=" + contact + ", accelerateur=" + accelerateur
                + ", frein=" + frein + ", vitesse = " + vitesse +"]";
    }
        // Vérifie que la voiture est démarree
    public void demarrer() {
        if (contact == false) {
            this.contact = true;
            System.out.println("La voiture est mainteant démarrée");
        } else {
            System.out.println("La voiture est déjà démarrée");
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

