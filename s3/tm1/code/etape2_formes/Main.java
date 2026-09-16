import java.util.List;

void main() {
	List<Forme> formes = new ArrayList<Forme>();
	formes.add(new Rectangle(new Point(10, 10), 20, 10));
	formes.add(new Cercle(new Point(20, 20), 10));
	for (Forme current_forme : formes){
		IO.println("périmètre = " + current_forme.getPerimetre());
		IO.println("surface = " + current_forme.getSurface());
	}
}
