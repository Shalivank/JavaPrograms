package stringprogrmas;

public class armstrong
{
public static void main(String args[])
  {
   int n=153;
   int sum=0;
int copy=n;
   while(n!=0)
      {
        int rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
     }
 if(copy==sum)
 {
System.out.println("ArmStrong Number");
 }
 else
{
System.out.println("Not");	
}
}
}
