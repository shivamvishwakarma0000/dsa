import java.util.Scanner;
//public class Greeting{
//    public static void main(String[] args) {
////      int ans=sum();
////        System.out.println(ans);
////    }
////    static int sum(){
////        Scanner sc = new Scanner(System.in);
////        System.out.print("enter first number = ");
////        int a=sc.nextInt();
////        System.out.print("enter second number = ");
////        int b=sc.nextInt();
////        int sum2 =a+b;
////        return sum2;
//
//  }
//
//}

public class Greeting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name = ");
        String a=sc.next();
        System.out.print("enter your father name = ");
        String b=sc.next();

        String gre=greet(a , b);
        System.out.println(gre);
    }
    static String greet(String name,String father_name){

        String greet= name + " " + father_name;
        return greet;
    }
}