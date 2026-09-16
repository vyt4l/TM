import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

public class AfficheurPanel extends JPanel {
    private final List<Dessinable> formes;

    public AfficheurPanel(List<Dessinable> formes) {
        this.formes = List.copyOf(formes);
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Dessinable forme : formes) {
            // TODO : demander à la forme de se dessiner
        }
    }
}
