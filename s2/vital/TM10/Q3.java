class Q3 {
  
  public static void lireapres(Channel chan , String s){
    String cond = chan.getNext() ;
    while (!s.equals(cond)) cond = chan.getNext() ; 
    while (s.equals(cond)) cond = chan.getNext() ;
    IO.println(cond) ;
  }
  
  public static void main(String[] args){
    if(args.length == 0){
      IO.println("faut entrer un argument pour tester");
      System.exit(1);
    }
    Channel ch = new Channel("c1") ;
    lireapres(ch , args[0]) ;
  }
}
