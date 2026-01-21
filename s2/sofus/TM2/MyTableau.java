public class MyTableau {
    int[] array;
    int len;

    public MyTableau()
    {
        this.array = new int[1];
        this.len = 0;
    }

    public  int[] copy_intarray(int[] arr)
    {
        int[] narray = new int[this.len + 1];
        for (int i = 0; i < this.len; i++)
        {
                narray[i] = arr[i];
        }
        return narray;
    }

    public void add(int val)
    {
        if (this.array.length <= this.len)
        {
            this.array = copy_intarray(array);
        }
        this.array[this.len] = val;
        this.len++;
    }

    public void delete (int pos)
    {
        int[] narr = new int[this.len - 1];
		int i = 0;
		int in = 0;

		while (i < this.len)
        {
			if (i != pos)
			{
                narr[in] = this.array[i];
				in++;
			}
			i++;
        }
		this.len--;
        this.array = narr;
    }

	public int get (int pos)
    {
		if (pos >= 0 && pos <= this.len-1)
			return (this.array[pos]);
		IO.println("INVALIT ARRAY INDEX");
		System.exit(1);
		return 0;
    }


	public boolean estTrie() {
		for (int i = 0; i < this.array.length - 1; i++) {
			if (this.array[i] > this.array[i + 1]) {
				return false;
			}
		}
		return true;
	}


    public static void main(String[] args)
    {
        MyTableau ex = new MyTableau();
        ex.add(10);
		ex.add(13);
		ex.add(50);
		IO.println(ex.get(0));
		IO.println(ex.get(1));
		IO.println(ex.get(2));
		ex.delete(1);
		IO.println(ex.get(0));
		IO.println(ex.get(1));
		
	}
}
