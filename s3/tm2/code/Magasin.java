import java.util.List;
import java.util.ArrayList;

public class Magasin {

	private final List<Produit> produits;

	public Magasin (){
		this.produits = new ArrayList<Produit>();
	}

	public void ajouterProduit(Produit produit){
		if (produit == null)
			throw new IllegalArgumentException("Le produit ajoute ne peut pas etre null");

		this.produits.add(produit);
	}

	public List<Produit> getProduits() {return (List.copyOf(this.produits));}

	public String toString() {
		String res = "Magasin :";
		for (Produit p : this.produits){
			res += "\n\t" + p.toString();
		}
		return (res);
	}
}
