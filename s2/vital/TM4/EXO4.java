class EXO4{
  
  public static boolean palindrome(String s, int i , int j){
    if(i == j - 1 || i == j) {return s.charAt(i) == s.charAt(j - 1);}
    else if(s.charAt(j-1) == s.charAt(i)){return palindrome(s , i+1 , j-1);}
    else{return false;}
  }
  public static boolean palindrome(String s){ return palindrome(s , 0 , s.length());}

  public static String verlan(String s , int i , String res){
    if (i == 0){
      return res + s.charAt(i);
    }
    else {
      return verlan(s , i-1 , res + s.charAt(i));
    }
  }
  public static String verlan(String s){return verlan(s , s.length() - 1 , "");} 

  public static void main(String[] args){
    IO.println(palindrome(args[0]));
    IO.println(verlan(args[0]));
  }
}
