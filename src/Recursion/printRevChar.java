package Recursion;

public class printRevChar {
    public static void main(String[] args) {
        String s="dance";
        reversechar(s);

    }
    public static void reversechar(String s)
    {
        if(s.length()==0)
        {
            return;
        }
        reversechar(s.substring(1));
        char c=s.charAt(0);
        System.out.println(c);
    }
}
