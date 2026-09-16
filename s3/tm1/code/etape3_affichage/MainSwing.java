import java.util.List;
import javax.swing.JFrame;

void main() {
    var rectangle = new Rectangle(new Point(100, 100), 80, 40);
    var cercle = new Cercle(new Point(200, 200), 50);

		RectangleAffichable rAff = new RectangleAffichable(rectangle);
		CercleAffichable cAff = new CercleAffichable(cercle);

		IO.println(rAff.imprimer());
		IO.println(cAff.imprimer());

		List<Dessinable> lst = new ArrayList<Dessinable>();
		lst.add(rAff);
		lst.add(cAff);
    var frame = new JFrame("Afficheur de formes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AfficheurPanel aff = new AfficheurPanel(lst);
    frame.add(aff);
    frame.pack();
    frame.setVisible(true);
}
