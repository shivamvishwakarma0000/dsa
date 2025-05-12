//function overloading means have multiple function with same name but with different argument
public class overloading{
    public static void main(String[] args) {
//        fun(1,2);
//        fun(1,2,3);
//
//
//
//    static void fun(int a, int b){
//        System.out.println(a+ " " +b);
//
//    }
//    static void fun(int a, int b, int c){
//        System.out.println(a+ " " +b +" "+c);


       int ans= fun(1,2);
        System.out.println(ans);
        int anss =fun(1,2,3);
        System.out.println(anss);


    }
    static int fun(int a, int b){
    return a+b;
    }
    static int fun(int a, int b, int c){
        return a+b+c;
    }
    }
