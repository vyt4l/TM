void	main() {
	//	IO.print("Bienvenue dans ");
	//	IO.println("le magasin !");
	//
	//	var p1 = new Produit("Pommes", 2.5, 10);
	//	var p2 = new Produit("Bananes", 1.8, 20);
	//	IO.println(p1);
	//	IO.println(p1.compareTo(p2));
	//
	//	var magasin = new Magasin();
	//	magasin.ajouterProduit(new Produit("Ordinateur", 1200.50, 10));
	//	magasin.ajouterProduit(new Produit("Smartphone", 800.00, 25));
	//	IO.println(magasin);

	var produits = List.of(
		new Produit("Ordinateur", 1200.50, 10),
		new Produit("Smartphone", 800.00, 25),
		new Produit("Tablette", 600.00, 15)
	);
	IO.println("Produit le plus cher : " + Utils.max(produits));
	IO.println("Produit le moins cher : " + Utils.min(produits));

	IO.println(Utils.max(List.of(4, 9, 2)));
	IO.println(Utils.min(List.of("poire", "abricot", "pomme")));
	List<Produit> vide = List.of();
	IO.println(Utils.max(vide));
}
