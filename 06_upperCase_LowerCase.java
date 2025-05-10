import java.util.Scanner;
public class upper{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter alphabets = ");
        char c= sc.next().trim().charAt(0);
        if(c>='a'&&c<='z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCAse");
        }
    }
}