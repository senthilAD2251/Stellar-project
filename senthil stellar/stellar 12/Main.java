import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int angle = a+b+c;
		if(angle==180)
		{
		  if(a==90||b==90||c==90)
		      System.out.println("prize 3");
		  else if(a==b&&b==c)
		      System.out.println("prize 2");
		  else
		      System.out.println("prize 1");
		}
	    else
		      System.out.println("no prize");
		
	}
}
		    
	
