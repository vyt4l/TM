public class Noeud {
    int valeur;
    Noeud droit;
    Noeud gauche;


    public static Noeud creation(int valeur, int prof) {
        Noeud n = new Noeud();
        n.valeur = valeur;
        if (10.0*Math.random() > prof) {
            n.gauche = creation((int)(Math.random()*500.0), prof + 1);
        }
        if (10.0*Math.random() > prof) {
            n.droit = creation((int)(Math.random()*500.0), prof + 1);
    }
    return n;
    }
  
  public int sommearbr(){
    int sum = 0;
    sum += this.valeur;
    if(this.droit != null){
      sum += this.droit.sommearbr();
    }
    if(this.gauche != null){
      sum += this.gauche.sommearbr();
    }
    return sum;
  }
  public boolean bfs(int x){
    if (this.valeur == x) return true;
    if(this.droit != null && this.droit.bfs(x)){
      return true;
    }
    if(this.gauche != null && this.gauche.bfs(x)){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    Noeud n = creation(12,5);
    IO.println(n.sommearbr());
    IO.println(n.bfs(11));
  }
}
