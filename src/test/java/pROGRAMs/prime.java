package pROGRAMs;

public class prime {

	public static void main(String[] args) {
     int n=5;
     boolean flag=true;
     for(int i=2;i<n;i++)
     {
    	 if(i%n==0)
    	 {
    		 flag=false;
    		 break;
     }
     } 
     if(flag==true)
    	 {
    		 System.out.println("prime");
    	 }
    	 else
    	 {
    		 System.out.println("not");
    	 }
	}

}
