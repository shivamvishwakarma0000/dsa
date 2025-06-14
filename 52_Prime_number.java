public class prime{
    public static void main(String[] args) {
        int n=13;
        int ans=prime(n);
        System.out.println(ans);
    }
    public static void prime(int n){
        for (int i = 2; i <n ; i++) {
           if(n%i==0){
               System.out.println( "its prime number");;
           }
            System.out.println("its not prime number");;
        }
    }
}