void	main() {
	IO.print("Bienvenue dans ");
	IO.println("le magasin !");

	var p1 = new Produit("Pommes", 2.5, 10);
	var p2 = new Produit("Bananes", 1.8, 20);
	IO.println(p1);
	IO.println(p1.compareTo(p2));
}
