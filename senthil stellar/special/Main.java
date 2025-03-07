import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    
	    for(int i=a;i<=b;i++){
	        int n=i%10;
	        int m=i/10;
	        int c=n+m;
	        int d=n*m;
	        int e=c+d;
	        if(e==i){
	            System.out.println(i);
	            
	        }
	        
	    }
	    
	}
}