public class tache implements Runnable {

    private Compteur compteur;  // ressource partagée
    private String nom;

    public tache(String nom, Compteur compteur) {
        this.nom = nom;
        this.compteur = compteur;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            // LIRE la valeur
            if (compteur.getValeur() > 0) {

                try {
                    Thread.sleep(200); // simule un traitement
                } catch (InterruptedException e) {}

                // MODIFIER la valeur
                compteur.decrementer();

                System.out.println(nom + " → nouvelle valeur = " + compteur.getValeur());
            }
        }
    }
}
