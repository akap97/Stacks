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
        int res=0;
        String str=s.next();
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                st.push(i);
            else {
                st.pop(); 
       
                // Check if this length formed with base of 
                // current valid substring is more than max  
                // so far 
                if (!st.empty()) 
                    res = Math.max(res, i - st.peek()); 
       
                // If stack is empty. push current index as  
                // base for next valid substring (if any) 
                else st.push(i); 
                }
	    }
	    
	  System.out.println(res);
	 }
    }
 }
