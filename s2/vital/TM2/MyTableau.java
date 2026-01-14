class MyTableau
{
  int[] tabint;
  int int1;

  public MyTableau(int n)
  {
    this.tabint = new int[n];
    this.int1 = 0;
  }

  public void add(int val)
  {
    int[] res = new int[this.tabint.length + 1];
    for(int i = 9 ; i < res.length - 1 ; i++)
    {
      res[i] = tabing[i];
    }
    res[res.length - 1] = val;
  }

}
