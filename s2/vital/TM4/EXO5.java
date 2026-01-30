class EXO5 {
  public static int pgdc(int a , int b){
    if(a % b == 0){
      return b;
    }
    else {
      return pgdc(b , a % b);
    }
  }

  public static void main(String[] args){
    IO.println(pgdc(2 , 3));
    IO.println(pgdc(42 , 54));
  }
}
