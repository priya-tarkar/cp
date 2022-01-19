package Recursion;

public class Print_char {
    public static void main(String[] args) {
        String s="hello";
        print(s);

    }
    public static void print(String s)
    {
        if(s.length()==0)
        {
            return;
        }
        char c=s.charAt(0);
        System.out.println(c);
        print(s.substring(1));
    }

}
