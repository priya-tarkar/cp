package Recursion;

public class dec_num {
    public static void main(String[] args) {
        int n=10;
        dec_number(n);

    }
    public static void dec_number(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        dec_number(n-1);
    }
}
