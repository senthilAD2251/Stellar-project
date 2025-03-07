import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int s=0,s1=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		        }
		        
		        
		    }
		for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        s+=arr[i][j];
		        s1+=arr[j][i];
		    }
		}
		System.out.println(s+" "+s1);
		}
		
	}
