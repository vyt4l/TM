class Q2 {

  public static void selecbul(int[] tab){
    for (int j = 0 ; j < tab.length ; j++){
      for (int i = 0 ; i < tab.length - 1 ; i++){
        if (tab[i] > tab[i + 1]){
          int tmp = tab [i];
          tab[i] = tab[i + 1];
          tab[i + 1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args){
    int[] tab = tabRandom.rint(5);
    rendertab.render(tab);
    selecbul(tab);
    rendertab.render(tab);
    IO.println(estrie.check(tab));
  }
}
