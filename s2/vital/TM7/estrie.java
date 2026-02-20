class estrie{
  public static boolean check(int[] tab){
    for (int i = 0; i < tab.length - 1; i++) {
      if (tab[i] > tab[i + 1]) return false;
    }
    return true;
  }
}
