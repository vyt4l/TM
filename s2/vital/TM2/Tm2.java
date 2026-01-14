class Tm2
{
  int int1;
  int int2;
  String str1;
  
  public Tm2(int a , int b , String s)
  {
    this.int1 = a;
    this.int2 = b;
    this.str1 = s;
  }
  
  public Tm2(int a , int b)
  {
    this.int1 = a;
    this.int2 = b;
    this.str1 = "somme";
  }

  public Tm2(int a)
  {
    this.int1 = a;
    this.int2 = a;
    this.str1 = "toto";
  }

  public static String concatene(String s)
  {
    return s + s;
  }

  public int somme()
  {
    if(this.str1.equals("somme"))
    {
      return int1 + int2;
    }
    else 
    {
      return 0;
    }
  }
}
