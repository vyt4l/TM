import java.util.List;
import javax.swing.JFrame;

void main() {
    var rectangle = new Rectangle(new Point(100, 100), 80, 40);
    var cercle = new Cercle(new Point(200, 200), 50);

    // TODO : créer les deux objets affichables

    // TODO : afficher leur représentation textuelle avec IO.println(...)

    // TODO : créer une List<Dessinable> contenant les deux objets affichables

    var frame = new JFrame("Afficheur de formes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // TODO : installer un AfficheurPanel dans la fenêtre

    frame.pack();
    frame.setVisible(true);
}
