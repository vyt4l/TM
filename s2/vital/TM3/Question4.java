class Question4
{
  public static void main()
  {
    Rectangle box = new Rectangle(0 , 0 , 500 , 500);
    box.setColor(Color.WHITE);
    box.draw();
    Line segment1 = new Line(100, 0, 200, 0);
    Line segment2 = new Line(200, 0, 250, 86.6);
    Line segment3 = new Line(250, 86.6, 200, 173.2);
    Line segment4 = new Line(200, 173.2, 100, 173.2);
    Line segment5 = new Line(100, 173.2, 50, 86.6);
    Line segment6 = new Line(50, 86.6, 100, 0);
    segment1.draw();
    segment2.draw();
    segment3.draw();
    segment4.draw();
    segment5.draw();
    segment6.draw();
  }
}
