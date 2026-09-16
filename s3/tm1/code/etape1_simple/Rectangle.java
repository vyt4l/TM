public class Rectangle {
    private final Point centre;
    private final int largeur;
    private final int hauteur;

    public Rectangle(Point centre, int largeur, int hauteur) {
				if (largeur <= 0 || hauteur <= 0)
 					throw new IllegalArgumentException("Dimensions invalides");
				
				this.centre = centre;
				this.largeur = largeur;
				this.hauteur = hauteur;
    }

    public Point getCentre() {
        return (this.centre);
    }

    public int getLargeur() {
        return (this.largeur);
    }

    public int getHauteur() {
        return (this.hauteur);
    }

    public double getSurface() {
        return (this.hauteur * this.largeur);
    }

    public double getPerimetre() {
        return (2 * (this.largeur + this.hauteur));
    }

    @Override
    public String toString() {
        return ("""
							Triangle {
								\t Centre : %s
								\t Largeur : %d
								\t Hauteur : %d
								\t Surface : %f
								\t Perimetre : %f
								}"""
								.formatted(this.centre.toString()
													,this.getLargeur()
													,this.getHauteur()
													,this.getSurface()
													,this.getPerimetre()));
    }
}
