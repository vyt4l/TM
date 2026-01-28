class EXO3{

  public static boolean isin(int[] tab , int x , int j){
    if (tab[j-1] == x) {return true;}
    else if (j == 1){return false;}
    else {return isin(tab , x , j-1);}
  }
  
  public static void multab(int[] tab , int x , int j){
    if (j == 1){ }
    else { 
      tab[j-1] *= x;
      multab(tab , x , j-1);
    }
  }


  public static void main(){
    int[] tab = {1,2,3,4,5};
    IO.println(isin(tab , 5 , 5));
    multab(tab , 2 , 3);
    for (int i = 0; i < tab.length ;i++) {
      IO.print(tab[i] + " ");
    }
  }
}
