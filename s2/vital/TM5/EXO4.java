class EXO4 {

  public static void ligneSansRetour(int n , char c){
    if (n == 0);
    else {
      IO.print(c);
      ligneSansRetour( n - 1 , c );
    }
  }

  public static void decoupage(int n, int d){
    if (d == 0){
      ligneSansRetour( n/2 , 'x');
      ligneSansRetour( n/2 , 'o');
    }
    else{
      decoupage(n / 2, d-1);
      decoupage(n / 2, d-1);
    }
  }

  public static void fractale(int n , int d){
    if (d == 0) decoupage(n , d);
    else {
      fractale(n , d-1);
      IO.println("");
      decoupage(n , d);
    }
  }

  public static void main(){
    ligneSansRetour(5 , 'x');
    ligneSansRetour(3 , 'o');
    IO.println("");
    decoupage(16 , 2);
    IO.println("");
    fractale(16 , 3);
  }
}
