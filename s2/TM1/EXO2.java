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
  
  static String remplaceMot(String s, String mot1, String mot2){
    String[] tab = decomposePhrase(s);
    String res = "";
    for(int i = 0 ; i < tab.length ; i++){
      if(tab[i].equals(mot1)){
        tab[i] = mot2;
      }
      if(i != tab.length - 1){
        res += (tab[i] + " ");
      } else {
        res += tab[i];
      }
    }
    return res;
  }

  static String inversePhrase(String s){
    String res = "";
    String[] tab = decomposePhrase(s);
    for(int i = tab.length - 1 ; i == 0 ; i--){
      if(i != 0){
        res += (tab[i] + " ");
      } else {
        res += tab[i];
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
    IO.println('"' +remplaceMot("az be az be" , "be" , "a") + '"');
    IO.println('"' +inversePhrase("jeune padawan mere ta") + '"');
  }
}
