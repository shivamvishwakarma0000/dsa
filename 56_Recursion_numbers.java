public class recursion{
    public static void main(String[] args) {
        func(5);
       // funcrev(5);
    }
    public static void func (int n){
        if(n==0){
            return;

        }
//
     //   System.out.println(n);
        System.out.println(n);
        func(--n);
//        func(n-1);

    }
    public static void funcrev (int n){
        if(n==0){
            return;

        }

        System.out.println(n);
        funcrev(n-1);
    }
}