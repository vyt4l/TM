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
        if (this.array.length < this.len)
        {
            this.array = copy_intarray(array);
        }
        this.array[this.len] = val;
        this.len++;
    }

    public void delete (int pos)
    {
        
    }

    public static void main(String[] args)
    {
        MyTableau ex = new MyTableau();
        ex.add(10);
    }
}
