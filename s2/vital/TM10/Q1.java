class Q1 {
  public static void main(String[] args){
    Channel ch = new Channel("ChatTest");
    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i < 2147483 ; i++){
      sb.append("az");
    }
    for(int y = 0 ; y < 30 ; y++){
      ch.send(sb.toString());
    }
  }
}
