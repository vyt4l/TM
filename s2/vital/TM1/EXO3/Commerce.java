class Commerce
{

  public static Article saisirArticle(String n , int p)
  {
    Article res = new Article();
    res.nom = n;
    res.prix = p;
    return res;
  }

  public static void afficherArticle(Article art)
  {
    IO.println("L'article " + art.nom + " vaut " + art.prix + "€ .");
  }
  
  public static Panier initialiserPanier(Article[] arts , int size)
  {
    Panier res = new Panier();
    res.articles = arts;
    res.size = size;
    return res;
  }

  public static void afficherPanier(Panier p)
  {
    IO.println("Contenu de ce panier :");
    for(int i = 0 ; i < p.articles.length ; i++)
    {
      IO.print("  - ");
      afficherArticle(p.articles[i]);
    }
  }

  public static int prixTotal(Panier p)
  {
    int res = 0;
    for(int i = 0 ; i < p.articles.length ; i++)
    {
      res += p.articles[i].prix;
    }
    return res;
  }

  public static boolean ajouterArticle(Panier p , Article art){
    if(p.articles.length < p.size){
      Article[] res = new Article[p.articles.length + 1];
      for(int i = 0 ; i < p.articles.length ; i++)
      {
        res[i] = p.articles[i];
      }
      res[p.articles.length] = art;
      p.articles = res;
      return true;
    } 
    else 
    {
      return false;
    }
  }

  public static void main(String[] args)
  {
    Panier pan = initialiserPanier(new Article[0] , Integer.valueOf(IO.readln("taille de votre panier : ")));
    while(IO.readln("ajouter un article ? y/n : ").equals("y"))
    {
      if(ajouterArticle(pan , saisirArticle(IO.readln("nom de l'article que vous voulez ajouter : ") , Integer.valueOf(IO.readln("Prix de cet article : ")))))
      {
        
      }
      else
      {
        IO.println("Impossible d'ajouter : panier plein.");
        break;
      }
    }
    IO.println("");
    afficherPanier(pan);
    IO.println("");
    IO.println("Vous avez un total de " + prixTotal(pan) + "€ dans votre panier.");
  }

}
