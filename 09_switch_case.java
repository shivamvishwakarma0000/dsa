import java.util.Scanner;
public class Switch{
public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.print("enter fuits name = ");
    String fruit=sc.next();

    switch(fruit){
        case "mango":
            System.out.println("king of fruits ..");
            break;
        case "papaya":
            System.out.println(" big fruits ..");
            break;
        case "grape":
            System.out.println("small fruits ..");
            break;
        case "apple":
            System.out.println("red and sweet fruits ..");
            break;
        case "orange":
            System.out.println("king of vitamin c  ..");
            break;
        default:
            System.out.println("enter vallid fruit name ");
//        case "mango" -> System.out.println("mango is king");
//        case "grape" -> System.out.println("small fruit");
//        case "apple" -> System.out.println("red fruits");
//        default -> System.out.println("enter valid fruits");
    }
}
        }