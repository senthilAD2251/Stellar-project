import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int sum=0,sum1=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		        if(i==j){
		            sum+=arr[i][j];
		        }
		        
		        
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=n-(i+1);j>=0;j--){
		        sum1+=arr[i][j];
		        break;
		        
		    }
		}
		System.out.println(sum);
		System.out.println(sum1);
		}
		
	}
