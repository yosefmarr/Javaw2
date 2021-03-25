public class E06_Casting 
{
    public static void main(String[] args) 
    {
        int x = 5;
        double y = x;
        System.out.println(y);

        Object o = "This is a String";
        String s = (String)o;
        System.out.println(s);
    }
}
