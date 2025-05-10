
import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your salary = ");
        int salary =sc.nextInt();
        if(salary>100){
            salary+=20;
        }else{
            salary+=10;
        }
        System.out.println(salary);
    }
}