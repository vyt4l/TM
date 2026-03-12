import java.util.Random;

class tabRandom{
  public static int[] rint(int size){
    Random gen = new Random(100);
    int[] tab = new int[size];
    for (int i = 0 ; i < tab.length ; i++){
      tab[i] = gen.nextInt();
    }
    return tab;
  }
}
