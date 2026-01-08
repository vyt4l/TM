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
  
  static String[] decomposePhrase(String s){  
    int wordn = 0;
    for(int y = 0 ; y < s.length() ; y++){
      if(s.charAt(y) == ' ' || y == s.length() - 2){
        if(s.charAt(y + 1) != ' '){
          wordn++;
        }
      }
    }
    IO.println(wordn);
    String[] res = new String[wordn];
    String tmp = "";
    int x = 0;
    for(int i = 0 ; i < s.length() ; i++){
      while(i < s.length() && s.charAt(i) != ' '){
        tmp += s.charAt(i);
        i++;
      }
      if(s.charAt(i - 1) != ' '){
        res[x] = tmp;
        x++;
        tmp = "";
      }
    }
    return res;
  }

  public static void main(String[] args) {
    IO.println(remplacelettre("zaazaa" , 'a' , 'i'));
    String[] decphrs = decomposePhrase("gougou gaga  hihi   haha");
    IO.print("[");
    for(int i = 0 ; i < decphrs.length ; i++){
      if(i == decphrs.length - 1){
        IO.println(decphrs[i] + "]");
      } else {
        IO.print(decphrs[i] + ",");
      }
    }
  }
}
