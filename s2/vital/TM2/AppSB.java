class AppSB
{
  public static void main(String[] args)
  {
    String c = "ca";
    String tmp = "";
    StringBuilder sb = new StringBuilder(tmp);
    for(int i = 0 ; i < 100000 ; i++)
    {
      sb.append(c);
    }
    IO.println(sb);
  }
}
