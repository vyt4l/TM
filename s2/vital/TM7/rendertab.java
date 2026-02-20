class rendertab{
  public static void render(int [] tab){
    IO.print("[ ");
    for (int i = 0 ; i < tab.length - 1 ; i++){
      IO.print(tab[i] + " , ");
    }
    IO.println(tab[tab.length - 1] + " ].");
  }
}
