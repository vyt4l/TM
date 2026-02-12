public class Personne {
    String nom;
    int anneeDeNaissance;
    Personne[] enfants;

    public Personne(String nom, int anneeDeNaissance, int nbfils) {
        this.nom = nom;
        this.anneeDeNaissance = anneeDeNaissance;
        this.enfants = new Personne[nbfils];
    }

    public static Personne creationFamille(int annee) {
        double prob = annee / 4000.0;
        double r = Math.random();
        int nbfils = (2 * r > prob) ? (int) (5.0 * (2 * r - prob)) : 0;
        Personne personne;
        if ((annee + 25 + nbfils) < 2025) {
            personne = new Personne("Personne: " + annee, annee, nbfils);
            for (int i = 0; i < nbfils; i++) {
                personne.enfants[i] = creationFamille(annee + 25 + i);
            }
        } else {
            personne = new Personne("Personne: " + annee, annee, 0);
        }

        return personne;
    }

    public static void main(String[] args) {
        Personne p = creationFamille(1950);

    }
}
