public class Wagon {
  String type;
  int nombreDePlaces;
  Wagon prochain;
	
	public Wagon (String type, int nombreDePlaces) {
    this.nombreDePlaces = nombreDePlaces;
    this.type = type;
	}

  public static Wagon TrainCreation() {
  Wagon first = new Wagon("Loco",2);
  Wagon w = first;
  for (int i = 0; i < 10; i++) {
    w.prochain = new Wagon("Passagers", new java.util.Random().nextInt(125));
    w = w.prochain;
  }
  return first;
  }

  public int nbw(){
    if (this.prochain == null){
        return 1;
    } else {
        return 1 + this.prochain.nbw();
    }
  }
  
  public int nbpl(){
    if (this.prochain == null){
        return this.nombreDePlaces;
    } else {
        return this.nombreDePlaces + this.prochain.nbpl();
    }
  }
  
  public void addt(){
    if (this.prochain == null){
        this.prochain = new Wagon("Frets" , 0);
    } else {
        this.prochain.addt();
    }
  }

  public String toString(){
    String res = "Ce wagon de type " + this.type + " contient " + this.nombreDePlaces + " places";
    if(this.prochain != null){
      res += " et est relié a ce wagon : \n";
      res += this.prochain.toString();
    }
    return res;
  }

  public static void main(){
    Wagon t1 = TrainCreation();
    IO.println(t1);
    IO.println(t1.nbw());
    IO.println(t1.nbpl());
    t1.addt();
    IO.println(t1);
  }
}



