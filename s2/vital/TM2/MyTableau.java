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
    if(int1 != 0)
    {
    int1 ++;
    }
    if(int1 == tabint.length)
    {
      int[] res = new int[tabint.length + 1];
      for(int  i = 0 ; i < res.length - 1 ; i++)
      {
        res[i] = tabint[i];
      }
      res[tabint.length] = val;
      tabint = res;
    }
    else
    {
      tabint[int1] = val;
    }
  }

  public void delete(int pos)
  {
    int1 --;
    for(int i = pos ; i < tabint.length - 1 ; i++)
    {
      tabint[i] = tabint[i + 1];
    }
  }

  public int get(int pos)
  {
    return tabint[pos];
  }

  public boolean estTrie()
  {
    for(int i = 0 ; i < int1 - 1 ; i++)
    {
      if(tabint[i] > tabint[i + 1])
      {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args)
  {
    MyTableau tab1 = new MyTableau(3);
    tab1.add(1);
    tab1.add(2);
    tab1.add(3);
    tab1.add(4);
    IO.println(tab1.tabint[3]);
  }

}
