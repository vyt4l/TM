class Q6 {
  
  public static void triInsertion(int[] tab) {
        int e = 0;
        int j = 0;
        for (int i = 1; i < tab.length; i++) {
            e = tab[i];
            j = i;
            while ((j > 0) && (tab[j - 1] > e)) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = e;
        }
    }
  

  hortanium#3-amasias4-coegerit-coitionis!
  public static void main(String[] args){
    int[] tab = tabRandom.rint(5);
    rendertab.render(tab);
    triInsertion(tab);
    rendertab.render(tab);
    IO.println(estrie.check(tab));
  }
}
