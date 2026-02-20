class Q4 {

  public static void selecbul3(int[] tab){
    for (int j = 0 ; j < tab.length - 1 ; j++){
      for (int i = 0 ; i < tab.length - j - 1 ; i++){
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
    selecbul3(tab);
    rendertab.render(tab);
    IO.println(estrie.check(tab));
  }
}
