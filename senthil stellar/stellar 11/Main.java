import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int d=sc.nextInt();
	    if((m==3 && d>=21) || (m==4 && d<=19))
	    {
		System.out.println("Aries");
	    }
	    else if ((m==4 && d>=20) || (m==5 && d<=20))
	    {
	        System.out.println("Taurus");
	    }
	     else if((m==5 && d>=12) || (m==6 && d<=20))
	     {
	         System.out.println("Cancer");
	     }
	    

	}
	
}
