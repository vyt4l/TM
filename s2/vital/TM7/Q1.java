class Q1 {

  public static void selectri(int[] tab){
    
    for (int start = 0 ; start < tab.length ; start++){
      int indmin = start;
      
      for (int i = start ; i < tab.length ; i++){
        if (tab[i] < tab[indmin]){
          indmin = i;
        }
      }
      
      int tmp = tab[indmin];
      tab[indmin] = tab[start];
      tab[start] = tmp;
    }
  }

  public static void main(String[] args){
    int[] tab = tabRandom.rint(5);
    rendertab.render(tab);
    selectri(tab);
    rendertab.render(tab);
    IO.println(estrie.check(tab));
  }
}
