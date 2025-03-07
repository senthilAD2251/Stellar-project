import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		        sum+=arr[i][j];
		        
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}
	System.out.println(sum);	
	}
}
