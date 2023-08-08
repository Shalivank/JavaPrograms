package pROGRAMs;

public class printowels {

	public static void main(String[] args) {
     String s="bharAti";
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i' )
    	 {
    		 System.out.println(s.charAt(i));
    	 }
     }
	}

}
