public class TM2 {
    int a;
    int b;
    String str;

    public TM2(int a, int b, String str)
    {
        this.str = str;
        this.a = a;
        this.b = b;
    }
    
    public TM2()
    {
        this.str = "toto";
        this.a = 0;
        this.b = 1;
    }

    public static void main(String[] args)
    {
        if (args.length >=1) 
        {
            IO.println(dup_str(args[0]));
        }
    }

    public String toString()
    {
        return "int 1: " + this.a + "\nint 2 :" + this.b + "\nstr :" + this.str;
    }


    public int add()
    {
        if (this.str.equals("somme")){
            return this.a + this.b;
        }
        return 0;
    }

    public static String dup_str(String str)
    {
        return str + str;
    }
}
