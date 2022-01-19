package climbing_stair;

public class climb_stair_path {
    public static void main(String[] args) {
        int s=4;
        printpath(0,s,"");

    }
    public static void printpath(int n,int s,String ans)
    {
        if(n==s)
        {
            System.out.println(ans);
            return;
        }
        if(n>s)
        {
            return;
        }
        for(int step=1;step<=3;step++)
        {
            printpath(n+step,s,ans+step);
        }
    }
}
