package pROGRAMs;

public class duplicateremove {

	public static void main(String[] args) {
    String s="bharati bharati yaligar";
    String[] s1 = s.split(" ");
    String s2="";
    for(int i=0;i<s1.length;i++)
    {
    	if(!s2.contains(s1[i]))
    	{
    		s2=s2+s1[i]+" ";
    	}
    }
    System.out.println(s2+" ");
	}

}
