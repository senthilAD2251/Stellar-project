import java.util.*;
public class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        if(a%10==8 || a%10==3)
        {
            System.out.println("there is a winner");
        }
        else
        {
                System.out.println("there is not a winner");
        }
    
}
}