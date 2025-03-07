import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean f=true;
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(n-i-1))
					f=false;
		}
		System.out.println(f?"palindrome":"not palindrome");
		}

	}