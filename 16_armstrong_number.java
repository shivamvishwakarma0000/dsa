import java.util.Scanner;
public class arms{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 3 digit armStrong number = ");
        int n=sc.nextInt();
        int sum=0;

        while(n>0){

            int rem= n%10;

            int cube= rem*rem*rem;
            sum=sum+cube;
            n=n/10;

            System.out.println(sum);
        }
    }
}