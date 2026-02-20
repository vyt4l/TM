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

  public int hoelessdesc() {
    int res = 0;
    if (this.enfants.length != 0) {
      for (int i = 0; i < this.enfants.length; i++) {
        res += this.enfants[i].hoelessdesc();
      }
    } else {
      return 1;
    }
    return res;
  }

  public int nbdesc() {
    int res = 0;
    if (this.enfants.length != 0) {
      for (int i = 0; i < this.enfants.length; i++) {
        res++;
        res += this.enfants[i].nbdesc();
      }
    }
    return res;
  }
  
  public int Pdepth() {
    int res = 1;
    if (this.enfants.length != 0) {
      for (int i = 0; i < this.enfants.length; i++) {
        res++;
        if (this.enfants[i].Pdepth() > res){
          if (i != 0) res -= this.enfants[i-1].Pdepth();
          res += this.enfants[i].Pdepth();
          }
        }
      }
    return res;
  }

  public static void main(String[] args) {
    Personne p = creationFamille(1950);
    IO.println(p.nbdesc());
    IO.println(p.hoelessdesc());
    IO.println(p.Pdepth());
  }
}
