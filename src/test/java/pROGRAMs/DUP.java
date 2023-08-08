package pROGRAMs;

public class DUP {

	public static void main(String[] args) {
		String s="bharathi shali shali bharathi prema premgfgfgf";
		String[] s1 = s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(!s2.contains(s1[i]))
			{
			s2=s2+s1[i]+" ";
			}
		}
		System.out.print(s2);

	}

}
