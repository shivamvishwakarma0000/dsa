import java.util.Scanner;
public class fibonacii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a =0;
        int b =1;
        System.out.println("enter number = ");
        int n=sc.nextInt();
        for (int i = 1; i < n; i++) {
            int temp=b;
            b=a+b;
            a=temp;


        }

        System.out.println(b);
    }
}