package recusrion_index;

public class last_index {
    public static void main(String[] args) {
        int[] arr={9,2,4,5,7,2,7};
        System.out.println(lastindex(arr,0,arr.length-1));
    }

    public static int lastindex(int[] arr,int key,int n) {
        if(n<0)
        {
            return -1;
        }
        if(arr[n]==key)
        {
            return n;
        }
        return lastindex(arr,key,n-1);
    }

}
