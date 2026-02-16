class EXO4{
  
  public static boolean palindrome(String s){
    if (s.length() == 2 || s.length() == 1) return s.charAt(0) == s.charAt(s.length()-1);
    else if (s.charAt(0) == s.charAt(s.length() - 1)) return palindrome(s.substring(1 , s.length() - 1));
    else return false;
  }

  public static String verlan(String s){
    if (s.length() <= 1) return s;
    return verlan(s.substring(1)) + s.charAt(0);
  }

  public static void main(String[] args){
    IO.println(palindrome(args[0]));
    IO.println(verlan(args[0]));
  }
}
