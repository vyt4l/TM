import java.awt.Graphics;
import java.awt.Color;

public class RectangleAffichable implements Dessinable, Imprimable {
    private final Rectangle rectangle;

    public RectangleAffichable(Rectangle rectangle) {
			this.rectangle = rectangle;
    }

    @Override
    public String imprimer() {
        return this.rectangle.toString();
    }

    @Override
    public void dessiner(Graphics g) {
        DrawUtils.drawRectangle(g, Color.BLUE, this.rectangle.getCentre(), this.rectangle.getLargeur(), this.rectangle.getHauteur());
    }
}
