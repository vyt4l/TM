class Q2 {
  public static void main(String[] args){
    Channel ch = new Channel("c1");
    for(int i = 0 ; i < 2 ; i++){
      ch.getNext();
    }
    IO.println(ch.getNext());
  }
}
