class Question5
{
  public static void main() 
  {
    int coox = Integer.valueOf(IO.readln("coordonée x du point ?"));
    int cooy = Integer.valueOf(IO.readln("coordonée y du point ?"));
    int z = 0;
    for(int i = 0 ; i < 8 ; i++)
    {
      z ++ ;
      for(int y = 0 ; y < 8 ; y++)
      {
        if(z % 2 == 0)
        {
        Rectangle box = new Rectangle((30*y) ,(30*i) , 30 , 30);
        box.setColor(Color.BLACK);
        box.fill();
        }
        z++;
      }
      Ellipse egg = new Ellipse(coox, cooy, 25, 25);
      egg.setColor(Color.BLUE);
      egg.fill();
    }
  }
}
