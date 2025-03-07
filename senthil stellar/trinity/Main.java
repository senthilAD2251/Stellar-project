import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=a%100;
        int c=b/10;
        if(c%3==0){
            System.out.println("TRINITY NUMBER");
        }
        else
        {
          System.out.println("NOT A TRINITY NUMBER");  
        }
    }
}