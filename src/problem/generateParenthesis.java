package problem;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> l=new ArrayList<>();
        printParenthesis(0,0,n,"",l);
        System.out.println(l);

    }
    public static List<String> printParenthesis(int open,int close,int n,String ans,List<String> l)
    {
        if(open==n && close==n)
        {
            l.add(ans);

        }
        if(open<n)
        {
            printParenthesis(open+1,close,n,ans+"(",l);
        }
        if(close<open)
        {
            printParenthesis(open,close+1,n,ans+")",l);
        }
        return l;
    }
}
