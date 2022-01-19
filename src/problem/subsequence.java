package problem;

public class subsequence {
    public static void main(String[] args) {
       String a="abc";
       printSubsequence(a,"");
    }
    public static void printSubsequence(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char c=s.charAt(0);
        printSubsequence(s.substring(1),ans);
        printSubsequence(s.substring(1),ans+c);

    }
}
