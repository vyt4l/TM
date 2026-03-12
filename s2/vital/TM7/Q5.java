class Q5 {

  public static void selecbulcocktail(int[] tab){
    int temp ;
    for (int j = 0; j < tab.length / 2; j++) {    
      for (int i = j; i < tab.length - 1 - j; i++) {
        if (tab[i] > tab[i + 1]) {
          temp = tab[i];
          tab[i] = tab[i + 1];
          tab[i + 1] = temp;
        }
      }
      for (int i = tab.length - 2 - j; i > j; i--) {
        if (tab[i] < tab[i - 1]) {
          temp = tab[i];
          tab[i] = tab[i - 1];
          tab[i - 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args){
    int[] tab = tabRandom.rint(5);
    rendertab.render(tab);
    selecbulcocktail(tab);
    rendertab.render(tab);
    IO.println(estrie.check(tab));
  }
}
