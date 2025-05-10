//import java.util.Scanner;
//
//public class If_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//            System.out.print("enter your salary = ");
//            int salaryy = sc.nextInt();
//
//            if (salaryy > 100) {
//                salaryy += 20;
//            } else {
//                salaryy += 10;
//            }
//         System.out.println(salaryy);
//        System.out.println("you want to again check salary to another person press 1 otherwise 0");
//        int n=sc.nextInt();
//        if(n==1){
//            System.out.print("enter your salary = ");
//            int salary = sc.nextInt();
//
//            if (salary > 100) {
//                salary += 20;
//            } else {
//                salary += 10;
//            }
//            System.out.println(salary);
//        }else{
//            System.out.println("good bye !!!");
//        }
//
//
//    }
//}



import java.util.Scanner;
public class whilee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n=sc.nextInt();
        while(n<=10){
            System.out.println(n);
            n++;
        }
    }
}




