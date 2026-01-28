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
  
  public static boolean adjacent(int[] tab , int j){
    if (j < 2){return false;}
    else if (tab[j-1] == tab[j-2]) {return true;}
    else {return adjacent(tab , j-1);}
  }
  
  public static boolean palindrome(int[] tab , int i , int j){
    if(i == j - 1 || i == j) {return tab[i] == tab[j - 1];}
    else if(tab[j-1] == tab[i]){return palindrome(tab , i+1 , j-1);}
    else{return false;}
  }

  public static void inverse(int[] tab , int i , int j){
    if(i == j - 1 || i == j);
    else {
      int tmp = tab[i];
      tab[i] = tab[j-1];
      tab[j-1] = tmp;
      inverse(tab , i+1 , j-1);
    }
  }

  public static void main(){
    int[] tab = {1,2,3,6,4,5};
    IO.println(isin(tab , 5 , 6));
    multab(tab , 2 , 3);
    for (int i = 0; i < tab.length ;i++) {
      IO.print(tab[i] + " ");
    }
    IO.println("");
    IO.println(adjacent(tab,4));
    int[] tab2 = {1,2,3,2,1};
    IO.println(palindrome(tab2, 1 , 4));
    inverse(tab2 , 2 , 5);
    for (int i = 0; i < tab2.length ;i++) {
      IO.print(tab2[i] + " ");
    }
  }
}
