class EXO1 
{
  public static void afficheNombresDecroissant(int n)
  {
    if(n == 1)
    {
      IO.println("1");
    }
    else
    {
      IO.print(n + ", ");
      afficheNombresDecroissant(n-1);
    }
  }
  
  public static void afficheNombresCroissant (int n)
  {
    if (n != 1)
    {
      afficheNombresCroissant(n-1);
    }
    IO.println(n);
  }

  public static void main() 
  {
    afficheNombresCroissant(31);
  }

}
