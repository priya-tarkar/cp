package Recursion;

public class inc_num {
    public static void main(String[] args) {
        int n=5;
        inc_num(n);

    }
    public static void inc_num(int n)
    {
        if(n==0)
        {
            return ;
        }
        inc_num(n-1);
        System.out.println(n);
    }
}
