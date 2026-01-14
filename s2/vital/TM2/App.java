class App
{
  public static void main(String[] args)
  {
    Tm2 tst = new Tm2();
    tst.int1 = 1;
    tst.int2 = 3;
    tst.str1 = "Somme";
    IO.println(tst.concatene("ca"));
    IO.println(tst.somme());
  }
}
