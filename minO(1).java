class GfG{
    int min;
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    if(s.isEmpty())
	        {
	            s.push(a);
	            min=a;
	        }
	   else{
	       if(a>=min)
	            s.push(a);
	       else {
	            s.push(2*a-min);
	           min=a;
	       }
	   }
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            int p=s.pop();
            if(p>=min)
                return p;
            else{
                int pop=min;
                min=2*min-p;
                return pop;
            }
            
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
                return true;
            return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.size()==0)
            return true;
        return false;
	}
}
