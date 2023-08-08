package pROGRAMs;

public class dup1 {

	public static void main(String[] args) {
      String s="bharati";
      int count=0;
      for(int i=0;i<s.length();i++)
      {
    	  count=1;
    	  for(int j=i+1;j<s.length();j++)
    	  {
    		  if(s.charAt(i)==s.charAt(j))
    		  {
    			  count ++;
    			  
    		  }
    	}
    	  if(count>1) {
    	  System.out.print(s.charAt(i));
      }
	}
	}
}
