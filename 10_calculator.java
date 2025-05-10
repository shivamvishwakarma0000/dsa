import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of A =");
        int a=sc.nextInt();
        System.out.print("enter the value of B =");
        int b=sc.nextInt();
        System.out.print("enter operator from this + , - , * , / , %  :: ");
        String operator = sc.next();
        switch(operator){
            case "+"-> System.out.println("addition of A+B = " + (a+b));
            case "-"-> System.out.println("subtraction of A-B = " + (a-b));
            case "*"-> System.out.println("multiplication of A*B = " + (a*b));
            case "/"-> System.out.println("division of A/B = " + (a/b));
            case "%"-> System.out.println("modulo of A%B = " + (a%b));
            default -> System.out.println("enter valid operator");

        }
    }
}