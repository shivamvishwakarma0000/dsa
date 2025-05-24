
//here i do ceiling problem with linear search
public class ceiling{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans= Ceiling(arr,target);
        System.out.println(ans);
    }
    static int Ceiling(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target >= arr[i]) {
                return arr[i];

            }


        }

        return -1;
    }

}



