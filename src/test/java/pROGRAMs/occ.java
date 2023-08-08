package pROGRAMs;

public class occ{
public static void main(String args[])
{
String s="bharati";
for(int i=0;i<s.length();i++)
{
	int count=0;
for(int j=i;j<s.length();j++)
{
if(s.charAt(i)==s.charAt(j))
{
count++;
}
}

{
System.out.println(s.charAt(i)+" " +count);
}
}}}