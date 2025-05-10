import java.util.Scanner;
public class largest{
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.print("enter first number= ");
        int a= sc.nextInt();
        System.out.print("enter second number= ");
        int b= sc.nextInt();
        System.out.print("enter third number= ");
        int c= sc.nextInt();

        System.out.print("greater number is = ");
        System.out.print(   Math.max(c,  Math.max(a,b))   );
    }

}


//import java.util.Scanner;
//public class largest{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner( System.in);
//        System.out.println("enter first number= ");
//        int a= sc.nextInt();
//        System.out.println("enter second number= ");
//        int b= sc.nextInt();
//        System.out.println("enter third number= ");
//        int c= sc.nextInt();
//        int max=a;
//        if(max<b){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//
//        }
//        System.out.println( "max number is "+max);
//    }
//
//}
