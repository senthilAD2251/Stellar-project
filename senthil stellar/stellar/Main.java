import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt();
        char ch=sc.next().charAt(0);
        double d=sc.nextDouble();
        System.out.println("Event name "+a);
        System.out.println("Event Type "+b);
        System.out.println("Epected Count "+c);
        System.out.println("Paid Entry "+ch);
        System.out.println("Expences "+d);
    }
}