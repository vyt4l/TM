void	main() {
	IO.print("Bienvenue dans ");
	IO.println("le magasin !");

	var p1 = new Produit("Pommes", 2.5, 10);
	var p2 = new Produit("Bananes", 1.8, 20);
	IO.println(p1);
	IO.println(p1.compareTo(p2));

	var magasin = new Magasin();
	magasin.ajouterProduit(new Produit("Ordinateur", 1200.50, 10));
	magasin.ajouterProduit(new Produit("Smartphone", 800.00, 25));
	IO.println(magasin);
}
