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
    for(int z = 0 ; z < s.length() ; z++){
      if(s.charAt(z) == ' ' || z == s.length() - 1){
        wordn++;
        while(s.charAt(z) == ' '){
          z++;
        }
      }
    }
    String[] res = new String[wordn]; 
    String tmp = "";
    int x = 0;
    for(int i = 0 ; i < s.length() ; i++){
      while(s.charAt(i) != ' ' || i != s.length()){
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
      IO.print(decphrs[i] + ",");
    }
    IO.println("]");
  }
}
