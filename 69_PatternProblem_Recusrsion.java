//public class pattern{
//    public static void main(String[] args) {
//        int n=4;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < n-i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//
//
//        }
//    }
//}


//public class pattern{
//    public static void main(String[] args) {
//        int n=5;
//        for (int i = n-1; i <n ; i--) {
//
//            if(i==0){
//                break;
//            }
//
//
//            System.out.println(" *");
//
//
//        }
//    }
//}

//
//public class triangle{
//    public static void main(String[] args) {
//        triangle(4,0);
//    }
//
//    public static void triangle(int r, int c){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//            System.out.print(" *");
//            triangle(r,c+1);
//        }else{
//            System.out.println();
//            triangle(r-1,0);
//        }
//    }
//
//
//
//
//
//    public static void triangle2(int r, int c){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//
//            triangle2(r,c+1);
//            System.out.print(" *");
//        }else{
//            triangle2(r-1,0);
//            System.out.println();
//        }
//    }
//}
//




//bubble sort using recusrion

public class bubble{
    public static void main(String[] args) {
        int [] arr={3,5,7,8,1,3,0,8};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }



    public static void bubble(int arr,int c, int r){
        if(arr[i]==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp= arr[c];
                arr[c]= arr[c+1];
                arr[c+1]=temp;

            }

            bubble(arr,r,c+1);
        }else{

            bubble(arr,r-1,0);
        }
    }
}
