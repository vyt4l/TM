void main() {
    Object[] formes = {
        new Rectangle(new Point(10, 10), 20, 10),
        new Cercle(new Point(30, 30), 15)
    };

    for (Object forme : formes) {
        if (forme instanceof Rectangle r) {
            IO.println(r);
            IO.println("surface = " + r.getSurface());
            IO.println("périmètre = " + r.getPerimetre());
        } else if (forme instanceof Cercle c) {
            IO.println(c);
            IO.println("surface = " + c.getSurface());
            IO.println("périmètre = " + c.getPerimetre());
        }
        IO.println();
    }
}
