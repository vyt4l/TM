import java.awt.*;
import java.awt.Color;

import javax.swing.*;

public class PavageFonction extends JComponent {
    int width = 960;
    int height = 800;
    double xMin = -12.0;
    double xMax = 12.0;
    double yMin = -10.0;
    double yMax = 10.0;
    Color ROSE = new Color(255, 0, 0, 100);
    Color ROUGE = new Color(255, 0, 0, 255);
    Color BLEU = new Color(0,0,255,255);
    Color BLEUCLAIR = new Color(0,0,255,100);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pavage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960, 840);
        frame.add(new PavageFonction());
        frame.setVisible(true);
    }

    public static double f(double x) {
        return x + Math.sin(x);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // affichage des axes
        g2.setColor(Color.BLACK);
        int xAxis = valeurToPixelX(0);
        int yAxis = valeurToPixelY(0);
        g2.drawLine(0, yAxis, width, yAxis);
        g2.drawLine(xAxis, 0, xAxis, height);

        // affichage de la fonction
        g2.setColor(ROUGE);
        g2.setStroke(new BasicStroke(2));
        double x1, y1, x2, y2;
        int pixelY1, pixelY2;
        for (int pixelXi = 0; pixelXi < width - 1; pixelXi++) {
            x1 = pixelToValeurX(pixelXi);
            y1 = f(x1);
            x2 = pixelToValeurX(pixelXi + 1);
            y2 = f(x2);
            pixelY1 = valeurToPixelY(y1);
            pixelY2 = valeurToPixelY(y2);
            g2.drawLine(pixelXi, pixelY1, pixelXi + 1, pixelY2);
        }
        g2.setStroke(new BasicStroke(1));

        // appel au pavage
        pavageSousFonction(g2, xMin, xMax, yMin, yMax, 10);
        pavageSurFonction(g2, xMin, xMax, yMin, yMax, 10);
    }

    // ...yHaut.._______
    // .........|.......|
    // .........|.......|
    // ....yBas.|_______|
    // ......xGauche...xDroite

    public void pavageSousFonction(Graphics2D g2, double xGauche, double xDroite, double yBas, double yHaut,
            int depth) {
        if (depth <= 0)
            return;

        double milieuX = (xGauche + xDroite) / 2;
        double milieuY = (yBas + yHaut) / 2;

        double fdeXGauche = f(xGauche);
        double fdeXDroite = f(xDroite);

        if (fdeXGauche > yHaut && fdeXDroite > yHaut) {
            int pixXGauche = valeurToPixelX(xGauche);
            int pixYHaut = valeurToPixelY(yBas);
            int pixXDroite = valeurToPixelX(xDroite);
            int pixYBas = valeurToPixelY(yHaut);
            g2.setColor(ROUGE);
            g2.drawRect(pixXGauche, pixYBas, pixXDroite - pixXGauche, pixYHaut - pixYBas);
            g2.setColor(ROSE);
            g2.fillRect(pixXGauche, pixYBas, pixXDroite - pixXGauche, pixYHaut - pixYBas);
        } else {
            pavageSurFonction(g2, xGauche, milieuX, yBas, milieuY, depth - 1);
            pavageSurFonction(g2, milieuX, xDroite, yBas, milieuY, depth - 1);
            pavageSurFonction(g2, xGauche, milieuX, milieuY, yHaut, depth - 1);
            pavageSurFonction(g2, milieuX, xDroite, milieuY, yHaut, depth - 1);
        }
    }

    private int valeurToPixelX(double x) {
        return (int) ((x - xMin) / (xMax - xMin) * width);
    }

    private int valeurToPixelY(double y) {
        return (int) ((yMax - y) / (yMax - yMin) * height);
    }
    
    public void pavageSurFonction(Graphics2D g2, double xGauche, double xDroite, double yBas, double yHaut,
            int depth) {
        if (depth <= 0)
            return;

        double milieuX = (xGauche + xDroite) / 2;
        double milieuY = (yBas + yHaut) / 2;

        double fdeXGauche = f(xGauche);
        double fdeXDroite = f(xDroite);

        if (fdeXGauche < yBas && fdeXDroite < yBas) {
            int pixXGauche = valeurToPixelX(xGauche);
            int pixYHaut = valeurToPixelY(yBas);
            int pixXDroite = valeurToPixelX(xDroite);
            int pixYBas = valeurToPixelY(yHaut);
            g2.setColor(BLEU);
            g2.drawRect(pixXGauche, pixYBas, pixXDroite - pixXGauche, pixYHaut - pixYBas);
            g2.setColor(BLEUCLAIR);
            g2.fillRect(pixXGauche, pixYBas, pixXDroite - pixXGauche, pixYHaut - pixYBas);
        } else {
            pavageSousFonction(g2, xGauche, milieuX, yBas, milieuY, depth - 1);
            pavageSousFonction(g2, milieuX, xDroite, yBas, milieuY, depth - 1);
            pavageSousFonction(g2, xGauche, milieuX, milieuY, yHaut, depth - 1);
            pavageSousFonction(g2, milieuX, xDroite, milieuY, yHaut, depth - 1);
        }
    }


    private double pixelToValeurX(int pixelX) {
        return xMin + (pixelX / (double) width) * (xMax - xMin);
    }

}
