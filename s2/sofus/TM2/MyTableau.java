public class MyTableau {
    int[] array;
    int len;

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
        this.len++;
        if (this.array.length < this.len)
        {
            this.array = copy_intarray(array);
        }
        this.array[this.len] = val;
    }

    public static void main(String[] args)
    {

        MyTableau ex = new MyTableau();
        IO.println(ex);
    }
}
