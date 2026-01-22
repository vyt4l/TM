import java.awt.*;
import javax.swing.*;

public class Question6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300); // Change width and height as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hexagone hexa = new Hexagone();
        frame.add(hexa);
        frame.setVisible(true);        
        JFrame frame2 = new JFrame();
        frame2.setSize(300, 300); // Change width and height as needed
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Echecs ech = new Echecs();
        //frame2.add(ech);
        frame2.setVisible(true);
    }
}

class Hexagone extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.GREEN);
        g2.drawLine(100, 0, 200, 0);        
        g2.drawLine(200, 0, 250, 86);     
        g2.drawLine(250, 86, 200, 173); 
        g2.drawLine(200, 173, 100, 173);
        g2.drawLine(100, 173, 50, 86);  
        g2.drawLine(50, 86, 100, 0);      
    }
}
