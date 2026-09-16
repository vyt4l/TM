import java.awt.Graphics;
import java.awt.Color;

public class CercleAffichable implements Dessinable, Imprimable {
    private final Cercle cercle;

    public CercleAffichable(Cercle cercle) {
			this.cercle = cercle;
    }

    @Override
    public String imprimer() {
        return this.cercle.toString();
    }

    @Override
    public void dessiner(Graphics g) {
        DrawUtils.drawCercle(g, Color.RED, this.cercle.getCentre(), this.cercle.getRayon());
    }
}
