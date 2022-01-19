package climbing_stair;

public class waysclimbstair {
//    private static int ans=0;

    public static void main(String[] args) {


        int n = 3;

        System.out.println(no_of_ways(0,n));
    }

    private static int no_of_ways(int curr,int n) {
        if(curr==n)
        {
            return 1;
        }
        if(curr>n)
        {
            return 0;
        }
          int ans=0;
        for(int step=1;step<=3;step++ )
        {
           ans+= no_of_ways(curr+step,n);
        }
        return ans;
    }
}
