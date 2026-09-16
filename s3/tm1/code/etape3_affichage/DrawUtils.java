import java.awt.Color;
import java.awt.Graphics;

public final class DrawUtils {
    private DrawUtils() {
    }

    public static void drawRectangle(Graphics g, Color couleur, Point centre, int largeur, int hauteur) {
        int minX = centre.getX() - largeur / 2;
        int minY = centre.getY() - hauteur / 2;
        g.setColor(couleur);
        g.drawRect(minX, minY, largeur, hauteur);
    }

    public static void drawCercle(Graphics g, Color couleur, Point centre, int rayon) {
        g.setColor(couleur);
        g.drawOval(centre.getX() - rayon, centre.getY() - rayon, 2 * rayon, 2 * rayon);
    }
}
