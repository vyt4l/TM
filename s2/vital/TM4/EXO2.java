class EXO2{

  public static void ligne (int n) {
    if (n != 1)
    {
      ligne(n-1);
    }
    IO.print("*");   
  }
  
  public static void triangle (int n){
    if (n != 1){
      triangle(n-1);
    }
    ligne(n);
    IO.println(" ");
  }

  public static void main(){
    triangle(10);
  }
}
