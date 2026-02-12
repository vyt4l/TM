public class SerieVoiture {
    String modele;
    int anneeDebutProduction;
    int anneeFinProduction;
    int productionParAn;
    SerieVoiture modeleSuivant;

    public SerieVoiture(String modele, int anneeDebutProduction, int anneeFinProduction, int productionParAn) {
        this.modele = modele;
        this.anneeDebutProduction = anneeDebutProduction;
        this.anneeFinProduction = anneeFinProduction;
        this.productionParAn = productionParAn;

    }

    public static SerieVoiture creationSerieVoiture() {
        SerieVoiture[] s = new SerieVoiture[9];
        s[0] = new SerieVoiture("201", 1929, 1937, 17789);
        s[1] = new SerieVoiture("202", 1938, 1949, 12702);
        s[2] = new SerieVoiture("203", 1948, 1960, 58322);
        s[3] = new SerieVoiture("204", 1965, 1976, 145845);
        s[4] = new SerieVoiture("205", 1982, 1998, 329894);
        s[5] = new SerieVoiture("206", 1998, 2006, 1500000);
        s[6] = new SerieVoiture("207", 2006, 2014, 512500);
        s[7] = new SerieVoiture("208 I", 2012, 2020, 343750);
        s[8] = new SerieVoiture("208 II", 2019, 2023, 269032);
        for (int i = 0; i < s.length - 1; i++) {
            s[i].modeleSuivant = s[i + 1];
        }
        return s[0];
    }

    public String toString(){
      String res = "La voiture du modèle " 
                    + this.modele 
                    + " a commencé a être produite en "
                    + this.anneeDebutProduction 
                    + " a fini d'être produite en "
                    + this.anneeFinProduction
                    + " et a été produite "
                    + this.productionParAn
                    + " fois par an";
      if(this.modeleSuivant == null) return res + ".\n";
      else return res + ", elle a été suivie de :\n" +this.modeleSuivant.toString();
    }

    public int nbtout(){
      if(this.modeleSuivant == null) return this.productionParAn * (this.anneeDebutProduction - this.anneeFinProduction);
      else return this.productionParAn * (this.anneeFinProduction - this.anneeDebutProduction) + this.modeleSuivant.nbtout();
    }

    public static void main(String[] args) {
        SerieVoiture s = creationSerieVoiture();
        IO.println(s);
        IO.println(s.nbtout() + " voitures on été produites dans la série 20X depuis 1929.");
    }
}
