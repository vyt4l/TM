public class AppSB {


    public static String concat_plus(String str1, String str2)
    {
        return str1 + str2;
    }

    public static String concat_append(String str1, String str2)
    {
        return str1 + str2;
    }

    public static void main(String[] args)
    {
        String str1 = "UwU";
        String str2 = "UnU";
        for (int i = 0; i < 1000000; i++)
        {
            IO.print(concat_plus(str1, str2));
        }
        for (int i = 0; i < 1000000; i++)
        {
            IO.print(concat_append(str1, str2));
        }
    }
}
