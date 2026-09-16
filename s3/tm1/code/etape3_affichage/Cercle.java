public class Cercle implements Forme{
    private final Point centre;
    private final int rayon;

    public Cercle(Point centre, int rayon) {
				if (rayon <= 0)
						 throw new IllegalArgumentException("Rayon invalide");
				this.centre = centre;
				this.rayon = rayon;
    }

    public Point getCentre() {
        return (this.centre);
    }
		
    public int getRayon() {
        return (this.rayon);
    }

		@Override
    public double getSurface() {
        return (Math.PI * (this.rayon * this.rayon));
    }

		@Override
    public double getPerimetre() {
        return (2 * Math.PI * this.rayon);
    }

    @Override
    public String toString() {
        // TODO : retourner une représentation lisible du cercle
 				return ("""
							Triangle {
								\t Centre : %s
								\t Rayon : %d
								\t Surface : %f
								\t Perimetre : %f
								}"""
								.formatted(this.centre.toString()
													,this.getRayon()
													,this.getSurface()
													,this.getPerimetre()));
    }
}
