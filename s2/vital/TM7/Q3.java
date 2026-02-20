class Q3 {

  public static void selecbul2(int[] tab){
    for (int j = 0 ; j < tab.length ; j++){
      int sum = 0;
      for (int i = 0 ; i < tab.length - 1 ; i++){
        if (tab[i] > tab[i + 1]){
          int tmp = tab [i];
          tab[i] = tab[i + 1];
          tab[i + 1] = tmp;
          sum ++;
        }
      }
      if (sum == 0) break;
    }
  }

  public static void main(String[] args){
    int[] tab = tabRandom.rint(5);
    rendertab.render(tab);
    selecbul2(tab);
    rendertab.render(tab);
    IO.println(estrie.check(tab));
  }
}
