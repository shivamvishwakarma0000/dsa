public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    static int fibonacci(int n){
       if(n<2){
           return n;
       }
      return fibonacci(n-1) + fibonacci(n-2);

    }
}


// normal fibonacci
//public class Fibonacci{
//    public static void main(String[] args) {
//        int n=10;
//        int a=0;
//        int b=1;
//        System.out.println(a);
//        System.out.println(b);
//        for (int i = 2; i <10 ; i++) {
//            int result= a+b;
//            System.out.println(result);
//            a=b;
//            b=result;
//
//
//        }
//
//    }
//}