import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int sum, cash ;
	cash=sc.nextInt();
	sum = cash/100;
	cash = cash%100;
	sum = sum+(cash/50);
	cash = cash%50;
	sum = sum+(cash/10);
	cash = cash%10;
	sum = sum+(cash/5);
	cash = cash%5;
	sum = sum+(cash/2);
	cash = cash%2;
	sum = sum+(cash/1);
	cash = cash%1;
	System.out.println(sum);
	}
}
