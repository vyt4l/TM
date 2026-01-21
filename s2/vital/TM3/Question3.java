class Question3
{
  public static void main() 
  {
    Rectangle box1 = new Rectangle(0, 0, 1000, 300);
    box1.setColor(Color.CYAN);
    box1.draw(); 
    box1.fill();
    Rectangle box2 = new Rectangle(0, 300, 1000, 200);
    box2.setColor(Color.GREEN);
    box2.draw();
    box2.fill();
    Ellipse egg = new Ellipse(30, 30, 60, 60);
    egg.setColor(Color.YELLOW);
    egg.fill();
    Line segment1 = new Line(600, 300, 700, 300);
    Line segment2 = new Line(600, 300, 650, 200);
    Line segment3 = new Line(650, 200, 700, 300);
    segment1.draw();
    segment2.draw();
    segment3.draw();
  }
}
