import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    float start=sc.nextInt();
	    float end=sc.nextInt();
	    float travel = end-start;
	    float petrol = travel*25;
		System.out.println("travel : "+travel);
			System.out.println("petrol : "+petrol);
	}
}
