class EX00{

  public static boolean valid_int(String str)
  {
    int i;

    if (str.length() <= 0){
      return false;
    }
    i = 0;
    if (str.charAt(i) == '-' || str.charAt(i) == '+'){
      i++;
    }
    while ( i < str.length())
    {
      if (!Character.isDigit(str.charAt(i))){
        return (false); 
      }
      i++;
    }
    return (true);
  }

  public static void main(String[] argv)
  {
    IO.println("Hello World!");
    String name =  IO.readln("What ur Name fellow human : ");
    IO.println("OH i see your name is " + name + " how patetic ");
    
    String age_s = IO.readln("lets continue, what is ur age :3 ? ");
    if (!valid_int(age_s)){
      IO.println("ENTER A CORRECT NUMBER UR BOZO >:3 ");
      return ;
    }
    int age = Integer.parseInt(age_s);
    if (age < 18) {
      IO.println("HUH no minors allow here get out ur silly lil kid :(");
    }
    else {
      IO.println("Ur welcome sweetie :D");
    }
  }
}
