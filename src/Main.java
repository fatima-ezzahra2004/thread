public class Main {
    public static void main(String[] args) {

        Compteur compteur = new Compteur(); // ressource partagée

        Thread t1 = new Thread(new tache("Thread A", compteur));
        Thread t2 = new Thread(new tache("Thread B", compteur));
        Thread t3 = new Thread(new tache("Thread C", compteur));

        t1.start();
        t2.start();
        t3.start();
    }
}
