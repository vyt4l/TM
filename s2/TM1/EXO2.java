class EXO2 {
  static String remplacelettre(String s){
    String res = "";
    for (int i = 0 ; i < s.length() ; i++) {
    if(s.charAt(i) == 'a'){
      res += "e";
    } else {
      res += s.charAt(i);
    }
    }
    return res;
  }

  static String remplacelettre(String s , char a){
    String res = "";
    for (int i = 0 ; i < s.length() ; i++) {
    if(s.charAt(i) == a){
      res += "e";
    } else {
      res += s.charAt(i);
    }
    }
    return res;
  }

  static String remplacelettre(String s , char a ,  char e){
    String res = "";
    for (int i = 0 ; i < s.length() ; i++) {
    if(s.charAt(i) == a){
      res += e;
    } else {
      res += s.charAt(i);
    }
    }
    return res;
  }

  public static void main(String[] args) {
    IO.println(remplacelettre("zaazaa" , 'a' , 'i'));
  }
}
