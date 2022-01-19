package recusrion_index;

public class firstIndex {
    public static void main(String[] args) {


        int[] arr = { 4,2, 6, 8, 2, 2};
        System.out.println(first_index(arr,0,0));

    }
    public static int first_index(int[] arr,int key,int n)
    {
        if(n==arr.length)
        {
            return -1;
        }
        if(arr[n]==key)
        {
            return n;
        }
        return first_index(arr,key,n+1);
    }

}


