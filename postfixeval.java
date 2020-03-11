import java.lang.*;
import java.util.*;
import java.io.*;
class GFG {
    
    public static int PostFix(String exp){
        Stack<Integer> st = new Stack<Integer>();
        int n = exp.length();
       
        for(int i=0; i<n; i++){
           
            if(Character.isDigit(exp.charAt(i)))
            {
                st.push(exp.charAt(i) - '0');
            } else {
                int val1 = st.pop();
                int val2 = st.pop();
                switch (exp.charAt(i)) {
                    case '+':
                        st.push(val2+val1); 
                        break;
                    case '-': 
                        st.push(val2-val1); 
                        break;
                    case '*': 
                        st.push(val2*val1); 
                        break;
                    case '/': 
                        st.push(val2/val1); 
                        break;
                }
            }
        }
        return st.pop();
    }
    
public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(PostFix(br.readLine().trim()));
		}
	}
}
