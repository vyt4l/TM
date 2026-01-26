import java.awt.*;
import javax.swing.*;

public class Question6 
{
  public static void main(String[] args) 
  {
    JFrame frame = new JFrame();
    frame.setSize(200, 200); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Hexagone hexa = new Hexagone();
    frame.add(hexa);
    frame.setVisible(true);        
    JFrame frame2 = new JFrame();
    frame2.setSize(30*8, 30*8); 
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Echecs ech = new Echecs(Integer.valueOf(IO.readln("Coo x ? : ")) , Integer.valueOf(IO.readln("Coo y ? : ")) );
    frame2.add(ech);
    frame2.setVisible(true);
  }
}

class Hexagone extends JComponent 
{
  public void paintComponent(Graphics g) 
  {
    Graphics2D g2 = (Graphics2D) g;

    g2.setStroke(new BasicStroke(5));
    g2.setColor(Color.BLUE);
    
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
      g2.drawLine(x[z] + 100 , y[z] +100 , x[nextIndex] + 100, y[nextIndex] + 100);
    }
  }
}

class Echecs extends JComponent 
{
  int coox;
  int cooy;

  public Echecs(int x , int y)
  {
    this.coox = x;
    this.cooy = y;
  }

  public void paintComponent(Graphics g) 
  {
    Graphics2D g2 = (Graphics2D) g;
    int z = 0;
    
    for(int i = 0 ; i < 8 ; i++)
    {
      z++;
      for(int y = 0 ; y < 8 ; y++)
      {
        if(z % 2 == 0)
        {
        g2.setColor(Color.BLACK);
        g2.fillRect(30*y, 30*i, 30, 30);
        }
        z++;
      }
      g2.setColor(Color.BLUE);
      g2.fillOval(this.coox, this.cooy, 25, 25);
    }
    
  }
}
