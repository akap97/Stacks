import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int testcases=s.nextInt();
	 for(int test=0;test<testcases;test++)
	  {
        //code here	 
        String str=s.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if( c=='{')
                st.push(c);
            else {
                if(!st.isEmpty() && st.peek()=='{')
                        st.pop();
                else st.push(c);
            }
        }
        int red_len=st.size(),m=0;
        //System.out.println("size:"+red_len);
        while(!st.isEmpty())
        {
            char p=st.pop();
            if(p=='{')
                m++;
        }
        //System.out.println("m:"+m);
        //System.out.println("ceil"+Math.ceil(m/2));
        int n=red_len-m;
         double result=Math.ceil(m/2.0)+Math.ceil(n/2.0);
        if(str.length()%2==0) 
            System.out.println((int)result);
        else
            System.out.println(-1);
            
	  }
	 }
}
