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
    int1++;
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

  public String toString()
  {
    String res = "[ ";
    for(int i = 0 ; i < this.int1 ; i++)
    {
      res += String.valueOf(this.get(i));
      res += " ";
    }
    res += "]";
    return res;
  }

  public static void main(String[] args)
  {
    MyTableau tab1 = new MyTableau(3);
    tab1.add(1);
    tab1.add(2);
    tab1.add(3);
    tab1.add(4);
    IO.println(tab1);
    
    tab1.delete(2);
    IO.println(tab1);
    
    IO.println("tab1 triée : " + tab1.estTrie());
    tab1.add(3);
    IO.println(tab1);
    IO.println("tab1 triée : " + tab1.estTrie());
  }

}
