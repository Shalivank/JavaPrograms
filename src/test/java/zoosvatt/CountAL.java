package zoosvatt;
public class CountAL {
	public static void main(String[] args) {
		String s="malayalam";
		String s2="ala";
		int count=0;
		for(int i=0; i<s.length()-2;i++)
		{
			if(s2.equals(s.substring(i,i+3)))
			{
				count++;
		//		i=i+s2.length()-1;
			}	
		}
		System.out.println(count);
	}
}
