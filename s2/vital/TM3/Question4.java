class Question4
{
  public static void main()
  {
    Rectangle box = new Rectangle(0 , 0 , 500 , 500);
    box.setColor(Color.WHITE);
    box.draw();
    int[] x = new int[6];
    int[] y = new int[6];
    double angle = Math.toRadians(360/6);
    for(int i = 0 ; i < 6 ; i++)
    {
      x[i] = (int) (100 * Math.cos(i* angle));
      y[i] = (int) (100 * Math.sin(i* angle));
    }
    
    for(int z = 0 ; z < 6 ;z++)
    {
      int nextIndex = (z + 1) % 6;
      Line seg = new Line(x[z] +300  , y[z] +300 , x[nextIndex] +300 , y[nextIndex] +300);
      seg.draw();
    }
  }
}
