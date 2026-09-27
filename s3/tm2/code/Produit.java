public class Produit implements Comparable<Produit> {

	private final String	nom;
	private final double	prix;
	private final int	stock;

	public Produit (String nom, double prix, int stock){
		if (nom == null || nom.isBlank())
			throw new IllegalArgumentException("Nom invalide");
		if (prix < 0 || !Double.isFinite(prix))
			throw new IllegalArgumentException("Prix invalide");
		if (stock < 0)
			throw new IllegalArgumentException("Stock invalide");

		this.nom = nom; 
		this.prix = prix;
		this.stock = stock;
	}

	@Override
	public int compareTo(Produit autre){
		return (Double.compare(this.prix, autre.prix));
	}

	public String getNom() {return (this.nom);}
	public double getPrix() {return (this.prix);}
	public int getStock() {return (this.stock);}

	public String toString() {
		return ("""
			Produit {
			\t Nom : %s
			\t Prix : %f
			\t Stock : %d
			}"""
			.formatted(
				this.getNom()
				,this.getPrix()
				,this.getStock()
			)
		);
	}
}
