package climbing_stair;

public class fib {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibnocii(n));

    }
    public static int fibnocii(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return fibnocii(n-1)+fibnocii(n-2);
    }
}
